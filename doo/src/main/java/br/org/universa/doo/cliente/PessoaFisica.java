package br.org.universa.doo.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.org.universa.doo.cartao.Cartao;
import br.org.universa.doo.conta.Conta;

/**
 * 
 * Desenvolvimento Orientado a Objetos - Professor Flávio Roberto - professor.flavio.roberto@gmail.com
 * 
 * @author Bruno Dantas - brunobdantas@gmail.com
 * @author PH - palerique@gmail.com
 */
public class PessoaFisica implements Cliente {

	private String			nome;
	private String			cpf;
	private String			rg;
	private Date			dataDeNascimento;
	private List<Conta>		contas	= new ArrayList<Conta>();
	private List<Cartao>	cartoes	= new ArrayList<Cartao>();

	public void adicionaConta(Conta conta) {

		this.contas.add(conta);
	}

	public String getNomeDoTitular() {

		return getNome();
	}

	public String getIdentificacaoDoTitular() {

		// TODO: corrigir isso aqui!!!
		return null;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getCpf() {

		return cpf;
	}

	public void setCpf(String cpf) {

		this.cpf = cpf;
	}

	public String getRg() {

		return rg;
	}

	public void setRg(String rg) {

		this.rg = rg;
	}

	public Date getDataDeNascimento() {

		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {

		this.dataDeNascimento = dataDeNascimento;
	}

	public List<Conta> getContas() {

		return contas;
	}

	public void setContas(List<Conta> contas) {

		this.contas = contas;
	}

	public List<Cartao> getCartoes() {

		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {

		this.cartoes = cartoes;
	}

}
