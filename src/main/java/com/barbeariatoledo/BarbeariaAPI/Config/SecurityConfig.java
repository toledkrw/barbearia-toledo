//package com.barbeariatoledo.BarbeariaAPI.Config;
//
//import org.springframework.context.annotation.Bean;
//
//import org.springframework.security.config.http.SessionCreationPolicy;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfig extends WebSecurityConfiguration {
//    @Bean
//    public PasswordEncoder crypto(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(service).passwordEncoder(crypto());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////
//        http.sessionManagement( sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/teste/oi").permitAll()
//                .antMatchers("/teste/admin").hasRole("ADMIN")
//                .antMatchers("/teste/usuario").hasRole("USER")
//                //.antMatchers(HttpMethod.POST,"/api/produto").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and();
////                .addFilter(new JWTAutenticarFilter(authenticationManager()))
////                .addFilter(new JWTValidarFilter(authenticationManager()));
//
//}
