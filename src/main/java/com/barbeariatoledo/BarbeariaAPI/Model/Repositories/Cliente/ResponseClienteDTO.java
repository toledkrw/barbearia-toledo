package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseClienteDTO {
    @NotNull
    private String nome;
}
