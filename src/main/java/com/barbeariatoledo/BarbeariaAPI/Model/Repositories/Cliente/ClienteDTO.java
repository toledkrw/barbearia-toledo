package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Agendamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private Integer id;

    @NotNull
    private String nome;

    private List<Agendamento> agendamentos;
}
