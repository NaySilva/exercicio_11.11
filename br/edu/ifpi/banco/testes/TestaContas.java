package br.edu.ifpi.banco.testes;

import br.edu.ifpi.banco.excecoes.SaldoInsuficienteException;
import br.edu.ifpi.banco.excecoes.ValorInvalidoException;
import br.edu.ifpi.banco.modelo.*;

public class TestaContas {

	public static void main(String[] args) {

		Conta c = new ContaCorrente();

		Conta cp = new ContaPoupanca();

		try {
			c.deposita(900);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}

		try {

			cp.deposita(-1200);
		} catch (ValorInvalidoException e1) {

			System.out.println(e1.getMessage());

		}

		try {
			c.saca(1000);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(c.getSaldo());

		// System.out.println(cc.getSaldo());

		System.out.println(cp.getSaldo());

	}

}
