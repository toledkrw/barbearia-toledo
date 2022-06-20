package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, String> {
    public Cliente findById(Integer id);
    public Cliente findByNome(String nome);
}
