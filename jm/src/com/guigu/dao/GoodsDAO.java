package com.guigu.dao;

import java.util.List;

import com.guigu.model.Goods;

public interface GoodsDAO {
	public List<Goods>  querry()  throws Exception;
	public void goodsdelete(long formid)throws Exception;
}
