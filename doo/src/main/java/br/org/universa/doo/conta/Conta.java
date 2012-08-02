package br.org.universa.doo.conta;

import br.org.universa.doo.cliente.Cliente;

/**
 * 
 * Desenvolvimento Orientado a Objetos - Professor Flávio Roberto - professor.flavio.roberto@gmail.com
 * 
 * @author Bruno Dantas - brunobdantas@gmail.com
 * @author PH - palerique@gmail.com
 */
public abstract class Conta {

	private int				numeroDaConta;
	protected double		saldo;
	private TipoDaConta		tipoDaConta;
	private EstadoDaConta	estadoDaConta;
	private Cliente			titular;

	public void credita(double valor) {

		saldo += valor;
	}

	public abstract void debitar(double valor);

	public void transfere(double valor, Conta contaDestino) {

		this.debitar(valor);
		contaDestino.credita(valor);
	}

	public void encerra() {

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
