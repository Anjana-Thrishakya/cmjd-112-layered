/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ijse.layered.service.custom;

import com.ijse.layered.dto.OrderDto;
import com.ijse.layered.service.SuperService;

/**
 *
 * @author Anjana
 */
public interface OrderService extends SuperService{
    public String placeOrder(OrderDto orderDto) throws Exception;
}
