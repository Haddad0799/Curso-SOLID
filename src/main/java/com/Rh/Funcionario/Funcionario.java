package com.Rh.Funcionario;

import com.Rh.Cargo.Cargo;
import com.Rh.Dados.DadosPessoais;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
   private final DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public void atualizarSalario(BigDecimal reajuste) {
        this.dadosPessoais.setSalario(reajuste);
        this.dataUltimoReajuste = LocalDate.now();
    }


    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }


    public void promover(Cargo cargoAtual) {
        this.dadosPessoais.setCargo(cargoAtual);
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }
}
