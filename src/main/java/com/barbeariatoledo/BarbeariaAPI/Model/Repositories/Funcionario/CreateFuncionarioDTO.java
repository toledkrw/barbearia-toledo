package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateFuncionarioDTO {
    @NotNull
    private String nome;
    private String especialidade;
}
