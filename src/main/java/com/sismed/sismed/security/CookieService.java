package com.sismed.sismed.security;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Arrays;
import java.util.Optional;

public class CookieService {
    public static void setCookie(HttpServletResponse httpServletResponse, String chave, String valor, int tempoExpiracao) {
        Cookie cookie = new Cookie(chave, valor);
//        tempoExpiracao em segundos
        cookie.setMaxAge(tempoExpiracao);
        httpServletResponse.addCookie(cookie);
    }

    public static void updateCookie(HttpServletResponse httpServletResponse, Cookie cookie, String valor, int tempoExpiracao) {
        cookie.setValue(valor);
        cookie.setMaxAge(tempoExpiracao);
        httpServletResponse.addCookie(cookie);
    }

    public static void removeCookie(HttpServletResponse httpServletResponse, Cookie cookie) {
        cookie.setMaxAge(-1);
        httpServletResponse.addCookie(cookie);
    }

    public static String getCookieValue(HttpServletRequest httpServletRequest, String chave) {
        // Verificar se o cookie é nulo ou não
        return Optional.ofNullable(httpServletRequest.getCookies())
                // Caso exista cookies, criar um array de cookies
                .flatMap(cookies -> Arrays.stream(cookies)
                     // Filtrar os cookies pela chave cadastrada
                    .filter(cookie -> chave.equals(cookie.getName()))
                     // Trazer o cookie filtrado
                    .findAny()
                )
                // trazer o valor do cookie filtrado
                .map(e -> e.getValue())
                // Caso o cookie não exista retorna nulo
                .orElse(null);
    }

    public static Cookie getCookie(HttpServletRequest httpServletRequest, String chave) {
        return Optional.ofNullable(httpServletRequest.getCookies())
                // Caso exista cookies, criar um array de cookies
                .flatMap(cookies -> Arrays.stream(cookies)
                        // Filtrar os cookies pela chave cadastrada
                        .filter(cookie -> chave.equals(cookie.getName()))
                        // Trazer o cookie filtrado
                        .findAny()
                )
                // Caso o cookie não exista retorna nulo
                .orElse(null);
    }
}
