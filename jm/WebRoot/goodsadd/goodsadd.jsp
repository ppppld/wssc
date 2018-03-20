<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="../lay/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="../lay/css/user.css" media="all" />
	<title>系统登录</title>
	
	<script type="text/javascript" src="jquery-1.6.2.js"></script>
	<script type="text/javascript">
		
		$(document).ready(function(){ 
	    $("#goodsname").blur(function(){ 
			if ($(this).val()=="") { 
			    $("#goodsname_msg").css("color","#FF0000");
			    $("#goodsname_msg").css("display","inline");
			    $("#goodsname_msg").html("商品名不能为空");
			    $("#test2").val("false");
			} else {
			    $("#goodsname_msg").css("color","#000000");
			    $("#goodsname_msg").css("display","none");
			    $("#test2").val("true");
			    json.data={
	        		goodsname:$("#goodsname").val()
	        	};
				$.ajax(json);
			}
		});
	});
	
	
	$(document).ready(function(){ 
	    $("#unitprice").blur(function(){ 
			if ($(this).val()=="") { 
			    $("#unitprice_msg").css("color","#FF0000");
			    $("#unitprice_msg").css("display","inline");
			    $("#unitprice_msg").html("单价不能为空");
			    $("#test3").val("false");
			} else {
			    $("#unitprice_msg").css("color","#000000");
			    $("#unitprice_msg").css("display","none");
			    $("#test3").val("true");
			}
		});
	});
	
	$(document).ready(function(){ 
	    $("#goodstock").blur(function(){ 
			if ($(this).val()=="") { 
			    $("#goodstock_msg").css("color","#FF0000");
			    $("#goodstock_msg").css("display","inline");
			    $("#goodstock_msg").html("库存不能为空");
			    $("#test4").val("false");
			} else {
			    $("#goodstock_msg").css("color","#000000");
			    $("#goodstock_msg").css("display","none");
			    $("#test4").val("true");
			}
		});
	});
				
  

	
	</script>
</head>
<body>
    <form id="form"  action="goodsadd.action" method="post">
        <div class="layui-form-item" style="margin-top:60px">
        <span class="layui-form-label">商品名称:</span><input id="goodsname" name="goodsname" type="text" class="layui-input" style="width:250px;"/><span id="goodsname_msg" style="display:none;width:150px;margin-left:60px"></span><br/><br/>
        <span class="layui-form-label">商品单价:</span><input id="unitprice" name="unitprice" type="text" class="layui-input" style="width:250px;"/><span id="unitprice_msg" style="display:none;margin-left:60px"></span><br/><br/>
        <span class="layui-form-label">商品库存:</span><input id="goodstock" name="goodstock" type="text" class="layui-input" style="width:250px;"/><span id="goodstock_msg" style="display:none;margin-left:60px"></span><br/><br/>
        <span class="layui-form-label">商品服务端链接:</span><input id="picture" name="picture" type="text" class="layui-input" style="width:250px;"/><br/><br/>
	    <span class="layui-form-label">打折信息（九五折填0.95）:</span><input id="salestate" name="salestate" type="text" class="layui-input" style="width:250px;"/>
	    </div>
	    
		
	    
		</div>
	    <div class="layui-form-item" style="margin-left:40px">
        <input id="enter_submit" type="submit" value="录入 " class="layui-btn layui-btn-normal"/>  <input type="reset" name="button" id="button" value="重置"  class="layui-btn layui-btn-normal"/><br/><br/>
       <input type="button" class="layui-btn layui-btn-normal" value="返回" onclick="javascript:window.history.back(-1);" >
       </div>
       <input id="test2" name="test2" type="text" value="false" style="display:none;"/>
       <input id="test3" name="test3" type="text" value="false" style="display:none;"/>
       <input id="test4" name="test4" type="text" value="false" style="display:none;"/>
       
    </form>
</body>
</html>