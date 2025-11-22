/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.dao.custom.impl;

import com.ijse.layered.dao.custom.ItemDao;
import com.ijse.layered.entity.ItemEntity;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class ItemDaoImpl implements ItemDao{

    @Override
    public boolean save(ItemEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ItemEntity search(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        return null;
    }
    
}
