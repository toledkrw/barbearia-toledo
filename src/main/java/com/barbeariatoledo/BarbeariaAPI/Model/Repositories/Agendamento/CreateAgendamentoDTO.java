package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonFormat;


import java.time.LocalDate;
import java.time.LocalTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAgendamentoDTO {
    @NotNull
    private String descricao;

    @NotNull @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    @NotNull @JsonFormat(pattern = "HH:mm")
    private LocalTime hora;

    @NotNull
    private Integer servico, cliente, funcionario;
}
