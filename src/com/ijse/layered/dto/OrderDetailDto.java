/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ijse.layered.dto;

/**
 *
 * @author Anjana
 */
public class OrderDetailDto {
    private String itemCode;
    private int qty;
    private int discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String itemCode, int qty, int discount) {
        this.itemCode = itemCode;
        this.qty = qty;
        this.discount = discount;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "itemCode=" + itemCode + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
}
