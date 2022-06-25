package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento;

import org.springframework.data.jpa.repository.JpaRepository;
import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Agendamento;

public interface AgendamentoDAO extends JpaRepository<Agendamento, String> {
    public Agendamento findById(Integer id);
}
