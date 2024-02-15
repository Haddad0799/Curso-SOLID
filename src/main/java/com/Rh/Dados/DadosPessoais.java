package com.Rh.Dados;

import com.Rh.Cargo.Cargo;

import java.math.BigDecimal;

public class DadosPessoais {
    private final String nome;

    private final String Cpf;

    private Cargo cargo;

    private  BigDecimal salario;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.Cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
