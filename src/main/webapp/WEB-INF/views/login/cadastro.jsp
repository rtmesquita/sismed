<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/cadastro.css"/> ">
</head>
<body>
<header>
    <img id="logo" src="<c:url value="/static/img/logo.jpg"/>" alt="">


</header>
<div class="container">

    <div class="cadastro-box">
        <div id="titulo">
            Cadastrar
        </div>
        <div id="usuário">
            <label for="Usuário">Usuário</label>
            <input type="text" id="usuário-box">

        </div>

        <div id="senha">
            <label for="senha">Senha</label>
            <input type="password" id="senha-box">
        </div>

        <button id="cadastro-button">Cadastrar</button>

    </div>
</div>
</body>
</html>