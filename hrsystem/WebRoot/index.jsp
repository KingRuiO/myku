<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>人事管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
    <link type="text/css" rel="stylesheet" media="all" href="css/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="css/global_color.css" /> 
  </head>
  
    <body class="index">
        <!--导航区域开始-->
        <div id="index_navi">
            <ul id="menu">
                <li><a href="index.jsp" class="index_on"></a></li>
                <li><a href="role/role_list.html" class="role_off"></a></li>
                <li><a href="YuanGong.action" class="admin_off"></a></li>
                <li><a href="fee/fee_list.html" class="fee_off"></a></li>
                <li><a href="account/account_list.html" class="account_off"></a></li>
                <li><a href="service/service_list.html" class="service_off"></a></li>
                <li><a href="bill/bill_list.html" class="bill_off"></a></li>
                <li><a href="report/report_list.html" class="report_off"></a></li>
                <li><a href="user/user_info.html" class="information_off"></a></li>
                <li><a href="user/user_modi_pwd.html" class="password_off"></a></li>
            </ul>
        </div>
    </body>
</html>
