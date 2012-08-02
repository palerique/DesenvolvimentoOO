package br.org.universa.doo.conta;

/**
 * 
 * Desenvolvimento Orientado a Objetos - Professor Flávio Roberto - professor.flavio.roberto@gmail.com
 * 
 * @author Bruno Dantas - brunobdantas@gmail.com
 * @author PH - palerique@gmail.com
 */
public enum TipoDaConta {

	CORRENTE("C", "Corrente"), POUPANCA("P", "Poupan�a");

	private String	chave;
	private String	valor;

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
