<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=basePath%>css/index.css">
<link rel="stylesheet"
	href="<%=basePath%>bootstrap/css/bootstrap.min.css">
</head>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.2.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.validate.js"></script>
<script type="text/javascript" src="<%=basePath%>layer/layer.js"></script>
<body>

	<form>
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><input type="radio" name="sex" value="男">男 <input
					type="radio" name="sex" value="女">女</td>
			</tr>
			<tr>
				<td>爱好：</td>
				<td><input type="checkbox" name="hobby" value="篮球">篮球 <input
					type="checkbox" name="hobby" value="游泳">游泳 <input
					type="checkbox" name="hobby" value="LOL">LOL</td>
			</tr>
			<tr>
				<td>班级：</td>
				<td><select name="gid">
						<c:forEach items="${glist }" var="g">
							<option value="${g.gid }">${g.gname}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="10"><input type="button" onclick="add()"
					value="添加"> <input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>

<script type="text/javascript">
	function add(){
		$.ajax({
			url:"<%=basePath%>stu/addStu",
			type:"post",
			data:$("form").serialize(),
			success:function(obj){
				if(obj){
					layer.msg("添加成功", {time:1000, icon:6, shift:6},function(){
						location.href="<%=basePath%>stu/toStuList";
					});
				} else {
					layer.msg("添加失败", {
						time : 1000,
						icon : 5,
						shift : 6
					}, function() {
					});
				}
			},
			dataType : "json"
		});
	}
</script>
</html>