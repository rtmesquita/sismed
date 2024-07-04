<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%--    <link rel="stylesheet" type="text/css" href="../../..${pageContext.request.contextPath}/static/css/home.css">--%>

    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/home.css"/>">
    <title>Document</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>

    <div id="central-box">
        <H1>Seja Bem vindo</H1>
        <h2>Faça Login para continuar</h2>
    </div>
</body>>
</html>