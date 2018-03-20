package com.guigu.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.blservice.GoodsBL;
import com.guigu.model.Goods;

@Controller
public class GoodsAction {
	  @Autowired()
	  @Qualifier("manOrderBL")
	  private GoodsBL goodsbl;
	  @RequestMapping("/goodsdel/querry.action")
	  public String querry(HttpServletRequest request,HttpServletResponse response) throws Exception{  
		  response.setCharacterEncoding("utf-8");
		  response.setContentType("text/html;charset=utf-8");
		  PrintWriter out=response.getWriter();
		  List<Goods> goods=this.goodsbl.querry();
		  
		    out.print(goods);
			out.flush();
			out.close();
			return null;	  
	  }
	  
	  @RequestMapping("/goodsdelete.action")
	     public String order(long formid,HttpServletResponse response) throws Exception{  
	      
	         response.setCharacterEncoding("utf-8");
			  response.setContentType("text/html;charset=utf-8");
	         this.goodsbl.goodsdelete(formid);


	         return null;
}
}
