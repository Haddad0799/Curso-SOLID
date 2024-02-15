package com.Rh.SOLID;

import com.Rh.Cargo.Cargo;
import com.Rh.Dados.DadosPessoais;
import com.Rh.Funcionario.Funcionario;
import com.Rh.Service.ReajusteSalarial;
import com.Rh.Validacoes.ValidacaoPercentual;
import com.Rh.Validacoes.Validacoes;
import com.Rh.Validacoes.ValidarPeriodicidade;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CursoSolidApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursoSolidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		DadosPessoais dadosPessoais = new DadosPessoais("pedro", "09992833",Cargo.ESPECIALISTA
				,new BigDecimal("10.000"));
		Funcionario funcionario = new Funcionario(dadosPessoais);

		List<Validacoes> validacoes = new ArrayList<>();
		ValidarPeriodicidade validarPeriodicidade = new ValidarPeriodicidade();
		ValidacaoPercentual validacaoPercentual = new ValidacaoPercentual();

		validacoes.add(validarPeriodicidade);
		validacoes.add(validacaoPercentual);

		ReajusteSalarial reajusteSalarial = new ReajusteSalarial(validacoes);
		reajusteSalarial.reajustarSalario(funcionario,new BigDecimal("1.000"));

		System.out.println(funcionario.getDadosPessoais().getSalario());
		System.out.println(funcionario.getDataUltimoReajuste());
		Cargo novoCargo = funcionario.getDadosPessoais().getCargo().getProximoCargo();
		funcionario.promover(novoCargo);
		System.out.println(funcionario.getDadosPessoais().getCargo());




	}
}
