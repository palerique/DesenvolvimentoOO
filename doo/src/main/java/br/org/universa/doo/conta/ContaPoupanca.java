package br.org.universa.doo.conta;

/**
 * 
 * Desenvolvimento Orientado a Objetos - Professor Flávio Roberto - professor.flavio.roberto@gmail.com
 * 
 * @author Bruno Dantas - brunobdantas@gmail.com
 * @author PH - palerique@gmail.com
 */
public class ContaPoupanca extends Conta {

	private int	diaDeAniversario;

	public int getDiaDeAniversario() {

		return diaDeAniversario;
	}

	public void setDiaDeAniversario(int diaDeAniversario) {

		this.diaDeAniversario = diaDeAniversario;
	}

	@Override
	public void debitar(double valor) {

		super.saldo -= valor;
	}

}
