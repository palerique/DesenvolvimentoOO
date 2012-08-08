package br.org.universa.doo.conta;

import br.org.universa.doo.cliente.Cliente;

/**
 * 
 * Desenvolvimento Orientado a Objetos - Professor Flávio Roberto -
 * professor.flavio.roberto@gmail.com
 * 
 * @author Bruno Dantas - brunobdantas@gmail.com
 * @author PH - palerique@gmail.com
 */
public abstract class Conta {

	private int numeroDaConta;
	protected double saldo;
	private TipoDaConta tipoDaConta;
	private EstadoDaConta estadoDaConta;
	private Cliente titular;

	public void credita(double valor) {

		saldo += valor;
	}

	public abstract void debitar(double valor) throws Exception;

	public void transfere(double valor, Conta contaDestino) throws Exception {

		this.debitar(valor);
		contaDestino.credita(valor);
	}

	public void encerra() throws Exception {

		if (this.saldo != 0)
			throw new Exception("Saldo diferente de zero");
		if (!this.estadoDaConta.equals(EstadoDaConta.ATIVA))
			throw new Exception("Essa Conta Não Está Ativa");

		setEstadoDaConta(EstadoDaConta.ENCERRADA);
	}

	public Cliente getTitular() {

		return titular;
	}

	public void setTitular(Cliente titular) {

		this.titular = titular;
	}

	public int getNumeroDaConta() {

		return numeroDaConta;
	}

	public double getSaldo() {

		return saldo;
	}

	public TipoDaConta getTipoDaConta() {

		return tipoDaConta;
	}

	public void setTipoDaConta(TipoDaConta tipoDaConta) {

		this.tipoDaConta = tipoDaConta;
	}

	public EstadoDaConta getEstadoDaConta() {

		return estadoDaConta;
	}

	public void setEstadoDaConta(EstadoDaConta estadoDaConta) {

		this.estadoDaConta = estadoDaConta;
	}

}
