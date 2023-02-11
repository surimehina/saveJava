package com.pratice.text1;

public class ShoppingCart {
    private int goodsID;
    private String goodsName;
    private double goodsPrice;
    private int goodsInventory;

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "goodsID=" + goodsID +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsInventory=" + goodsInventory +
                '}';
    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(int goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public ShoppingCart(int goodsID, String goodsName, double goodsPrice, int goodsInventory) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsInventory = goodsInventory;
    }

    public ShoppingCart() {
    }
}
