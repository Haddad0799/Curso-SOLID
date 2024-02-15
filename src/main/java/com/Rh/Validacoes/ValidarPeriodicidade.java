package com.Rh.Validacoes;

import com.Rh.Funcionario.Funcionario;
import com.Rh.exception.ValidarException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidarPeriodicidade implements Validacoes{
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();

        if (funcionario.getDataUltimoReajuste() == null) {
            dataUltimoReajuste = LocalDate.now();
        }

        long mesesEntreUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste,dataAtual);

        if (mesesEntreUltimoReajuste > 6) {
            throw new ValidarException("Reajuste indisponível. Não é possivel realizar reajuste com menos de 6 meses em relação ao último reajuste.");
        }
    }
}
