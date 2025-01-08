package com.meu_portfolio.portfolio.domain;

import java.sql.Date;

import com.meu_portfolio.portfolio.domain.enums.Modalidade;

public class Experiencia {
    private Integer id;

    private String cargo;
    private String nomeEmpresa;
    private Date anoInicio;
    private Date anoTermino;
    private String descricao;
    private Modalidade modalidade;

    private Usuario usuario;
}
