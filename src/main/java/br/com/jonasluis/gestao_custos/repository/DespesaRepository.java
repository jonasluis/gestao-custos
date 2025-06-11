package br.com.jonasluis.gestao_custos.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonasluis.gestao_custos.entity.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, UUID>{
    
}
