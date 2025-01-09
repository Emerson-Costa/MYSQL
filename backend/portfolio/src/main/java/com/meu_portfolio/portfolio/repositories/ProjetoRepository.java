package com.meu_portfolio.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meu_portfolio.portfolio.domain.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {

}
