package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgendamentoDTO {
    private Integer id;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date data;

    private String descricao;

    @NotNull
    private Integer servico, cliente, funcionario;
}
