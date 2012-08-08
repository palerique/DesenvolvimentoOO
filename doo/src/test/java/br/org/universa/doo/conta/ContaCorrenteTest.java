package br.org.universa.doo.conta;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Desenvolvimento Orientado a Objetos - Professor Flávio Roberto -
 * professor.flavio.roberto@gmail.com
 * 
 * @author Bruno Dantas - brunobdantas@gmail.com
 * @author PH - palerique@gmail.com
 */
public class ContaCorrenteTest {

	Conta conta;

	@Before
	public void setup() {
		conta = new ContaCorrente();
		conta.credita(1001.20);
	}

	@Test
	public void debitoContaCorrenteDeveCobrarTarifa() throws Exception {

		conta.debitar(1000.00);

		assertEquals("o debito de Conta Corrente cobra uma tarifa de R$ 1,20",
				0.00, conta.getSaldo(), 0.000001);

	}

	@Test(expected = Exception.class)
	public void debitoContaCorrenteDeveSerSuperiorOuIgualAoSaldo()
			throws Exception {

		conta.debitar(1005.00);

	}

	@Test
	public void aMensagemDaExcecaoDeveSerContaComSaldoInsuficiente() {

		try {
			conta.debitar(1005.00);
		} catch (Exception e) {
			assertEquals("Conta com saldo insuficiente", e.getMessage());
		}

	}

	@Test
	public void contaDeveFuncionarOCredito() throws Exception {

		conta.credita(0.80);

		assertEquals("O crédito deve funcionar", 1002.00, conta.getSaldo(),
				0.000001);

	}

	@Test
	public void deveFuncionarTransferenciasEntreContas() throws Exception {

		Conta b = new ContaCorrente();

		conta.transfere(1.20, b);

		assertEquals("Deve transferir os valores e cobrar a tarifa", 998.8,
				conta.getSaldo(), 0.000001);
		assertEquals("Deve ter transferido o valor para a outra conta", 1.2,
				b.getSaldo(), 0.000001);

	}

	@Test
	public void contaComSaldoNaoPodeEncerrarMensagem() {

		try {
			conta.encerra();
		} catch (Exception e) {
			assertEquals("Saldo diferente de zero", e.getMessage());
		}

	}

	@Test
	public void contaComEstadoDiferenteDeAtivoNaoPodeEncerrarMensagem() {

		try {
			conta.debitar(1000.00);
			conta.setEstadoDaConta(EstadoDaConta.ENCERRADA);

			conta.encerra();
		} catch (Exception e) {
			assertEquals("Essa Conta Não Está Ativa", e.getMessage());
		}

	}

	@Test(expected = Exception.class)
	public void contaComSaldoNaoPodeEncerrar() throws Exception {

		conta.encerra();

	}

	@Test(expected = Exception.class)
	public void contaComEstadoDiferenteDeAtivoNaoPodeEncerrar()
			throws Exception {

		conta.setEstadoDaConta(EstadoDaConta.ENCERRADA);

		conta.encerra();

	}

	@Test
	public void contaDeveEncerrar() throws Exception {

		conta.setEstadoDaConta(EstadoDaConta.ATIVA);
		conta.debitar(1000.00);

		conta.encerra();

		assertEquals(EstadoDaConta.ENCERRADA, conta.getEstadoDaConta());

	}
}
