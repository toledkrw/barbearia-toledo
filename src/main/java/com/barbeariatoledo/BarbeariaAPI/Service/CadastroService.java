package com.barbeariatoledo.BarbeariaAPI.Service;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Cliente;
import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Funcionario;
import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Servico;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ClienteDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ClienteDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario.FuncionarioDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario.CreateFuncionarioDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Servico.ServicoDAO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    ClienteDAO clienteDAO;
    @Autowired
    FuncionarioDAO funcionarioDAO;
    @Autowired
    ServicoDAO servicoDAO;

    @Autowired
    ModelMapper modelMapper;

    public void cadastrarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = modelMapper.map(clienteDTO, Cliente.class);
        clienteDAO.save(cliente);
    }

    public void cadastrarFuncionario(CreateFuncionarioDTO funcionarioDTO) {
        Funcionario funcionario = modelMapper.map(funcionarioDTO, Funcionario.class);
        funcionarioDAO.save(funcionario);
    }

    public void cadastrarServico(Servico servico) {servicoDAO.save(servico); }
}
