package br.org.universa.doo.venda;

public class PagamentoDaVenda {

	private int numeroDaParcela;
	private double valorDaParcela;

	public PagamentoDaVenda(int numeroDaParcela, double valorDaParcela) {
		this.numeroDaParcela = numeroDaParcela;
		this.valorDaParcela = valorDaParcela;
	}

	public int getNumeroDaParcela() {
		return numeroDaParcela;
	}

	public double getValorDaParcela() {
		return valorDaParcela;
	}

}
