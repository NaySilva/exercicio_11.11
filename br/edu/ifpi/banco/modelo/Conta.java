package br.edu.ifpi.banco.modelo;

import br.edu.ifpi.banco.excecoes.SaldoInsuficienteException;
import br.edu.ifpi.banco.excecoes.ValorInvalidoException;

public abstract class Conta {

	protected double saldo;

	public void deposita(double valor) throws ValorInvalidoException {

		if (valor < 0) {

			throw new ValorInvalidoException(valor);

		}

		this.saldo += valor;

	}

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo >= valor) {

			this.saldo -= valor;

		} else {

			throw new SaldoInsuficienteException("Saldo insuficiente, " +

			"tente um valor menor");

		}

	}

	public double getSaldo() {

		return saldo;

	}

	public abstract void atualiza(double taxa);

}