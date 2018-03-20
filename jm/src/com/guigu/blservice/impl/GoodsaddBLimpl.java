package com.guigu.blservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.guigu.blservice.GoodsaddBL;
import com.guigu.dao.GoodsaddDAO;



public class GoodsaddBLimpl implements GoodsaddBL{
    @Autowired()
    @Qualifier("goodsaddDAOimpl")
    
    private GoodsaddDAO goodsaddDAO;
    
    public GoodsaddDAO getGoodsaddDAO() {
        return goodsaddDAO;
    }

    public void setGoodsaddDAO(GoodsaddDAO goodsaddDAO) {
        this.goodsaddDAO = goodsaddDAO;
    }



    @Override
    public int findgoodsadd(String goodsname, double goodstock, double unitprice, String picture, double salestate)
            throws Exception {
        
        return this.goodsaddDAO.add(goodsname, goodstock, unitprice, picture, salestate);
    }


    
    

    
    
}


