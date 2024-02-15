package com.Rh.Service.promover;

import com.Rh.Cargo.Cargo;
import com.Rh.Funcionario.Funcionario;
import com.Rh.exception.ValidarException;

public class Promocao {

    public void validarPromocao(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        if(cargoAtual == Cargo.GERENTE) {
            throw new ValidarException("Não é possível promover esse funcionário.");
        }

        if (metaBatida) {
            funcionario.promover(cargoAtual.getProximoCargo());
        } else {
            throw new ValidarException("Funcionário não bateu a meta.");
        }
    }
}
