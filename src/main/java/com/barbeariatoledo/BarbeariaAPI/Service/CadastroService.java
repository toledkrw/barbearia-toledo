package com.barbeariatoledo.BarbeariaAPI.Service;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Cliente;
import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Funcionario;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ClienteDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario.FuncionarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    ClienteDAO clienteDAO;
    @Autowired
    FuncionarioDAO funcionarioDAO;

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.save(cliente);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarioDAO.save(funcionario);
    }
}
