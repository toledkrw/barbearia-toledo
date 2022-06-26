package com.barbeariatoledo.BarbeariaAPI.Model.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TBL_AGENDAMENTO")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 256, nullable = false)
    private String descricao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime hora;

    @ManyToOne
    private Servico servico;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Funcionario funcionario;
}
