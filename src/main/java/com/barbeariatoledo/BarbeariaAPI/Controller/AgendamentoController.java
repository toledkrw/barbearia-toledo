package com.barbeariatoledo.BarbeariaAPI.Controller;


import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.CreateAgendamentoDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.ResponseAgendamentoDTO;
import com.barbeariatoledo.BarbeariaAPI.Service.AgendamentoService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/agendamento")
public class AgendamentoController {
    @Autowired
    AgendamentoService agendamentoService;

    @PostMapping("/novo")
    public ResponseEntity<String> cadastrarAgendamento(@RequestBody CreateAgendamentoDTO createAgendamentoDTO){
        try{
            agendamentoService.cadastrarAgendamento(createAgendamentoDTO);
            return ResponseEntity.status(201).build();
        }
        catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

    @GetMapping("/exibir-agenda")
    public ResponseEntity<List<ResponseAgendamentoDTO>>exibirAgenda(){;
        try{
            List<ResponseAgendamentoDTO> resposta = agendamentoService.exibirAgenda(null);
            if(!resposta.isEmpty()){
                return ResponseEntity.ok().body(resposta);
            }
            else{
                return ResponseEntity.notFound().build();
            }
        }
        catch (Exception e){
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping("/exibir-agenda/{data}")
    public ResponseEntity<List<ResponseAgendamentoDTO>>exibirAgendaData(@PathVariable String data){;
        try{
            LocalDate date = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            List<ResponseAgendamentoDTO> resposta = agendamentoService.exibirAgenda(date);
            if(!resposta.isEmpty()){
                return ResponseEntity.ok().body(resposta);
            }
            else{
                return ResponseEntity.notFound().build();
            }

        }
        catch (Exception e){
            return ResponseEntity.badRequest().build();
        }

    }
}
