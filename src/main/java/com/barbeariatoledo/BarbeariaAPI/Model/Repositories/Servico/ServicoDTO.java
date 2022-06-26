package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Servico;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicoDTO {
    private String nome;
    private Double preco;
}
