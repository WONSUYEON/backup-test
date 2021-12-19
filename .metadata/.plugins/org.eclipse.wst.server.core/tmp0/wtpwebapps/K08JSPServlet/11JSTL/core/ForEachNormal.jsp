<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>JSTL -forEach 1</title>
</head>
<body>
	<!--
	forEach 태그의 일반for문의 형태
		속성] begin : 시작값
			end : 종료값
			step : 증가치(제외할 경우 1로 고정됨)
			var : 반복시 사용할 변수
	  -->
	<h4>일반 for문 형태의 forEach 태그</h4>
	<!-- 총 3번 반복하는 문장  -->
	<c:forEach begin="1" end="3" step="1" var="i">
	<p>반복 ${i }입니다</p>
	</c:forEach>
	
	<!--
		일반 for문에서의 varStatus 속성
			: 반복과 관련된 정보를 추상화한 클래스를 통해 정보를 반환한다.
			count : 실제횟수 반복(1~마지막)
			index : 변수 i의 변화하는 값
			first : loop의 처음에 true 반환
			last :loop의 마지막에 true 반환
			current : 현재 loop의 변수값(var 속성에 지정된 변수)
	  -->
	<h4>varStatus 속성 살펴보기</h4>
	<table border="1">
	<c:forEach begin="3" end="5" var="i" varStatus="loop" >
		<tr>
			<td>count : ${ loop.count }</td>
			<td>index : ${ loop.index }</td>
			<td>current : ${ loop.current }</td>
			<td>first : ${ loop.first }</td>
			<td>last : ${ loop.last }</td>
		</tr>
	</c:forEach>
	</table>
	
	<h4>1에서 100까지 정수 중 홀수의 합</h4>
	<c:forEach begin="1" end="100" var="j">
		<c:if test="${ j mod 2 ne 0 }">
			<c:set var="sum" value="${sum +j }"/>
		</c:if>
	</c:forEach>
	1~100 사이의 정수 중 홀수의 합은? ${ sum }
</body>
</html>