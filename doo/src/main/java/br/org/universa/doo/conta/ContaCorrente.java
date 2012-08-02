package br.org.universa.doo.conta;

/**
 * 
 * Desenvolvimento Orientado a Objetos - Professor Flávio Roberto - professor.flavio.roberto@gmail.com
 * 
 * @author Bruno Dantas - brunobdantas@gmail.com
 * @author PH - palerique@gmail.com
 */
public class ContaCorrente extends Conta {

	private double	limiteDoChequeEspecial;
	private double	TARIFICAO_DE_DEBITO	= 1.20;

	public double getLimiteDoChequeEspecial() {

		return limiteDoChequeEspecial;
	}

	@Override
	public void debitar(double valor) {

		super.saldo -= valor + TARIFICAO_DE_DEBITO;
	}

}
