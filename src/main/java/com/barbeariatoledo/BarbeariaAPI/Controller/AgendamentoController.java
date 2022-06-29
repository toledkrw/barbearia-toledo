package com.barbeariatoledo.BarbeariaAPI.Controller;


import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.CreateAgendamentoDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Agendamento.ResponseAgendamentoDTO;
import com.barbeariatoledo.BarbeariaAPI.Service.AgendamentoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.List;

@RestController
@RequestMapping("/api/agendamento")
@Api("API de Agendamento.")
public class AgendamentoController {
    @Autowired
    AgendamentoService agendamentoService;


    @ApiOperation(value = "Serviço que cadastra um novo agendamento")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Cadastrado com sucesso"),
            @ApiResponse(code = 400, message = "Payload não foi preenchido corretamente")
    })
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

    @ApiOperation(value = "Serviço que retorna todas as agendas do dia atual por padrão")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Agendas retornadas com sucesso."),
            @ApiResponse(code = 204, message = "Sem agendas a retornar."),
            @ApiResponse(code = 404, message = "Sem agendas encontradas.")
    })
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

    @ApiOperation(value = "Serviço que retorna os agendamentos de um dia especificado")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Agendas retornadas com sucesso."),
            @ApiResponse(code = 204, message = "Sem agendas a retornar."),
            @ApiResponse(code = 404, message = "Sem agendas encontradas."),
    })
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
