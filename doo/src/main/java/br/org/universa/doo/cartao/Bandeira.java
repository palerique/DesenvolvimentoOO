package br.org.universa.doo.cartao;

public enum Bandeira {
	
	VISA(1, "Visa"), MASTERCARD(2, "Credicard"), HIPERCARD(3, "Hipercard");
	
	private int chave;
	private String valor;
	
	private Bandeira(int chave, String valor) {
		this.setChave(chave);
		this.setValor(valor);
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
