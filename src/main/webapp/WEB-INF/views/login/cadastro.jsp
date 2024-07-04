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
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container">

    <div class="cadastro-box">
        <div id="titulo">
            Cadastrar
        </div>
        <form action="/sismed/usuario/cadastrar" method="post">
            <div id="senha">
                <label for="nome-box">Nome</label>
                <input type="text" id="nome-box" name="nome">
            </div>
            <div id="usuário">
                <label for="usuário-box">Usuário</label>
                <input type="text" id="usuário-box" name="login">
            </div>
            <div id="senha">
                <label for="senha-box">Senha</label>
                <input type="password" id="senha-box" name="password">
            </div>
            <div id="usuário">
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