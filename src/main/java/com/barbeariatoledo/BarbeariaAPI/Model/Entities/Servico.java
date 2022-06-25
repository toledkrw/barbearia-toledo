package com.barbeariatoledo.BarbeariaAPI.Model.Entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TBL_SERVICO")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 80, nullable = false)
    private String nome;
    @Column(nullable = false)
    private Double preco;

    @OneToMany(mappedBy="servico")
    private List<Agendamento> agendamentos;
}
