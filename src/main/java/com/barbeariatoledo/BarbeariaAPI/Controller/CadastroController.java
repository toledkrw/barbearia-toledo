package com.barbeariatoledo.BarbeariaAPI.Controller;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Servico;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Cliente.ClienteDTO;
import com.barbeariatoledo.BarbeariaAPI.Model.Repositories.Funcionario.CreateFuncionarioDTO;
import com.barbeariatoledo.BarbeariaAPI.Service.CadastroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadastro")
public class CadastroController {
@Autowired
CadastroService cadastroService;

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
