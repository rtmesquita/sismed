package com.sismed.sismed.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

    @Autowired
    SecurityFilter securityFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.csrf(csrf -> csrf.disable())
                .addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize ->
                        authorize
                                // Atendimento
                                .requestMatchers("/atendimento/cadastrarPage").hasAnyRole("MEDICO")
                                .requestMatchers("/atendimento/visualizarPage").hasAnyRole("MEDICO")
                                .requestMatchers("/atendimento/receberMedico").hasAnyRole("MEDICO")
                                .requestMatchers("/atendimento/receberPaciente").hasAnyRole("MEDICO")
                                .requestMatchers("/atendimento/receberData").hasAnyRole("MEDICO")
                                .requestMatchers(HttpMethod.POST, "/atendimento/cadastrar").hasAnyRole("MEDICO")
                                // Cadastro de usuário
                                .requestMatchers("/cadastrarPage").hasRole("ADMIN")
                                .requestMatchers("/cadastrar").hasRole("ADMIN")
                                // Outras
                                .requestMatchers("/medico/cadastrarPage").authenticated()
                                .requestMatchers("/paciente/cadastrarPage").authenticated()
                                .requestMatchers("/medico/listarPage").authenticated()
                                .requestMatchers("/paciente/listarPage").authenticated()
                                .requestMatchers("/medico/cadastrar").authenticated()
                                .requestMatchers("/paciente/cadastrar").authenticated()
                                .requestMatchers("/medico/listar").authenticated()
                                .requestMatchers("/paciente/listar").authenticated()
                                .requestMatchers("/").authenticated()
                                .requestMatchers(HttpMethod.POST, "/deslogar").authenticated()
                                .anyRequest().permitAll()
                )
                .formLogin(form -> {
                    form.loginPage("/logarPage");
                })
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
