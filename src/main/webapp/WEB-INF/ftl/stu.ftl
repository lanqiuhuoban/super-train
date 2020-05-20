<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${basePath}css/index.css">
<link rel="stylesheet" href="${basePath}bootstrap/css/bootstrap.min.css">
</head>
<script type="text/javascript" src="${basePath}js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${basePath}bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${basePath}My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="${basePath}js/jquery.validate.js" ></script>
<body>
	<table>
		<tr>
			<td colspan="10">学生信息页面</td>
		</tr>
		<tr>
			<td>ID</td><td>${stu.sid}</td>
		</tr>
		<tr>
			<td>姓名</td><td>${stu.sname}</td>
		</tr>
		<tr>
			<td>性别</td><td>${stu.sex}</td>
		</tr>
		<tr>
			<td>爱好</td><td>${stu.hobby}</td>
		</tr>
		<tr>
			<td>班级</td><td>${stu.grade.gname}</td>
		</tr>
	</table>
</body>
</html>