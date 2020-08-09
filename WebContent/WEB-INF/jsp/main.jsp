<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<body>
<div align="center">
  当前用户：${USER_SESSION.name} 登陆成功
  <button><a href="${pageContext.request.contextPath}/logout">登出</a></button></div>
<br>
<table align="center" border="2">
<tr>
<td width="100" align="center" id="title">商品名称</td>
<td width="150" align="center" id="title">价格</td>
<td width="100" align="center" id="title">备注</td>
</tr>


  <form action="${pageContext.request.contextPath}/main">
    <div align="center">
    <input type="text" name="name"  placeholder="根据商品名称搜索"  >
    <input type="submit" value="搜索">
    <button><a href="${pageContext.request.contextPath}/toinsertW">添加商品</a> </button>
     <button><a href="${pageContext.request.contextPath}/todeleteW">删除商品</a> </button></div>
   
</form>
<br>
<c:forEach items="${list}" var="Goods" >  
        <tr>  
             <td align = "center">${Goods.name}</td>
             <td align = "center">${Goods.price}</td>
             <td align = "center">${Goods.bz}</td>
         </tr>  
</c:forEach>

  
</table>

</body>
</html>