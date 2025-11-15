/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.controller;

import com.ijse.layered.dto.ItemDto;
import com.ijse.layered.service.ServiceFactory;
import com.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class ItemController {
    
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.ITEM);
    
    public String saveItem(ItemDto itemDto) throws Exception{
        return itemService.saveItem(itemDto);
    }
    
    public ArrayList<ItemDto> getAll() throws Exception{
        return itemService.getAll();
    }
    
    public ItemDto searchItem(String code) throws Exception{
        return itemService.searchItem(code);
    }
    
}
