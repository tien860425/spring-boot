<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name = request.getParameter("user")!=null?request.getParameter("user"):"";
	String email = request.getParameter("email")!=null?request.getParameter("email"):"";
%>
<span>xxjj03.jsp</span>
<form method ="get" action="xxjj02.jsp">
	<input type="text" name="user" value="<%=name %>" />
	<input type="text" name="email" value="<%=email %>" />
	<input type="submit" value="submit" />
</form>

<form method ="post" action="xxjj02.jsp">
	<input type="text" name="user" value="<%=name %>" />
	<input type="text" name="email" value="<%=email %>" />
	<input type="submit" value="submit" />
</form>