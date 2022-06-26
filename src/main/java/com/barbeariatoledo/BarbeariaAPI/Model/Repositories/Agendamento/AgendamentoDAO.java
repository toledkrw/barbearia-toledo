package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento;

import org.springframework.data.jpa.repository.JpaRepository;
import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Agendamento;


import java.util.List;

import java.time.LocalDate;
import java.time.LocalTime;

public interface AgendamentoDAO extends JpaRepository<Agendamento, String> {
    public Agendamento findById(Integer id);
    public List<Agendamento> findByData(LocalDate date);
    public List<Agendamento> findByHora(LocalTime hora);
}
