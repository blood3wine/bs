<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页面</title>
</head>
<body>
<br>
   <h3 align = "center">注册页面</h3>
   
   <form action="${pageContext.request.contextPath}/regist">
     <div align="center">用户名：<input type="text" name="name" required><br></div>
     <div align="center">&emsp;密码：<input type="text" name="pw" required><br></div>
     
  <div align="center"> <input type="submit" value = "注册" >
<button><a href="${pageContext.request.contextPath}/tologin">返回</a> </button></div>
 </form>
</body>
</html>