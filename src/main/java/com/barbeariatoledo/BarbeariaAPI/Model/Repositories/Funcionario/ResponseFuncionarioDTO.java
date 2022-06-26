package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Agendamento;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseFuncionarioDTO {

    private String nome;
    private String especialidade;
}
