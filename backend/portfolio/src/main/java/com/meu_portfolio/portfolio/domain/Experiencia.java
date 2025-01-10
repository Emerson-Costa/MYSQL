package com.meu_portfolio.portfolio.domain;

import java.io.Serializable;
import java.util.Date;

import com.meu_portfolio.portfolio.domain.enums.Modalidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

@Entity
public class Experiencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cargo;
    private String nomeEmpresa;
    private Date anoInicio;
    private Date anoTermino;
    private String descricao;
    private Modalidade modalidade;

    @ManyToOne
    @JoinTable(name = "Experiencias_do_Usuario", joinColumns = @JoinColumn(name = "experiencia_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private Usuario usuario;

    public Experiencia() {

    }

    public Experiencia(Integer id, String cargo, String nomeEmpresa, Date anoInicio, Date anoTermino, String descricao,
            Modalidade modalidade, Usuario usuario) {
        this.id = id;
        this.cargo = cargo;
        this.nomeEmpresa = nomeEmpresa;
        this.anoInicio = anoInicio;
        this.anoTermino = anoTermino;
        this.descricao = descricao;
        this.modalidade = modalidade;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Date getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(Date anoInicio) {
        this.anoInicio = anoInicio;
    }

    public Date getAnoTermino() {
        return anoTermino;
    }

    public void setAnoTermino(Date anoTermino) {
        this.anoTermino = anoTermino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Experiencia other = (Experiencia) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
