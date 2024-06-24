<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/login.css"/> ">
</head>
<body>
    <header>
        <img id="logo" src="<c:url value="/static/img/logo.jpg"/>" alt="">

        
    </header>
    <div class="container">

        <div class="login-box">
            <div id="titulo">
                Login
            </div>
            <div id="usuário">
                <label for="Usuário">Usuário</label>
                <input type="text" id="usuário-box">
    
            </div>
            <!--� preciso colocar a senha para escrever em asteristico com
             alguma api no futuro para melhor seguran�a-->
            <div id="senha">
                <label for="senha">Senha</label>
                <input type="password" id="senha-box">
            </div>

            <button id="login-button">Login</button>
    
        </div>
    </div>
</body>
</html>