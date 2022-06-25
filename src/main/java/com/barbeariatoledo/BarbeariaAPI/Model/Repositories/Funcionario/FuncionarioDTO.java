package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Agendamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioDTO {
    @NotNull
    private String nome;

    private String especialidade;
    private List<Agendamento> agendamentos;
}
