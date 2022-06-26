package com.barbeariatoledo.BarbeariaAPI.Service;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Agendamento;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ClienteDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Servico.ServicoDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario.FuncionarioDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.AgendamentoDAO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.CreateAgendamentoDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.ResponseAgendamentoDTO;

import com.barbeariatoledo.BarbeariaAPI.Tools.DateFormatter;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.List;
import java.util.ArrayList;

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

    @Autowired
    DateFormatter dateFormatter;



    public List<ResponseAgendamentoDTO> exibirAgenda(LocalDate date) {
        if(date == null){
            String date_string =  LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            date = LocalDate.parse(date_string, dateFormatter.dateFormatter());
        }

        List<Agendamento> agendamentos = agendamentoDAO.findByData(date);

        if(agendamentos.isEmpty()){
            return null;
        }

        List<ResponseAgendamentoDTO> agendamentoDTOs = new ArrayList<>();

        for (Agendamento a: agendamentos) {
            ResponseAgendamentoDTO agendamentoDTO = modelMapper.map(a, ResponseAgendamentoDTO.class);

            agendamentoDTOs.add(agendamentoDTO);
        }
        return agendamentoDTOs;
    }


    public void cadastrarAgendamento(CreateAgendamentoDTO createAgendamentoDTO) {
        // passando id, descrição e data
        Agendamento agendamento = modelMapper.map(createAgendamentoDTO, Agendamento.class);

        agendamento.setServico(servicoDAO.findById(createAgendamentoDTO.getServico()));
        agendamento.setCliente(clienteDAO.findById(createAgendamentoDTO.getCliente()));
        agendamento.setFuncionario(funcionarioDAO.findById(createAgendamentoDTO.getFuncionario()));

        agendamentoDAO.save(agendamento);
    }
}
