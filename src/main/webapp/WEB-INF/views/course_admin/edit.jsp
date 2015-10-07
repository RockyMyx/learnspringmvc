<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>添加课程</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/course/save" method="post">
		<div>课程名称：<input type="text" id="title" name="title" /></div>
		<div>课程等级：<input type="text" id="level" name="level" /></div>
		<div>课程人数：<input type="text" id="learningNum" name="learningNum" /></div>
		<input type="submit" value="提交" />
	</form>
</body>
</html>