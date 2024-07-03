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
    <header>
        <div id="top-bar">
            <img id="logo" src="<c:url value="/static/img/logo.jpg"/>" alt="">
            <ul class="menu_principal">
                <li class="opcao"><a href="/sismed/">Home</a></li>
                <li class="opcao"> Atendimento
                    <ul>
                        <li class="opcao"><a href="/sismed/atendimento">Nova Anamnese</a></li>
                        <li class="opcao"><a href="/sismed/atendimento/visualizacao">Visualizar Anamnese</a></li>
                    </ul>
                </li>
                <li class="opcao">Novo cadastro
                    <ul>
                        <li class="opcao"><a href="/sismed/novoCadastro/paciente"> Cadastrar novo paciente</a></li>
                        <li class="opcao"><a href="/sismed/novoCadastro/medico"> Cadastrar novo médico</a></li>
                    </ul>
                </li>
            </ul>

        </div>

        <button id="loginButton">Login</button>
    </header>
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
                <form class="form-group">
                    <label for="data-cadastro">Data Cadastro:</label>
                    <input type="date" id="data-cadastro" >
                </form>
                <form class="form-group">
                    <label for="queixa-principal">Queixa Principal:</label>
                    <textarea id="queixa-principal" rows="5"></textarea>
                </form>
                <form class="form-group">
                    <label>História:</label>
                    <textarea id="historia" rows="10"></textarea>
                </form>
                <form class="form-group">
                    <label for="em-tratamento-medico">Está em Tratamento Médico?</label>
                    <select id="em-tratamento-medico">
                        <option value="">Selecione...</option>
                        <option value="sim">Sim</option>
                        <option value="nao">Não</option>
                    </select>
                    
                </form>
                <form class="form-group">
                    <label for="alergia">Alergia?</label>
                    <input type="text" id="alergia" placeholder="Especifique...">
                </form>
                <form class="form-group">
                    <label for="cirurgia-recente">Cirurgia recente?</label>
                    <select id="cirurgia-recente">
                        <option value="">Selecione...</option>
                        <option value="sim">Sim</option>
                        <option value="nao">Não</option>
                    </select>
                </form>
                <form class="form-group">
                    <label for="problemas-de-pele">Problemas de Pele?</label>
                    <select id="problemas-de-pele">
                        <option value="">Selecione...</option>
                        <option value="sim">Sim</option>
                        <option value="nao">Não</option>
                    </select>
                </form>
                <form class="form-group">
                    <label for="e-gestante">É gestante?</label>
                    <select id="e-gestante">
                        <option value="">Selecione...</option>
                        <option value="sim">Sim</option>
                        <option value="nao">Não</option>
                    </select>
                </form>
                <form class="form-group">
                    <label for="e-fumante">É fumante?</label>
                    <select id="e-fumante">
                        <option value="">Selecione...</option>
                        <option value="sim">Sim</option>
                        <option value="nao">Não</option>
                    </select>
                </form>
                <button>Salvar</button>
            </div>
        </div>
        
    </div>
</body>
</html>