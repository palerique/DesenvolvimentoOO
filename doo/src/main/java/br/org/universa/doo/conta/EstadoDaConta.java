package br.org.universa.doo.conta;

public enum EstadoDaConta {
	
	ATIVA(1, "Ativa"),
	BLOQUEADA(1, "Bloqueada"),
	BLOQUEADA_JUDICIALMENTE(3, "Bloqueada Judicialmente"),
	INATIVA(4, "Inativa"),
	ENCERRADA(5, "Encerrada");
	
	private int chave;
	private String valor;
	
	private EstadoDaConta(int chave, String valor) {
		this.chave = chave;
		this.valor = valor;
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
