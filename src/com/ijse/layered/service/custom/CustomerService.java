/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ijse.layered.service.custom;

import com.ijse.layered.dto.CustomerDto;
import com.ijse.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public interface CustomerService extends SuperService{
    
    public String saveCustomer(CustomerDto customerDto) throws Exception;
    public String updateCustomer(CustomerDto customerDto) throws Exception;
    public String deleteCustomer(String code) throws Exception;
    public CustomerDto searchCustomer(String code) throws Exception;
    public ArrayList<CustomerDto> getAll() throws Exception;
}
