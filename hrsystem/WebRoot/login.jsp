<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/public.css" />
	<link rel="stylesheet" type="text/css" href="css/page.css" />
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/public.js"></script>
	<script type="text/javascript">
	function ipout(nameobj){
		var xmlhttp;
		if (window.XMLHttpRequest)
		  {// code for IE7+, Firefox, Chrome, Opera, Safari
		  xmlhttp=new XMLHttpRequest();
		  }
		else
		  {// code for IE6, IE5
		  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		  }
		xmlhttp.open("post", "yanzheng.action",true);
		xmlhttp.send("name="+nameobj.value+"&r"+Math.random());
		xmlhttp.onreadystatechange=function()
		  {
		  if (xmlhttp.readyState==4 && xmlhttp.status==200)
		    {
		    document.getElementById("sid").innerHTML=xmlhttp.responseText;
		    }
		  }
	}
	</script>
  </head>
  
  <body>
	<!-- 登录页面头部 -->
	<div class="logHead">
		<img src="images/logLOGO.png" />
	</div>
	<!-- 登录页面头部结束 -->

	<!-- 登录body -->
	<div class="logDiv">
		<img class="logBanner" src="images/logBanner.png" />
		<div class="logGet">
			<!-- 头部提示信息 -->
			<div class="logD logDtip">
				<p class="p1">登录</p>
				<p class="p2">管理人员登录</p>
			</div>
			<!-- 输入框 -->
			<form action="ToIndex.action" method="post">
			<div class="lgD">
				<img class="img1" src="images/logName.png" /><input type="text"
					name="aduser" placeholder="输入用户名" />
			</div>
			<div class="lgD">
				<img class="img1" src="images/logPwd.png" /><input type="text"
					name="adpwd" placeholder="输入用户密码" />
			</div><%--
			<div class="lgD logD2">
			<form id="lgform" action="yanzheng.action" method="post"></form>
			
			<input class="getYZM" name="name" id="lgdip" size="5" maxlength="4" onblur="ipout(this)"/>
				<div class="logYZM">
					<a href="login.jsp"><img class="yzm" border="0" src="logcheck.action" ></a>
					<span id="sid"></span>
				</div>	
			<p> <%=request.getAttribute("info") %>	
			</div>

			--%><div class="logC">
				<%--<button>登 录</button>--%>
				<input class="submit" type="submit" value="登 录"/>
				</div>
			</form>
		</div>
	</div>
	<!-- 登录body  end -->

	<!-- 登录页面底部 -->
	<div class="logFoot">
		<p class="p1">版权所有：lala人事管理系统</p>
		<p class="p2">lala人事管理系统 登记序号：xxxxxxx-xxx</p>
	</div>
	<!-- 登录页面底部end -->
  </body>
</html>
