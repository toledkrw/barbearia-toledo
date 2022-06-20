package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioDAO extends JpaRepository<Funcionario, String> {
    public Funcionario findById(Integer id);
    public Funcionario findByNome(String nome);
}
