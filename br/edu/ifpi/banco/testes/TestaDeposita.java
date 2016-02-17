package br.edu.ifpi.banco.testes;

import br.edu.ifpi.banco.excecoes.ValorInvalidoException;
import br.edu.ifpi.banco.modelo.Conta;

import br.edu.ifpi.banco.modelo.ContaPoupanca;

public class TestaDeposita {

	public static void main(String[] args) {

		Conta cp = new ContaPoupanca();

		try {

			cp.deposita(-10);

		} catch (ValorInvalidoException e) {

			System.out.println(e.getMessage());

		}

	}

}
