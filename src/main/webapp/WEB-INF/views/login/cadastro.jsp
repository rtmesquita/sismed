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
            Cadastrar Usuário
        </div>
        <form action="/sismed/usuario/cadastrar" method="post">
            <div class="campo">
                <label class="campo-box" for="nome-box">Nome</label>
                <input type="text" id="nome-box" name="nome">
            </div>
            <div class="campo">
                <label class="campo-box" for="usuário-box">Usuário</label>
                <input type="text" id="usuário-box" name="login">
            </div>
            <div class="campo">
                <label class="campo-box" for="senha-box">Senha</label>
                <input type="password" id="senha-box" name="password">
            </div>
            <div class="campo">
                <label class="campo-box" for="perfil-box">Perfil</label>
                <select name="role" id="perfil-box">
                    <option type="text" value="SECRETARIO">Secretário</option>
                    <option type="text" value="MEDICO">Médico</option>
                    <option type="text" value="ADMIN">Administrador</option>
                </select>
            </div>
            <button class="campo campo-box">Salvar</button>
        </form>

    </div>
</div>
</body>
</html>