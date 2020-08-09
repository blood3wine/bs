<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>删除页面</title>
</head>
<body>
   <h3 align = "center">删除页面</h3>
   <div align="center">${msg}</div>
<br>
<table align="center" border="2">
<tr>
<td width="50" align="center" id="title">id</td>
<td width="100" align="center" id="title">名称</td>
<td width="150" align="center" id="title">价格</td>
<td width="150" align="center" id="title">备注</td>
</tr>
  <form action="${pageContext.request.contextPath}/deleteW">
    <div align="center"><input type="text" name="id"  placeholder="根据id删除 "  >
    <input type="submit" value="删除">
    <button><a href="${pageContext.request.contextPath}/main">返回</a> </button></div>
</form>
<br>
<c:forEach items="${list}" var="Goods" >  
        <tr>  <td align = "center">${Goods.id}</td>
             <td align = "center">${Goods.price}</td>
             <td align = "center">${Goods.name}</td>
             <td align = "center">${Goods.bz}</td>
         </tr>  
</c:forEach>


</table>

</body>
</html>