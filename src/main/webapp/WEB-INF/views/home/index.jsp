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
<div class="container">
    <div id="central-box">
        <H1 style="margin-top: 150px">Sejam Bem Vindos ao SisMed</H1>
        <div class="agenda">
            <img id="ilustracao" src="<c:url value="/static/img/calendario.png"/>"  alt=" ">
            <h1>Atualizações futuras: <br>Criação e integração de uma agenda</h1>
            <h3>imagem meramente ilustrativa</h3>
        </div>
    </div>
</div>
</body>
</html>