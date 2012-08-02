package br.org.universa.doo.conta;

/**
 * @author Josue Junior
 * 
 */
public class ContaPoupanca extends Conta {

	private int diaDeAniversario;
	
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
