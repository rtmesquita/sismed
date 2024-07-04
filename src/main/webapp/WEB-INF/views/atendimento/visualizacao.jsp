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
                    <h1>Detalhes do Atendimento</h1>
                </div>
                <div class="form-container">
                    <p><strong>Paciente:</strong> ${atendimento.paciente.nome}</p>
                    <p><strong>Médico:</strong> ${atendimento.medico.nome}</p>
                    <p><strong>Queixa:</strong> ${atendimento.queixa}</p>
                    <p><strong>Histórico:</strong> ${atendimento.historia}</p>
                    <p><strong>Tratamento Médico:</strong> ${atendimento.tratamentoMedico ? "Sim" : "Não"}</p>
                    <p><strong>Alergia:</strong> ${atendimento.alergia}</p>
                    <p><strong>Cirurgia:</strong> ${atendimento.cirurgia ? "Sim" : "Não"}</p>
                    <p><strong>Gestante:</strong> ${atendimento.gestante ? "Sim" : "Não"}</p>
                    <p><strong>Fumante:</strong> ${atendimento.fumante ? "Sim" : "Não"}</p>
                    <p><strong>Data de Atendimento:</strong> ${atendimento.dataAtendimento}</p>
                </div>
            </div>
        </div>

    </body>
</html>