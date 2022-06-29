package com.barbeariatoledo.BarbeariaAPI.Controller;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Servico;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ClienteDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario.CreateFuncionarioDTO;
import com.barbeariatoledo.BarbeariaAPI.Service.CadastroService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadastro")
@Api("API de Cadastro.")
public class CadastroController {
@Autowired
CadastroService cadastroService;

    @ApiOperation(value = "Serviço que cadastra um novo cliente.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Cliente cadastrado com sucesso."),
            @ApiResponse(code = 400, message = "Payload preenchido incorretamente.")
    })
    @PostMapping("/cliente")
    public ResponseEntity<String> cadastrarCliente(@RequestBody ClienteDTO clienteDTO){
        try{
            cadastroService.cadastrarCliente(clienteDTO);
            return ResponseEntity.status(201).build();
        }
        catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

    @ApiOperation(value = "Serviço que cadastra um novo funcionário.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Funcionário cadastrado com sucesso."),
            @ApiResponse(code = 400, message = "Payload preenchido incorretamente.")
    })
    @PostMapping("/funcionario")
    public ResponseEntity<String> cadastrarFuncionario(@RequestBody CreateFuncionarioDTO funcionarioDTO){
        try{
            cadastroService.cadastrarFuncionario(funcionarioDTO);
            return ResponseEntity.status(201).build();
        }
        catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

    @ApiOperation(value = "Serviço que cadastra um novo serviço a ser prestado.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Serviço cadastrado com sucesso."),
            @ApiResponse(code = 400, message = "Payload preenchido incorretamente.")
    })
    @PostMapping("/servico")
    public ResponseEntity<String> cadastrarFuncionario(@RequestBody Servico servico){
        try{
            cadastroService.cadastrarServico(servico);
            return ResponseEntity.status(201).build();
        }
        catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
}
