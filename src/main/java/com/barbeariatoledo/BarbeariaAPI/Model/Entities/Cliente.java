package com.barbeariatoledo.BarbeariaAPI.Model.Entities;

import lombok.Data;

import java.util.List;
import javax.persistence.*;


@Entity
@Data
@Table(name = "TBL_CLIENTE")
public class Cliente extends Pessoa{

    @OneToMany(mappedBy = "cliente",cascade = {})
    private List<Agendamento> agendamentos;

}
