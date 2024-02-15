package com.Rh.Funcionario;

import com.Rh.Dados.DadosPessoais;

public class Terceirizado {
    private final DadosPessoais dadosPessoais;
    private String empresa;

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Terceirizado(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
}
