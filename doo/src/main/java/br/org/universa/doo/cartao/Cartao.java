package br.org.universa.doo.cartao;

import java.util.Date;

public class Cartao {
	
	private String senha;
	private Trilha trilha;
	
	public Cartao(Trilha trilha, String senha) {
		this.trilha = trilha;
		this.senha = senha;
	}
	
	public Date getVencimento() {
		return this.trilha.getVencimento();
	}
	
	public Bandeira getBandeira() {
		return this.trilha.getBandeira();
	}
	
	public long getNumero() {
		return this.trilha.getNumero();
	}
	
	public String getSenha() {
		return senha;
	}

}
