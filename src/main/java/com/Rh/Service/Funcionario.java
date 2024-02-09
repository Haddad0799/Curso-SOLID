package com.Rh.Service;

import com.Rh.Cargo.Cargo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String Cpf;

    private Cargo cargo;
    private BigDecimal salario;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        Cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void atualizarSalario(BigDecimal reajuste) {
        this.salario = reajuste;
        this.dataUltimoReajuste = LocalDate.now();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

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
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
