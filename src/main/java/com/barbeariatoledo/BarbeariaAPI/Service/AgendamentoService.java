package com.barbeariatoledo.BarbeariaAPI.Service;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Agendamento;
import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Servico;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.AgendamentoDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.AgendamentoDTO;

import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ClienteDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario.FuncionarioDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Servico.ServicoDAO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AgendamentoService {
    @Autowired
    ClienteDAO clienteDAO;
    @Autowired
    ServicoDAO servicoDAO;
    @Autowired
    FuncionarioDAO funcionarioDAO;

    @Autowired
    AgendamentoDAO agendamentoDAO;

    @Autowired
    ModelMapper modelMapper;

    public void cadastrarAgendamento(AgendamentoDTO agendamentoDTO) {
        // passando id, descrição e data
        Agendamento agendamento = modelMapper.map(agendamentoDTO, Agendamento.class);

        agendamento.setServico(servicoDAO.findById(agendamentoDTO.getServico()));
        agendamento.setCliente(clienteDAO.findById(agendamentoDTO.getCliente()));
        agendamento.setFuncionario(funcionarioDAO.findById(agendamentoDTO.getFuncionario()));

        agendamentoDAO.save(agendamento);
    }
}
