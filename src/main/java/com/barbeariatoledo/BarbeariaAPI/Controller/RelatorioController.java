package com.barbeariatoledo.BarbeariaAPI.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;

import com.barbeariatoledo.BarbeariaAPI.Service.RelatorioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/relatorio")
@Api("API de Relatórios.")
public class RelatorioController {
    @Autowired
    RelatorioService relatorioService;


    @ApiOperation(value = "Serviço que retorna um indicativo com o total de agendas do dia.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorno realizado com sucesso."),
            @ApiResponse(code = 204, message = "Sem o que retornar.")
    })
    @GetMapping("/agendas/total-dia")
    public ResponseEntity<Integer> totalAgendasDia(){
        Integer total = relatorioService.getTotalAgendasDia();

        return ResponseEntity.ok().body(total);
    }

}
