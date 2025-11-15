/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.service.custom.impl;

import com.ijse.layered.dto.ItemDto;
import com.ijse.layered.entity.ItemEntity;
import com.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class ItemServiceImpl implements ItemService{

    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity entity = new ItemEntity(itemDto.getCode(), itemDto.getDesc(), itemDto.getPack(),
                itemDto.getPrice(), itemDto.getQoh());
        return null;
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        ItemEntity entity = new ItemEntity(itemDto.getCode(), itemDto.getDesc(), itemDto.getPack(),
                itemDto.getPrice(), itemDto.getQoh());
        return null;
    }

    @Override
    public String deleteitem(String code) throws Exception {
        return null;
    }

    @Override
    public ItemDto searchItem(String code) throws Exception {
        ItemEntity entity = null;
        if(entity != null){
            return new ItemDto(entity.getCode(), entity.getDesc(), entity.getPack(),
                    entity.getPrice(), entity.getQoh());
        }
        return null;
    }

    @Override
    public ArrayList<ItemDto> getAll() throws Exception {
        ArrayList<ItemDto> dtos = new ArrayList<>();
        ArrayList<ItemEntity> itemEntities = null;
        
        for (ItemEntity entity : itemEntities) {
            ItemDto dto = new ItemDto(entity.getCode(), entity.getDesc(), entity.getPack(),
                    entity.getPrice(), entity.getQoh());
            dtos.add(dto);
        }
        
        return dtos;
    }
    
}
