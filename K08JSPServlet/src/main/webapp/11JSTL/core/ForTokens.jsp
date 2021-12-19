<%@page import="org.w3c.dom.css.RGBColor"%>
<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>JSTL - forTokens</title>
</head>
<body>
<%
String rgba = "Red,Green,Blue,Black";
%>
<!-- 
	forTokens 태그의 속성
	items : 구분자의

 -->
<h4>JSTL의 forTokens 태그 사용</h4>
<c:forTokens items="<%= rgba %>" delims="," var="color">
	<span style="color:${ color };">${ color }</span> <br>
</c:forTokens>

<h4>StringTokenizer 클래스 사용</h4>
<%
//문자열과 구분자를 인자로 생성자를 통한 객체 생성
StringTokenizer tokens= new StringTokenizer(rgba, ",");
out.println("토큰수 : "+ tokens.countTokens() +"<br>");
//인출할 토큰이 있는지 확인
while(tokens.hasMoreTokens()){
	//해당 루프의 토큰을 인출한다.
	String token = tokens.nextToken();
	out.println(token +"<br>");
}
%>


<h4>String 클래스의 split() 메소드 사용</h4>
<%
String[] colorArr = rgba.split(",");
for(String s : colorArr){
	out.println(s + "<br>");
}
%>
</body>
</html>