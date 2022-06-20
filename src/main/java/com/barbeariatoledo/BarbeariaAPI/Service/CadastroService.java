package com.barbeariatoledo.BarbeariaAPI.Service;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Cliente;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    ClienteDAO clienteDAO;

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.save(cliente);
    }
}
