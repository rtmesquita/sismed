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
                    <h1>Selecione o atendimento</h1>
                    <span>${atendimentos}</span>
                </div>
                <div class="form-container">
                    <div class="select-container">
                        <label for="medicos">Médicos</label>
                        <c:forEach items="${medicos}" var="medico">
                        <select id="medicos" class="select-option">
                            <option value="${null}">Selecione...</option>
                            <option value="${medico.id}">${medico.nome}</option>
                        </select>
                        </c:forEach>

                        <label for="pacientes">Pacientes</label>
                        <c:forEach items="${pacientes}" var="paciente">
                            <select id="pacientes" class="select-option">
                                <option value="${null}">Selecione...</option>
                                <option value="${paciente.id}">${paciente.nome}</option>
                            </select>
                        </c:forEach>

                        <label for="datas">Datas</label>
                        <select id="datas" class="select-option">
                            <option value="option7">Option 7</option>
                            <option value="option8">Option 8</option>
                            <option value="option9">Option 9</option>
                        </select>
                    </div>
                </div>
            </div>
            <div id="detalheAtendimento" class="main-content-detalhe">
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
    <script>
        var detalheEscondido = true;

        if (detalheEscondido) {
            document.getElementById('detalheAtendimento').classList.add('escondido');
        } else {
            document.getElementById('detalheAtendimento').classList.remove('escondido');
        }
    </script>
</html>