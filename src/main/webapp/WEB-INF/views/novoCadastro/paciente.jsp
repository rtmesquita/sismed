<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%--    <link rel="stylesheet" type="text/css" href="../../..${pageContext.request.contextPath}/static/css/home.css">--%>

        <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/novoCadastro.css"/> ">
        <title>Document</title>
    </head>
    <body>
        <%@ include file="/WEB-INF/views/header.jsp" %>
        <div class="container">
            <div class="cadastro-box">
                <div id="titulo">
                    Cadastrar Paciente
                </div>
                <form action="/sismed/paciente/cadastrar" method="post">
                    <div class="campo">
                        <label class="campo-box" for="nome-box">Nome</label>
                        <input type="text" id="nome-box" name="nome">
                    </div>
                    <div class="campo">
                        <label class="campo-box" for="sexo">Sexo</label>
                        <select name="sexo" id="sexo">
                            <option value="">Selecione...</option>
                            <option value="F">Feminino</option>
                            <option value="M">Masculino</option>
                            <option value="O">Outros</option>
                        </select>
                    </div>
                    <div class="campo">
                        <label class="campo-box" for="data-nascimento">Data Nascimento</label>
                        <input name="dataNascimento" type="date" id="data-nascimento" >
                    </div>
                    <button class="campo campo-box">Salvar</button>
                </form>

            </div>
        </div>
    </body>
</html>