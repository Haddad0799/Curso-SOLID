package com.Rh.Validacoes;

import com.Rh.Funcionario.Funcionario;
import com.Rh.exception.ValidarException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentual implements Validacoes {

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidarException("Aumento não pode ser superio a 40%.");
        }
    }
}
