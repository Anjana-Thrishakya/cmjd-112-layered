/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.controller;

import com.ijse.layered.dto.OrderDto;
import com.ijse.layered.service.ServiceFactory;
import com.ijse.layered.service.custom.OrderService;

/**
 *
 * @author Anjana
 */
public class OrderController {
    private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.ORDER);
    
    public String placeOrder(OrderDto orderDto) throws Exception{
        return orderService.placeOrder(orderDto);
    }
}
