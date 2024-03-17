package com.br.brunogiuseppe.projetocontabil.repository;

import com.br.brunogiuseppe.projetocontabil.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}