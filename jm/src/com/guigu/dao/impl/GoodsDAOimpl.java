package com.guigu.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.guigu.dao.GoodsDAO;
import com.guigu.model.Goods;

public class GoodsDAOimpl implements GoodsDAO {

	 private SqlSessionTemplate sqlSessionTemplate;
	    
	    public SqlSessionTemplate getSqlSessionTemplate() {
	        return sqlSessionTemplate;
	    }

	    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
	         this.sqlSessionTemplate = sqlSessionTemplate;
	    }
	    
	@Override //查询数据库
	public List<Goods> querry() throws Exception {
		
		return this.sqlSessionTemplate.selectList("goods.querry");
	}

	@Override//删除商品
	public void goodsdelete(long formid) throws Exception {
		
		Map<String,Object> map=new HashMap<String, Object>();
        map.put("formid", formid);
		
        this.sqlSessionTemplate.selectList("goods.goodsdelete", map);
		
	}
	
	
	
}
