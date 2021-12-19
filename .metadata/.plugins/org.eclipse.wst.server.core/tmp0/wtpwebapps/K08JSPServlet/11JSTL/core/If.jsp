<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="UTF-8">
<title>JSTL - if</title>
</head>
<!--
 if 태그 : 조건을 확인하여 실행여부를 판단한다 
속성정리
	test : EL을 이용해서 조건식을 삽입한다.
	var : test에서 판단된 결과값이 저장된다.	
-->
<body>
<!--변수 선언  -->
<c:set var="number" value="100"/>
<c:set var="string" value="JSP" />

<h4>JSTL의 if 태그로 짝수/홀수 판단하기</h4>
<!--  
	if(number % 2 == 0) 와 동일한 조건의 if문으로
	해당 조건의 결과가 result에 저장된다.
-->
<c:if test="${ number mod 2 eq 0 }" var="result">
	${ number }는 짝수입니다. <br> <!--결과가 true이므로 출력됨  -->
	</c:if>
result : ${ result } <br> <!--true가 출력됨  -->

<!--
	JSTL의 if태그는 else 구문이 따로 없으므로 두개의 if태그를
	통해 else와 같이 사용해야 한다.
	만약 여러개의 조건을 사용할 경우라면 choose태그를 사용하는게 좋다.
  -->

<h4>문자열 비교와 else 구문 흉내내기</h4>
<!--
	EL에서는 eq를 통해 정수 및 문자열에 대한 비교가 가능하다.
	특히 문자열의 경우 compareTo()와 같이 사전순으로 비교한다.
  -->
<c:if test="${ string eq 'Java' }" var="result2"> <!-- result2는 false -->
	문자열은 Java입니다. <br/>
</c:if>
<c:if test="${ not result2 }">
	'Java'가 아닙니다 <br/>
</c:if>


<h4>조건식 주의사항</h4>
<c:if test="100" var="result3">
EL이 아닌 정수를 지정하면 false
</c:if>
result 3 : ${result3 }<br>
<c:if test="tRuE" var="result4">
대소문자 구분없이 "tRuE"인 경우 true <br>
</c:if>
result 4 : ${result4 }<br>
<c:if test="${ true }" var="result5">
	EL 양쪽에 빈 공백이 있는 경우 false <br>
</c:if>
result 5 : ${result5 }<br>

<h4>연습문제 : if태그</h4>
	<!-- 
	아이디, 패스워드를 입력후 submit 한후 EL식을 통해 파라미터로 받은후
	"kosmo", "1234" 인 경우에는 "kosmo님 하이룽~" 이라고 출력한다. 

	만약 틀렸다면 "아이디와 비번을 확인하세요" 를 출력한다. 
	EL과 JSTL의 if태그만을 이용해서 구현하시오.
	 -->
	<form method="get">
		아이디 : <input type="text" name="user" />
		<br />
		패스워드 : <input type="text" name="pass" />
		<br />
		<input type="submit" value="로그인" />
	</form>	
	<c:if test="${ not empty param.user }">
		전송된 아이디 : ${param.user }
		<br />
		전송된 패스워드 : ${param.pass }
		<br />
		
		<!--아이디, 패스워드의 일치여부를 판단한 후 result에 결과를 저장한다.
			두번째 if문에서 not을 이용해서 else 구문을 만들면 된다.
		 -->
		<c:if test="${param.user=='kosmo' and param.pass eq '1234' }" var="result">
		${param.user }님, 하이루~!
		</c:if>
		<c:if test="${not result }">
			아이디와 비번을 확인하세요
		</c:if>
	</c:if>
	
	
	<h4>연습문제</h4>
	<!-- 
	연습문제] 아래 모양을 출력하시오. 단 JSTL의 forEach문과 if문을 
	활용하시오.
	1 0 0 0 0
	0 1 0 0 0
	0 0 1 0 0
	0 0 0 1 0
	0 0 0 0 1
	-->
	<c:forEach begin="1" end="5" var="i">
		<c:forEach begin="1" end="5" var="j">
			<c:if test="${i eq j }" var="result">
			1&nbsp;
			</c:if>
			<c:if test="${not result }">
			0&nbsp;
			</c:if>
		</c:forEach>
		<br>
	</c:forEach>
	
	<h4>연습문제02</h4>
	<!--앞의 문제를 choose~when~otherwise문으로 변경하시오  -->
	
	<c:forEach begin="1" end="5" var="i">
		<c:forEach begin="1" end="5" var="j">
		<c:choose>
		<c:when test="${i eq j }">
					1&nbsp;
				</c:when>
				<c:otherwise>
				 	0&nbsp;
				</c:otherwise>
		</c:choose>
		</c:forEach>
		<br>
	</c:forEach>
	
	
	<h4>구구단 출력하기</h4>
	<!-- 
	JSTL의 forEach문을 이용하여 구구단을 출력하시오.
		table태그를 사용해야 하고, 짝수행에 마우스 오버시 빨간색으로
		홀수행에 마우스 오버시 노란색으로 바뀌게 코드를 작성하시오.
	-->
	<table border=1>
	<c:forEach begin="2" end="9" var="dan" varStatus="gugudan">
		<c:choose>
			<c:when test="${gugudan.count mod 2 eq 0 }">
				<c:set var="color" value="red" />
			</c:when>
			<c:otherwise>
				<c:set var="color" value="yellow" />
			</c:otherwise>
		</c:choose>

	<tr onmouseover="this.style.backgroundColor='yellow';"
			onmouseout="this.style.backgroundColor='white';">
	<c:forEach begin="1" end="9" var="su">
		<td>${dan }*${su }=${dan*su }</td>
	</c:forEach>
</c:forEach>
	</table>




</body>
</html>