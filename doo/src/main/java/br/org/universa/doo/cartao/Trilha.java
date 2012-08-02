package br.org.universa.doo.cartao;

import java.util.Date;

/**
 * 
 * Desenvolvimento Orientado a Objetos - Professor Flávio Roberto - professor.flavio.roberto@gmail.com
 * 
 * @author Bruno Dantas - brunobdantas@gmail.com
 * @author PH - palerique@gmail.com
 */
public class Trilha {

	private long		numero;
	private Bandeira	bandeira;
	private Date		vencimento;

	public long getNumero() {

		return numero;
	}

	public void setNumero(long numero) {

		this.numero = numero;
	}

	public Bandeira getBandeira() {

		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {

		this.bandeira = bandeira;
	}

	public Date getVencimento() {

		return vencimento;
	}

	public void setVencimento(Date vencimento) {

		this.vencimento = vencimento;
	}

}
