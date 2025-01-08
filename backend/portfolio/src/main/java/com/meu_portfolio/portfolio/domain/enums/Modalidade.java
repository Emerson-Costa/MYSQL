package com.meu_portfolio.portfolio.domain.enums;

public enum Modalidade {
    PRESENCIAL(1, "Presencial"),
    HIBRIDO(2, "Hibrido"),
    HOME_OFFICE(3, "Home_Office");

    private int codigo;
    private String descricao;

    private Modalidade(int cod, String descricao) {
        this.codigo = cod;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static Modalidade toEnum(Integer codigo) throws IllegalAccessException {

        if (codigo == null) {
            return null;
        }

        for (Modalidade modalidade : Modalidade.values()) {
            if (codigo.equals(modalidade.getCodigo())) {
                return modalidade;
            }
        }

        throw new IllegalAccessException("Id inválido: " + codigo);
    }

}
