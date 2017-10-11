<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <script language="javascript" type="text/javascript">
        //显示角色详细信息
        function showDetail(flag, a) {
            var detailDiv = a.parentNode.getElementsByTagName("div")[0];
            if (flag) {
                detailDiv.style.display = "block";
            }
            else
                detailDiv.style.display = "none";
        }
        //重置密码
        function resetPwd() {
            alert("请至少选择一条数据！");
            //document.getElementById("operate_result_info").style.display = "block";
        }
        //删除
        function deleteAdmin() {
            var r = window.confirm("确定要删除此员工信息吗？");
            window.location.href="DeleteYuanGong.action?";
            document.getElementById("operate_result_info").style.display = "block";
        }
        //全选
        function selectAdmins(inputObj) {
            var inputArray = document.getElementById("datalist").getElementsByTagName("input");
            for (var i = 1; i < inputArray.length; i++) {
                if (inputArray[i].type == "checkbox") {
                    inputArray[i].checked = inputObj.checked;
                }
            }
        }
    </script>
  </head>
  
  <body>
     <!--Logo区域开始-->
     <div id="header">
         <img src="../images/logo.png" alt="logo" class="left"/>
         <a href="#">[退出]</a>            
     </div>
     <!--Logo区域结束-->
     <!--导航区域开始-->
     <div id="navi">                        
         <ul id="menu">
             <li><a href="index.jsp" class="index_off"></a></li>
             <li><a href="role/role_list.html" class="role_off"></a></li>
             <li><a href="YuanGong.action" class="admin_on"></a></li>
             <li><a href="fee/fee_list.html" class="fee_off"></a></li>
             <li><a href="account/account_list.html" class="account_off"></a></li>
             <li><a href="service/service_list.html" class="service_off"></a></li>
             <li><a href="bill/bill_list.html" class="bill_off"></a></li>
             <li><a href="report/report_list.html" class="report_off"></a></li>
             <li><a href="user/user_info.html" class="information_off"></a></li>
             <li><a href="user/user_modi_pwd.html" class="password_off"></a></li>
         </ul>            
     </div>
     <!--导航区域结束-->
     <!--主要区域开始-->
     <div id="main">
         <form action="" method="">
             <!--查询-->
             <div class="search_add">
                 <div>
                     模块：
                     <select id="selModules" class="select_search">
                         <option>全部</option>
                         <option>角色管理</option>
                         <option>员工管理</option>
                         <option>资费管理</option>
                         <option>账务账号</option>
                         <option>业务账号</option>
                         <option>账单管理</option>
                         <option>报表</option>
                     </select>
                 </div>
                 <div>角色：<input type="text" value="" class="text_search width200" /></div>
                 <div><input type="button" value="搜索" class="btn_search"/></div>
                 <input type="button" value="密码重置" class="btn_add" onclick="resetPwd();" />
                 <input type="button" value="增加" class="btn_add" onclick="location.href='admin_add.html';" />
             </div>
             <!--删除和密码重置的操作提示-->
             <div id="operate_result_info" class="operate_fail">
                 <img src="../images/close.png" onclick="this.parentNode.style.display='none';" />
                 <span>删除失败！数据并发错误。</span><!--密码重置失败！数据并发错误。-->
             </div> 
             <!--数据区域：用表格展示数据-->     
             <div id="data">            
                 <table id="datalist">
                     <tr>
                         <th class="th_select_all">
                             <input type="checkbox" onclick="selectAdmins(this);" />
                             <span>全选</span>
                         </th>
                         <th>员工ID</th>
                         <th>姓名</th>
                         <th>性别</th>
                         <th>年龄</th>
                         <th>电话</th>
                         <th class="width100">地址</th>
                         <th>入职日期</th>
                         <th>职位</th>
                         <th>工资</th>
                         <th colspan="2">操作</th>
                         <th></th>
                     </tr>                      
                     <c:forEach items="${Yglist}" var="ygtab">
                     	<tr>
                     		<td><input name="selectid" type="checkbox" /></td>
                     		<td>${ygtab.ygNo}</td>
                     		<td>${ygtab.yName}</td>
                     		<td>${ygtab.ySex}</td>
                     		<td>${ygtab.yAge}</td>
                     		<td>${ygtab.yPhone}</td>
                     		<td>${ygtab.yAddress}</td>
                     		<td>${ygtab.yHiredate}</td>
                     		<td>${ygtab.yJob}</td>
                     		<td>${ygtab.ySal}</td>
                     		<td class="td_modi">
                     			<a href="DeleteYuanGong.action?ygNo=${ygtab.ygNo}">删除</a>
                     			<a>修改</a>
                     		<%--
                             <input type="button" value="修改" class="btn_modify" onclick="location.href='admin_modi.html';" />
                             <input type="button" value="删除" class="btn_delete" onclick="deleteAdmin();" />
                         	--%></td>
                     	</tr>
                     </c:forEach>
                     
                     <%--<tr>
                         <td><input type="checkbox" /></td>
                         <td>1</td>
                         <td>贾强</td>
                         <td>admin</td>
                         <td>13077332357</td>
                         <td>jiaqiang123@qq.com.cn</td>
                         <td>2011-31-12</td>
                         <td>
                             <a class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);">超级管理员...</a>
                             <!--浮动的详细信息-->
                             <div class="detail_info">
                                 超级管理员，角色管理员，账单管理员，报表管理员，业务账号管理员，账务账号管理员，aa，bb
                             </div>
                         </td>
                         <td class="td_modi">
                             <input type="button" value="修改" class="btn_modify" onclick="location.href='admin_modi.html';" />
                             <input type="button" value="删除" class="btn_delete" onclick="deleteAdmin();" />
                         </td>
                     </tr>--%>
                     
                 </table>
             </div>
             <!--分页-->
             <div id="pages">
     	        <a href="#">上一页</a>
                 <a href="#" class="current_page">1</a>
                 <a href="#">2</a>
                 <a href="#">3</a>
                 <a href="#">4</a>
                 <a href="#">5</a>
                 <a href="#">下一页</a>
             </div>                    
         </form>
     </div>
     <!--主要区域结束-->
     <div id="footer">
         <p>[啊喇叭喇叭巴拉拉]</p>
         <p>版权所有(C)</p>
     </div>
  </body>
</html>
