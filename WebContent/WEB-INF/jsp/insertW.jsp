<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加页面</title>
</head>
<body>
<br>
   <h3 align = "center">添加页面</h3>
   <div align="center">${msg}</div>
   <form action="${pageContext.request.contextPath}/insertW">
     <div align="center"><input type="text" name="name" placeholder="名称" required><br></div>
     <div align="center"><input type="text" name="price" placeholder="价格" required><br></div>
     <div align="center"><input type="text" name="bz" placeholder="备注" required><br></div>
  <br>
  <div align="center"> <input type="submit" value = "添加" >
<button><a href="${pageContext.request.contextPath}/main">返回</a> </button></div>
 </form>
</body>
</html>