<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% 	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=basePath%>css/index.css">
<link rel="stylesheet" href="<%=basePath%>bootstrap/css/bootstrap.min.css">
</head>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.validate.js" ></script>
<script type="text/javascript" src="<%=basePath%>layer/layer.js"></script>
<body>

	<table>
		<tr>
			<td colspan="10">学生信息列表</td>
		</tr>
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td>性别</td>
			<td>爱好</td>
			<td>班级</td>
			<td>
				<button onclick="toAdd()">添加</button>
			</td>
		</tr>
		<c:forEach items="${slist }" var="s" varStatus="v">
			<tr>
				<td>${v.count }</td>
				<td>${s.sname }</td>
				<td>${s.sex }</td>
				<td>${s.hobby }</td>
				<td>${s.grade.gname }</td>
				<td>
					<c:if test="${s.status==0 }">
						<button onclick="creatHTML(${s.sid})">生成HTML</button>
					</c:if>
					<c:if test="${s.status==1 }">
						<button onclick="javascript:lookHTML('<%=basePath%>stu/lookHTML?sid=${s.sid}','','',700,300,'','','')">查看HTML</button>
						<%-- <button onclick="lookHTML(${s.sid})">查看HTML</button> --%>
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
<script type="text/javascript">
	function toAdd(){
		location.href="<%=basePath%>stu/toAdd";
	}
	function creatHTML(sid){
		$.ajax({
			url:"<%=basePath%>stu/creatHTML",
			type:"post",
			data:{sid:sid},
			success:function(obj){
				if(obj){
					layer.msg("生成HTML成功", {time:1000, icon:6, shift:6},function(){
						location.href="<%=basePath%>stu/toStuList";
					});
				}else{
					layer.msg("生成HTML失败", {time:1000, icon:5, shift:6},function(){});
				}
			},dataType:"json"
		});
	}
	
	<%-- function lookHTML(sid){
		location.href="<%=basePath%>stu/lookHTML?sid="+sid;
	} --%>
	
	function lookHTML(theURL,winName,features,width,hight,scrollbars,top,left) 
	{
	  var parameter="top="+top+",left="+left+",width="+width+",height="+hight;
	  if(scrollbars=="no")
	 {parameter+=",scrollbars=no";}
	  else
	 {parameter+=",scrollbars=yes";}
		  window.open(theURL,winName,parameter);
	}

</script>
</html>