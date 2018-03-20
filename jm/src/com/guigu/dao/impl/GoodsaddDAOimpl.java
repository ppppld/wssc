
package com.guigu.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.guigu.dao.GoodsaddDAO;



public class GoodsaddDAOimpl implements GoodsaddDAO {

    private SqlSessionTemplate sqlSessionTemplate;
    
    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    @Override
    public int add(String goodsname,double goodstock,double unitprice,String picture,double salestate) throws Exception { 
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("goodsname", goodsname);
        map.put("goodstock", goodstock);
        map.put("unitprice", unitprice);
        map.put("picture", picture);
        map.put("salestate", salestate);
        return this.sqlSessionTemplate.insert("goodsadd.findgoodsadd", map);
    }
}


