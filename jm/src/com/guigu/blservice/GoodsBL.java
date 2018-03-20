package com.guigu.blservice;

import java.util.List;

import com.guigu.model.Goods;


public interface GoodsBL {
	public List<Goods> querry() throws Exception;
	public void goodsdelete(long formid)throws Exception;
}
