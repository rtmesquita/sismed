<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/header.css"/> ">
</head>
<body>
  <header>
    <div id="top-bar">
      <img id="logo" src="<c:url value="/static/img/logo.jpg"/>" alt="">
      <ul class="menu_principal">
        <span style="padding-left: 30px">${user.nome}</span>
        <li class="opcao"><a href="/sismed/">Home</a></li>
        <div class="" id="opcaoAtendimento">
          <li class="opcao"> Atendimento
            <ul>
              <li class="opcao"><a href="/sismed/atendimento/cadastrarPage">Nova Anamnese</a></li>
              <li class="opcao"><a href="/sismed/atendimento/visualizarPage">Visualizar Anamnese</a></li>
            </ul>
          </li>
        </div>
        <div class="" id="opcaoCadastro">
          <li class="opcao">Novo cadastro
            <ul>
              <li class="opcao"><a href="/sismed/novoCadastro/paciente"> Cadastrar novo paciente</a></li>
              <li class="opcao"><a href="/sismed/novoCadastro/medico"> Cadastrar novo médico</a></li>
            </ul>
          </li>
        </div>
        <div class="" id="opcaoUsuario">
          <li class="opcao">Usuário
            <ul>
              <li class="opcao"><a href="/sismed/usuario/cadastrarPage"> Cadastrar novo usuário</a></li>
              <li class="opcao"><a href="/sismed/usuario/visualizarPage"> Listar usuários</a></li>
            </ul>
          </li>
        </div>
      </ul>
    </div>
    <a href="/sismed/deslogar"><button id="loginButton">Logout</button></a>
  </header>
  <script>
    if (${user.isMedico.equals("0")}) {
      document.getElementById('opcaoAtendimento').classList.add('escondido');
    }

    if (${user.isUsuario.equals("0")}) {
      document.getElementById('opcaoCadastro').classList.add('escondido');
    }

    if (${user.isAdmin.equals("0")}) {
      document.getElementById('opcaoUsuario').classList.add('escondido');
    }
  </script>
</body>