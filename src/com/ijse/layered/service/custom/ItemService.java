/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ijse.layered.service.custom;

import com.ijse.layered.dto.ItemDto;
import com.ijse.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public interface ItemService extends SuperService{
    
    public String saveItem(ItemDto itemDto) throws Exception;
    public String updateItem(ItemDto itemDto) throws Exception;
    public String deleteitem(String code) throws Exception;
    public ItemDto searchItem(String code) throws Exception;
    public ArrayList<ItemDto> getAll() throws Exception;
    
}
