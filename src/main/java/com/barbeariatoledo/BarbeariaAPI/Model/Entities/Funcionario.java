package com.barbeariatoledo.BarbeariaAPI.Model.Entities;

import lombok.Data;

import java.util.List;
import javax.persistence.*;


@Entity
@Data
@Table(name = "TBL_FUNCIONARIO")
public class Funcionario extends Pessoa{

    @Column(length = 100, nullable = true)
    private String especialidade;

    @OneToMany(mappedBy = "funcionario")
    private List<Agendamento> agendamentos;

//    @OneToOne
//    private Login login;

}
