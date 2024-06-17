<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../../../static/css/login.css">
</head>
<body>
    <header>
        <img id="logo" src="../../../static/img/logo.jpg" alt="">
        
    </header>
    <div class="container">
        
        <div class="login-box">
            <div id="usuário">
                <label for="Usuário">Usuário</label>
                <input type="text" id="usuário-box">
    
            </div>
            <!--� preciso colocar a senha para escrever em asteristico com
             alguma api no futuro para melhor seguran�a-->
            <div id="senha">
                <label for="senha">Senha</label>
                <input type="password" id="senha-box">
            </div>

            <button id="login-button">Login</button>
    
        </div>
    </div>
</body>
</html>