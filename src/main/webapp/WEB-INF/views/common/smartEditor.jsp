<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<% request.setCharacterEncoding("UTF-8");%>
<% response.setContentType("text/html; charset=UTF-8");%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KIVIEW &mdash; 글쓰기</title>

<!-- css -->
<link rel="stylesheet" href="<c:url value='/resources/css/notice_write.css'/>">
<%-- <jsp:include page="<c:url value='/WEB-INF/board/boardInsert.jsp'/>">
 --%>

<!-- js -->

<!-- SmartEditor2 라이브러리  --> content:
<script type="text/javascript" src="<c:url value='/se2/js/HuskyEZCreator.js'/>" charset="utf-8"></script>
<script type="text/javascript" src="http//code.jquery.com/jquery-1.11.0.min.js"></script>

</head>
<body>

<!-- SmartEditor2  -->
<div class="jsx-2303464893 editor">
	<div class="fr-box fr-basic fr-top" role="application">
		<div class="fr-wrapper show-placeholder" dir="auto" style="overflow: scroll;">
			<textarea name="content" id="content"
				style="width: 100%; height: 412px;"></textarea>
		</div>
	</div>
</div>


</body>
</html>

<!-- SmartEditor2 -->
<%-- <script type="text/javascript" src = "<c:url value='/resources/js/notice-write.js'/>"></script>
 --%><script>

</script>