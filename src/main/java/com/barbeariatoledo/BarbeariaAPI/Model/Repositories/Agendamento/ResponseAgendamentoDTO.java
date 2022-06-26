package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento;

import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Servico.ServicoDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ResponseClienteDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario.ResponseFuncionarioDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAgendamentoDTO {
    private Integer id;

    private String descricao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime hora;

    private ServicoDTO servico;
    private ResponseClienteDTO cliente;
    private ResponseFuncionarioDTO funcionario;

}