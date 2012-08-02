package br.org.universa.doo.conta;

public enum TipoDaConta {

	CORRENTE("C", "Corrente"), POUPANCA("P", "Poupan�a");

	private String chave;
	private String valor;

	private TipoDaConta(String chave, String valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
