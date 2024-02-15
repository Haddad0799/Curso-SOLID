package com.Rh.Service;

import com.Rh.Funcionario.Funcionario;
import com.Rh.Validacoes.Validacoes;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteSalarial {
    private List<Validacoes> validacoes;

    public ReajusteSalarial(List<Validacoes> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalario (Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);

    }
}
