package com.barbeariatoledo.BarbeariaAPI.Controller;

import org.springframework.http.ResponseEntity;

import com.barbeariatoledo.BarbeariaAPI.Service.RelatorioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/relatorio")
public class RelatorioController {
    @Autowired
    RelatorioService relatorioService;

    @GetMapping("/agendas/total-dia")
    public ResponseEntity<Integer> totalAgendasDia(){
        Integer total = relatorioService.getTotalAgendasDia();

        return ResponseEntity.ok().body(total);
    }

}
