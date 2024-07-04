<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/atendimento.css"/> ">
</head>
<body>
    <%@ include file="/WEB-INF/views/header.jsp" %>
    <div class="container">
        
        <div class="main-content">
            <div class="header">
                <h1>Atendimento</h1>
                <div class="user-info">
                    <img src="https://via.placeholder.com/30" alt="Usuário">
                    <span>Nome | Empresa de Teste</span>
                    <button class="fechar">FECHAR</button>
                    <span>CLIENTE</span>
                </div>
            </div>
            <div class="form-container">
                <h2>Preencher Nova Ficha</h2>
                <form class="form-group" action="/sismed/atendimento/cadastrar" method="post">
                    <label>Paciente:</label>
                        <select name="idPaciente">
                            <option value="${null}">Selecione...</option>
                            <c:forEach items="${atendimentoDTO.pacientes}" var="paciente">
                                <option value="${paciente.id}">${paciente.nome}</option>
                            </c:forEach>
                        </select>

                    <label>Médico:</label>
                    <select name="idMedico" id="medico">
                        <option value="${null}">Selecione...</option>
                        <c:forEach items="${atendimentoDTO.medicos}" var="medico">
                            <option value="${medico.id}">${medico.nome}</option>
                        </c:forEach>
                    </select>

                    <label for="queixa-principal">Queixa Principal:</label>
                    <textarea name="queixa" id="queixa-principal" rows="5"></textarea>

                    <label>História:</label>
                    <textarea name="historia" id="historia" rows="10"></textarea>

                    <label for="em-tratamento-medico">Está em Tratamento Médico?</label>
                    <select name="tratamentoMedico" id="em-tratamento-medico">
                        <option value="">Selecione...</option>
                        <option value="1">Sim</option>
                        <option value="0">Não</option>
                    </select>
                    <label for="alergia">Alergia?</label>
                    <input name="alergia" type="text" id="alergia" placeholder="Especifique...">

                    <label for="cirurgia-recente">Cirurgia recente?</label>
                    <select name="cirurgia" id="cirurgia-recente">
                        <option value="">Selecione...</option>
                        <option value="1">Sim</option>
                        <option value="0">Não</option>
                    </select>

                    <label for="e-gestante">É gestante?</label>
                    <select name="gestante" id="e-gestante">
                        <option value="">Selecione...</option>
                        <option value="1">Sim</option>
                        <option value="0">Não</option>
                    </select>

                    <label for="e-fumante">É fumante?</label>
                    <select name="fumante" id="e-fumante">
                        <option value="">Selecione...</option>
                        <option value="1">Sim</option>
                        <option value="0">Não</option>
                    </select>

                    <button>Salvar</button>
                </form>
            </div>
        </div>
        
    </div>
</body>
</html>