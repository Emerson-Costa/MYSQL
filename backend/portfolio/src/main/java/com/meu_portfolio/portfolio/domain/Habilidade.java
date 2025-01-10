package com.meu_portfolio.portfolio.domain;

import java.io.Serializable;
import com.meu_portfolio.portfolio.domain.enums.Nivel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

@Entity
public class Habilidade implements Serializable {
    private static final Long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String competencia;
    private String descricao;
    private Nivel nivel;

    @ManyToOne
    @JoinTable(name = "Habilidades_do_Usuario", joinColumns = @JoinColumn(name = "habilidade_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private Usuario usuario;

    public Habilidade() {

    }

    public Habilidade(Integer id, String competencia, String descricao, Nivel nivel, Usuario usuario) {
        this.id = id;
        this.competencia = competencia;
        this.descricao = descricao;
        this.nivel = nivel;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public String getCompetencia() {
        return competencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Habilidade other = (Habilidade) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
