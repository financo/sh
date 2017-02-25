<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>booklist</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <s:iterator var="book" value="#lst">
    	<div id="banner">
    		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
    			<tr height="180px">
    				<td align="left">
    					<table width="100%" height="100%" border="0" align="center" callpadding="0" cellspacing="0">
	    					<tr height="40px">
	    						<td width="100px">书籍名称：</td>
	    						<td>
	    							<s:property value="#book.name"/>
	    						</td>
	    					</tr>
    						<tr >
	    						<td width="100px">内容介绍：</td>
	    						<td>
	    							<s:property value="#book.description"/>
	    						</td>
	    					</tr>
    					</table>
    				</td>
    				<td width="200px">
    					<img src="<s:property value='#book.path'/>" width="100%" height="100%">
    				</td>
    			</tr>
    		</table>
    	</div>
    </s:iterator>
  </body>
</html>
