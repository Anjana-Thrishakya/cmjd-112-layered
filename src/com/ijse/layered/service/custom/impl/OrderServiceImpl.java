/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.service.custom.impl;

import com.ijse.layered.dao.DaoFactory;
import static com.ijse.layered.dao.DaoFactory.DaoTypes.ORDER_DETAIL;
import com.ijse.layered.dao.custom.ItemDao;
import com.ijse.layered.dao.custom.OrderDao;
import com.ijse.layered.dao.custom.OrderDetailDao;
import com.ijse.layered.db.DBConnection;
import com.ijse.layered.dto.OrderDetailDto;
import com.ijse.layered.dto.OrderDto;
import com.ijse.layered.entity.ItemEntity;
import com.ijse.layered.entity.OrderDetailEntity;
import com.ijse.layered.entity.OrderEntity;
import com.ijse.layered.service.custom.OrderService;
import java.sql.Connection;

/**
 *
 * @author Anjana
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
    private OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER_DETAIL);
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto orderDto) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);

            OrderEntity orderEntity = new OrderEntity(orderDto.getOrderId(),
                    orderDto.getDate(), orderDto.getCustId());
            if (orderDao.save(orderEntity)) {

                boolean isOrderDetailSaved = true;

                for (OrderDetailDto orderDetailDto : orderDto.getOrderDetailDtos()) {
                    OrderDetailEntity orderDetailEntity = new OrderDetailEntity(orderDto.getOrderId(),
                            orderDetailDto.getItemCode(), orderDetailDto.getQty(), orderDetailDto.getDiscount());
                    if (!orderDetailDao.save(orderDetailEntity)) {
                        isOrderDetailSaved = false;
                    }
                }

                if (isOrderDetailSaved) {

                    boolean isItemUpdated = true;
                    
                    for (OrderDetailDto orderDetailDto : orderDto.getOrderDetailDtos()) {
                        ItemEntity itemEntity = itemDao.search(orderDetailDto.getItemCode());
                        if(itemEntity != null){
                            itemEntity.setQoh(itemEntity.getQoh() - orderDetailDto.getQty());
                            if(!itemDao.update(itemEntity)){
                                isItemUpdated = false;
                            }
                        } else {
                            connection.rollback();
                            return "Item Not Found";
                        }
                    }
                    
                    if(isItemUpdated){
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Item Update Error";
                    }
                    
                } else {
                    connection.rollback();
                    return "Order Detail Save Error";
                }

            } else {
                connection.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }

    }

}
