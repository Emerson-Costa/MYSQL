package com.meu_portfolio.portfolio.domain.enums;

public enum Nivel {
    BAIXO(1, "Baixo"),
    MEDIO(2, "Medio"),
    ALTO(3, "Alto");

    private int codigo;
    private String descricao;

    private Nivel(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static Nivel toEnum(Integer codigo) throws IllegalAccessException {

        if (codigo == null) {
            return null;
        }

        for (Nivel nivel : Nivel.values()) {
            if (codigo.equals(nivel.getCodigo())) {
                return nivel;
            }
        }

        throw new IllegalAccessException("Id inválido: " + codigo);
    }
}
