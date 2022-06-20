package com.barbeariatoledo.BarbeariaAPI.Controller;

import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Cliente;
import com.barbeariatoledo.BarbeariaAPI.Model.Entities.Funcionario;

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
    public ResponseEntity<String> cadastrarCliente(@RequestBody Cliente cliente){
        try{
            cadastroService.cadastrarCliente(cliente);
            return ResponseEntity.status(201).build();
        }
        catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

    @PostMapping("/funcionario")
    public ResponseEntity<String> cadastrarFuncionario(@RequestBody Funcionario funcionario){
        try{
            cadastroService.cadastrarFuncionario(funcionario);
            return ResponseEntity.status(201).build();
        }
        catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
}
