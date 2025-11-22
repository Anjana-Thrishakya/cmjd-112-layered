/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.dao.custom.impl;

import com.ijse.layered.dao.CrudUtil;
import com.ijse.layered.dao.custom.OrderDao;
import com.ijse.layered.entity.OrderEntity;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean save(OrderEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO Orders VALUES(?,?,?)", 
               t.getOrderId(), t.getDate(), t.getCustId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public OrderEntity search(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        return null;
    }
    
}
