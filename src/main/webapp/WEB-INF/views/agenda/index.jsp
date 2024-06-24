<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/agenda.css"/> ">
</head>
<body>
    <header>
        <div id="top-bar">
            <img id="logo" src="<c:url value="/static/img/logo.jpg"/>" alt="">
            <ul class="opcoes">
                <li id="opcao1"><a href="/sismed/">Home</a></li>
                <li id="opcao2"><a href="/sismed/anamnese">Anamnese</a></li>
                <li id="opcao3"><a href="/sismed/agenda">Agenda</a></li>
            </ul>

        </div>
        
        <button id="loginButton">Login</button>
    </header>
    <div class="agenda">
        
    </div>
</body>
</html>