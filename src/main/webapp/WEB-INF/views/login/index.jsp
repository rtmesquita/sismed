<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

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
            <form action="logar" method="post">
                <div id="usuário">
                    <label for="usuário-box">Usuário</label>
                    <input type="text" id="usuário-box" name="login">
                </div>
                <div id="senha">
                    <label for="senha-box">Senha</label>
                    <input type="password" id="senha-box" name="password">
                </div>
                <input id="login-button" type="submit" value="Submit">
            </form>
        </div>
    </div>
</body>
</html>