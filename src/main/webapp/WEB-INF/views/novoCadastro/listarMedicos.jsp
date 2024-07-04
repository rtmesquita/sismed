<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/login.css"/> ">
        <title>Document</title>
    </head>
    <body>
    <%@ include file="/WEB-INF/views/header.jsp" %>
    <div class="container">

        <div class="main-content">
            <div class="header">
                <h1>Médicos</h1>
            </div>
            <table class="user-table">
                <tr>
                    <th>Nome</th>
                    <th>CRM</th>
                    <th>Especialidade</th>
                </tr>
                <c:forEach var="medico" items="${medicos}">
                    <tr>
                        <td>${medico.nome}</td>
                        <td>
                                ${medico.crm}
                        </td>
                        <td>
                                ${medico.especialidade}
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

    </body>
</html>