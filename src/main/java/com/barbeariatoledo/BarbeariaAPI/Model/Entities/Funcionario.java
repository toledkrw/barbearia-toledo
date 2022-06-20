package com.barbeariatoledo.BarbeariaAPI.Model.Entities;

import javax.persistence.*;


@Entity
@Table(name = "TBL_FUNCIONARIO")
public class Funcionario extends Pessoa{

    @Column(length = 100, nullable = true)
    String especialidade;

}
