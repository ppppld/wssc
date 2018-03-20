package com.guigu.blservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.guigu.blservice.GoodsBL;
import com.guigu.dao.GoodsDAO;
import com.guigu.model.Goods;

public class GoodsBLimpl implements GoodsBL {

	@Autowired()
    @Qualifier("manOrderDAOimpl")
	private GoodsDAO goodsDAO;

	
	
	public GoodsDAO getGoodsDAO() {
		return goodsDAO;
	}



	public void setGoodsDAO(GoodsDAO goodsDAO) {
		this.goodsDAO = goodsDAO;
	}



	@Override
	public List<Goods> querry() throws Exception {

		return this.goodsDAO.querry();
	}



	@Override
	public void goodsdelete(long formid) throws Exception {
		this.goodsDAO.goodsdelete(formid);
		
	}
	
}
