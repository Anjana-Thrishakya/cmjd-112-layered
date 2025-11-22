/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.service.custom.impl;

import com.ijse.layered.dto.CustomerDto;
import com.ijse.layered.entity.CustomerEntity;
import com.ijse.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity entity = getCustomerEntity(customerDto);
        return null;
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity entity = getCustomerEntity(customerDto);
        return null;
    }

    @Override
    public String deleteCustomer(String code) throws Exception {
        return null;
    }

    @Override
    public CustomerDto searchCustomer(String code) throws Exception {
        CustomerEntity customerEntity = null;
        if (customerEntity != null) {
            return getCustomerDto(customerEntity);
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAll() throws Exception {

        ArrayList<CustomerDto> dtos = new ArrayList<>();
        ArrayList<CustomerEntity> itemEntities = null;

        for (CustomerEntity entity : itemEntities) {
            dtos.add(getCustomerDto(entity));
        }

        return dtos;
    }

    private CustomerEntity getCustomerEntity(CustomerDto dto) {
        return new CustomerEntity(dto.getCustId(),
                dto.getTitle(), dto.getName(), dto.getDob(),
                dto.getSalary(), dto.getAddress(), dto.getCity(),
                dto.getProvince(), dto.getPostalCode());
    }

    private CustomerDto getCustomerDto(CustomerEntity entity) {
        return new CustomerDto(entity.getCustId(),
                entity.getTitle(), entity.getName(), entity.getDob(),
                entity.getSalary(), entity.getAddress(), entity.getCity(),
                entity.getProvince(), entity.getPostalCode());
    }

}
