package com.barbeariatoledo.BarbeariaAPI.Controller;


import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.AgendamentoDTO;
import com.barbeariatoledo.BarbeariaAPI.Service.AgendamentoService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/agendamento")
public class AgendamentoController {
    @Autowired
    AgendamentoService agendamentoService;

    @PostMapping("/novo")
    public ResponseEntity<String> cadastrarCliente(@RequestBody AgendamentoDTO agendamentoDTO){
        try{
            agendamentoService.cadastrarAgendamento(agendamentoDTO);
            return ResponseEntity.status(201).build();
        }
        catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
}
