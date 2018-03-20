package com.guigu.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.blservice.GoodsaddBL;



@Controller
@Scope("singleton")

public class GoodsaddAction {

    @Autowired()
    @Qualifier("goodsaddBL")
   private GoodsaddBL goodsaddBL;
   
   @RequestMapping("/goodsadd.action")
   public String add(String goodsname,double goodstock,double unitprice,String picture,double salestate,HttpServletResponse response){
	   
       try {
    	   PrintWriter out = response.getWriter();
        int result=this.goodsaddBL.findgoodsadd(goodsname, goodstock, unitprice, picture, salestate);
        if (result>0) {
        	out.print("yes");
        }else {
            out.print("no");
        }
        out.flush();
        out.close();
        
    } catch (Exception e) {
        
        e.printStackTrace();
    }
       
       return null;	     
   }
}


