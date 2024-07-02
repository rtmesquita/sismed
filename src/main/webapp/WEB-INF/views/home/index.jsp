<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%--    <link rel="stylesheet" type="text/css" href="../../..${pageContext.request.contextPath}/static/css/home.css">--%>

    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/home.css"/> ">
    <title>Document</title>
</head>
<body>
<header>
    <div id="top-bar">
        <img id="logo" src="<c:url value="/static/img/logo.jpg"/>" alt="">
        <ul class="opcoes">
            <li class="opcao"><a href="/sismed/">Home</a></li>
            <li class="opcao"><a href="/sismed/atendimento">Anamnese</a></li>
            <li class="opcao"><a href="/sismed/agenda">Agenda</a></li>
        </ul>

    </div>

    <button id="loginButton">Login</button>
</header>

<div id="central-box">
    <H1>Seja Bem vindo</H1>
    <h2>Faça Login para continuar</h2>
</div>
</body>
</html>