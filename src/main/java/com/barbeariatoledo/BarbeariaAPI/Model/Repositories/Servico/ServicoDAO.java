package com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Servico;

import org.springframework.data.jpa.repository.JpaRepository;
import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Servico;

public interface ServicoDAO extends JpaRepository<Servico, String> {
    public Servico findById(Integer id);
}
