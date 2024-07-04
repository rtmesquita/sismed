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
        <form action="/sismed/auth/register" method="post">
            <div id="usuário">
                <label for="usuário-box">Usuário</label>
                <input type="text" id="usuário-box" name="login">
            </div>
            <div id="senha">
                <label for="senha-box">Senha</label>
                <input type="password" id="senha-box" name="password">
            </div>
            <div id="usuário">
<%--                <label for="usuário-box">Perfil</label>--%>
<%--                <input type="text" id="role-box" name="role">--%>
                <label for="perfil-box">Perfil</label>
                <select name="role" id="perfil-box">
                    <option type="text" value="SECRETARIO">Secretário</option>
                    <option type="text" value="MEDICO">Médico</option>
                    <option type="text" value="ADMIN">Administrador</option>
                </select>
            </div>
            <%
            %>
            <input id="login-button" type="submit" value="Submit">
        </form>

    </div>
</div>
</body>
</html>