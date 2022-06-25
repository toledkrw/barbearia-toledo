package com.barbeariatoledo.BarbeariaAPI.Model.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TBL_AGENDAMENTO")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date data;

    @Column(length = 256, nullable = false)
    private String descricao;

    @ManyToOne
    private Servico servico;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Funcionario funcionario;
}
