package br.org.universa.doo.cliente;

import br.org.universa.doo.cartao.Cartao;
import br.org.universa.doo.conta.Conta;

public class PessoaJuridica implements Cliente {

	private String empresa;
	private String cnpj;
	private String inscricaoEstadual;
	private Conta conta;
	private Cartao cartao;

	public String getNomeDoTitular() {
		return getEmpresa();
	}

	public String getIdentificacaoDoTitular() {
		return getCnpj();
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

}
