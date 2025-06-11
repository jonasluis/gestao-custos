package br.com.jonasluis.gestao_custos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonasluis.gestao_custos.entity.Despesa;
import br.com.jonasluis.gestao_custos.useCases.CadastroDespesaUseCase;

@RestController
@RequestMapping("/gestao")
public class GestaoDespesaController {

    @Autowired
    private CadastroDespesaUseCase cadastroDespesaUseCase;
    
    @PostMapping("/create")
    public Despesa create(@RequestBody Despesa despesa) {

       return cadastroDespesaUseCase.execute(despesa);
    }


}
