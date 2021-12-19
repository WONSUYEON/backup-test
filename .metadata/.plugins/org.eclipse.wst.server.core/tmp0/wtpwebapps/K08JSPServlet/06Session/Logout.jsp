<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.removeAttribute("UserId");
session.removeValue("UserName");

session.invalidate();

response.sendRedirect("LoginForm.jsp");
%>
