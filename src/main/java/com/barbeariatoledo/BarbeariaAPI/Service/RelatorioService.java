package com.barbeariatoledo.BarbeariaAPI.Service;

import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.ResponseAgendamentoDTO;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatorioService {
    @Autowired
    AgendamentoService agendamentoService;
    public Integer getTotalAgendasDia() {
        List<ResponseAgendamentoDTO> agendamentos = agendamentoService.exibirAgenda(null);
        Integer total = agendamentos.size();
        return total;
    }
}
