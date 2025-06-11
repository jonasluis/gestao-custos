package br.com.jonasluis.gestao_custos.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jonasluis.gestao_custos.entity.Despesa;
import br.com.jonasluis.gestao_custos.repository.DespesaRepository;

@Service
public class CadastroDespesaUseCase {
    
    @Autowired
    private DespesaRepository despesaRepository;

    public Despesa execute(Despesa despesa) {
       return despesaRepository.save(despesa);
    }

}
