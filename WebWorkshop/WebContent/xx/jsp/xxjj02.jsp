<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name = request.getParameter("user")!=null?request.getParameter("user"):"";
	String email = request.getParameter("email")!=null?request.getParameter("email"):"";
%>             
<span>xxjj02.jsp</span>           
<form method ="get" action="xxjj02.jsp">   <%//返回對應的HTML回來 所以只填上面form會因value被同變數填而返回HTML時 2個form都自動被填好  %>
	<input type="text" name="user" value="<%=name %>" />
	<input type="text" name="email" value="<%=email %>" />
	<input type="submit" value="submit" />
</form>

<form method ="post" action="xxjj03.jsp">
	<input type="text" name="user" value="<%=name %>" />
	<input type="text" name="email" value="<%=email %>" />
	<input type="submit" value="submit" />
</form>