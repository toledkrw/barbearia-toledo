//package com.barbeariatoledo.BarbeariaAPI.Config.Security.User;
//
//import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Login;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//@AllArgsConstructor
//@Data
//public class UsuarioLogado implements UserDetails {
//
//    private Login login;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        ArrayList<GrantedAuthority> lista = new ArrayList<>();
//        for ( String role: login.getRoles() ) {
//            lista.add( new SimpleGrantedAuthority(role));
//        }
//        return lista;
//    }
//
//    @Override
//    public String getPassword() {
//        return login.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return login.getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
