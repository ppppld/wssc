package com.guigu.model;

public class Goods {
	private long goodsid;
    private String goodsname;
    private double goodstock;
    private double unitprice;
    private String picture;
    private double salestate; 
    
    public long getGoodsid() {
        return goodsid;
    }
    public void setGoodsid(long goodsid) {
        this.goodsid = goodsid;
    }
    public String getGoodsname() {
        return goodsname;
    }
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }
    public double getGoodstock() {
        return goodstock;
    }
    public void setGoodstock(double goodstock) {
        this.goodstock = goodstock;
    }
    public double getUnitprice() {
        return unitprice;
    }
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public double getSalestate() {
        return salestate;
    }
    public void setSalestate(double salestate) {
        this.salestate = salestate;
    }
}
