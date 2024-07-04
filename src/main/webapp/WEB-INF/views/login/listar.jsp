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
                    <h1>Usuários</h1>
                </div>
                <table>
                    <tr>
                        <th>Nome</th>
                        <th>Usuário</th>
                        <th>Perfil</th>
                    </tr>
                    <c:forEach var="user" items="${users}">
                        <tr>
                            <td>${user.nome}</td>
                            <td>
                                ${user.login}
                            </td>
                            <td>
                                <c:if test="${not empty user.role}">
                                    ${user.role}
                                </c:if>
                                <c:if test="${empty user.role}">
                                    Pefil não informado.
                                </c:if>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>

    </body>
</html>