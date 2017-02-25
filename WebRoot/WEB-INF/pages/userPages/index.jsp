<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="/sh/css/index.css">

  </head>
  
  <body>
	<!--页头-->
	<div id="header" class="header">
	    <div id="menu" class="menu">
	        <ul class="menulist">
	            <li><a href="#">首页</a></li>
	            <li><a href="#">教师介绍</a></li>
	            <li><a href="#">相关书籍</a></li>
	            <li><a href="#">电子教程</a></li>
	        </ul>
	    </div>
	</div>
	<!--欢迎-->
	<div id="welcome" class="welcome">
	    <p>欢迎访问软件工程学习网站！</p>
	</div>
	<!--页面内容-->
	<div id="content" class="content">
	
	    <!--内容左侧部分-->
	    <div id="content-left" class="content-left">
	        <div id="login" class="login">
	            <form action="#">
	                <label>用户名：</label>
	                <input type="text" name="name"/><br/>
	                <label>密  码：</label>
	                <input type="password" name="pwd"/><br/>
	                &nbsp;&nbsp;
	                <input type="button" value="登录">&nbsp;&nbsp;
	                <input type="button" value="取消">
	            </form>
	        </div>
	    </div>
	
	    <!--内容右侧部分-->
	    <div id="content-right" class="content-right">
	        <div id="title" class="title">
	            课程介绍>>
	        </div>
	        <hr/>
	        <div id="text" class="text">
	            <p>
	                他强调，新机场建设涉及10多个村的群众搬迁安置，这是一项重要民生工程，要在标准和质量上把好关。要贯彻公开、公正、公平的原则，保障被安置群众利益，使搬迁安置的每个环节都让群众放心。
	
	                之后，习近平来到新机场主航站楼建设工地考察。在新机场主航站楼2层工地平台，正在施工作业的工程建设人员热情向总书记问好，习近平同大家握手表示慰问。看到施工现场井井有条，得知施工实现了零事故，习近平表示肯定。他说，这么大这么复杂的工程，井井有条而且迄今为止零事故，很不容易，很辛苦，要精益求精，善始善终。
	
	                他强调，新机场是首都的重大标志性工程，是国家发展一个新的动力源，必须全力打造精品工程、样板工程、平安工程、廉洁工程。每个项目、每个工程都要实行最严格的施工管理，确保高标准、高质量。要努力集成世界上最先进的管理技术和经验。
	                他强调，北京城市规划建设和北京冬奥会筹办工作是当前和今后一个时期北京市的两项重要任务，要认真贯彻党中央决策部署，坚持首善标准，解放思想、开阔思路，求真务实、攻坚克难，统筹生产、生活、生态，立足提高治理能力抓好城市规划建设，着眼精彩非凡卓越筹办好北京冬奥会，努力开创首都发展更加美好的明天。
	            </p>
	        </div>
	    </div>
	</div>
	<!--页脚-->
	<div id="footer" class="footer">
	    <p>版权所有</p>
	</div>
  </body>
</html>
