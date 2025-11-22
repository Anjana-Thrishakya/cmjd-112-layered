/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.dao;

import com.ijse.layered.dao.custom.impl.CustomerDaoImpl;
import com.ijse.layered.dao.custom.impl.ItemDaoImpl;
import com.ijse.layered.dao.custom.impl.OrderDaoImpl;
import com.ijse.layered.dao.custom.impl.OrderDetailDaoImpl;

/**
 *
 * @author Anjana
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;
    
    private DaoFactory(){
        
    }
    
    public static DaoFactory getInstance(){
        if(daoFactory ==  null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case ITEM:
                return new ItemDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ORDER:
                return new OrderDaoImpl();
            case ORDER_DETAIL:
                return new OrderDetailDaoImpl();
            default:
                throw new AssertionError();
        }
    }
    
    public enum DaoTypes{
        ITEM, CUSTOMER, ORDER, ORDER_DETAIL
    }
    
}
