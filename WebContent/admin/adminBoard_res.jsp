<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>다잇닭</title>
    <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
    <script defer src="${pageContext.request.contextPath}/resources/admin/js/readminMemberInfo.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin/css/adminMain.css">
    <script src="${pageContext.request.contextPath}/resources/admin/js/adminBoard.js"></script>
</head>
<body>
    <main class="test">
        <div class="section-container">
    	<%@ include file="aside.jsp" %>

            <div class="main-container">
                문의글 답변 페이지
            </div>

        </div>
    </main>
</body>
</html>