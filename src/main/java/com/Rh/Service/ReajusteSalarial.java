package com.Rh.Service;

import com.Rh.exception.ValidarException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteSalarial {
    public void reajustarSalario (Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo( new BigDecimal("0.4")) > 0) {
            throw new ValidarException("Aumento excedeu o valor de 40% do salario atual em questão");
        }
        BigDecimal salarioReajustado = salarioAtual.add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
