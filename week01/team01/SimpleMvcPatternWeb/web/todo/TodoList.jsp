<%@ page
        language="java"
        contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>TODO 목록</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
<h1 class="text-center">TODO 목록 조회</h1>
<div class="center-block"  style="width:400px;">
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th class="text-center">번호</th>
            <th class="text-center">내용</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="todoData" items="${todoList}" varStatus="status">
            <tr>
                <td class="text-center">${status.count}</td>
                <td>${todoData}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>