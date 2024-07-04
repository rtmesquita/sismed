<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/atendimento.css"/> ">
        <title>Document</title>
    </head>
    <body>
    <%@ include file="/WEB-INF/views/header.jsp" %>
    <div class="container">
        <div class="main-content">
            <div class="header">
                <h1>Selecione a data</h1>
            </div>
            <div class="form-container">
                <div class="select-container">
                    <form action="/sismed/atendimento/receberData" method="post">
                        <div class="campo">
                            <label class="campo-box" for="medicos">Datas</label>
                            <select id="medicos" class="select-option" name="id">
                                <option value="${null}">Selecione...</option>
                                <c:forEach items="${atendimentos}" var="atendimento">
                                    <option value="${atendimento.id}">${atendimento.dataAtendimento}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <button class="campo campo-box">Filtrar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>