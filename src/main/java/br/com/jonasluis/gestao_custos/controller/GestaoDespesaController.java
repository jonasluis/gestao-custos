package br.com.jonasluis.gestao_custos.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonasluis.gestao_custos.custom_messages.ErrorMessage;
import br.com.jonasluis.gestao_custos.entity.Despesa;
import br.com.jonasluis.gestao_custos.useCases.CadastroDespesaUseCase;

@RestController
@RequestMapping("/gestao")
public class GestaoDespesaController {

    @Autowired
    private CadastroDespesaUseCase cadastroDespesaUseCase;
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Despesa despesa) {

        try {
            var result = cadastroDespesaUseCase.execute(despesa);
            return ResponseEntity.ok().body(result);
            
        } catch (IllegalArgumentException e) {
            var errorMessage = new  ErrorMessage(e.getMessage(), "INVALID_PARAMS");

            return ResponseEntity.status(400).body(errorMessage);
        }
    }

    //gestao/find/jonas@gail.com
    @GetMapping("/{email}")
    public void findByEmailAndDate(@PathVariable String email, @RequestParam(required = false) LocalDate data) {

    }


}
