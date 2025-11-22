/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.dao.custom.impl;

import com.ijse.layered.dao.CrudUtil;
import com.ijse.layered.dao.custom.ItemDao;
import com.ijse.layered.entity.ItemEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Anjana
 */
public class ItemDaoImpl implements ItemDao{

    @Override
    public boolean save(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate(
                "INSERT INTO item VALUES(?,?,?,?,?)", 
                t.getCode(), t.getDesc(), 
                t.getPack(), t.getPrice(), 
                t.getQoh());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate(
                "UPDATE Item SET Description =?, PackSize = ?, UnitPrice=?, QtyOnHand = ? WHERE ItemCode = ?", 
                t.getDesc(), 
                t.getPack(), t.getPrice(), 
                t.getQoh(),t.getCode());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate(
                "DELETE FROM Item WHERE ItemCode = ?", id);
    }

    @Override
    public ItemEntity search(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item WHERE ItemCode = ?", id);
        if(rst.next()){
            return new ItemEntity(rst.getString("ItemCode"),
                    rst.getString("Description"), 
                    rst.getString("PackSize"),
                    rst.getDouble("UnitPrice"), 
                    rst.getInt("QtyOnHand"));
        }
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item");
        ArrayList<ItemEntity> itemEntities = new ArrayList<>();
        while (rst.next()) {            
            itemEntities.add(new ItemEntity(rst.getString("ItemCode"),
                    rst.getString("Description"), 
                    rst.getString("PackSize"),
                    rst.getDouble("UnitPrice"), 
                    rst.getInt("QtyOnHand")));
        }
        return itemEntities;
    }
    
}