package br.org.universa.doo.cliente;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.org.universa.doo.cartao.Cartao;
import br.org.universa.doo.cartao.Trilha;
import br.org.universa.doo.conta.Conta;
import br.org.universa.doo.conta.ContaCorrente;

public class PessoaFisicaTest {

	@Test
	public void deveInstanciarEFuncionarOsGetsESets() {

		PessoaFisica pf = new PessoaFisica();

		pf.setNome("Fulano de Tal");
		pf.setCpf("33218181");
		pf.setRg("2345678");

		Trilha trilha = new Trilha();
		Cartao cartao = new Cartao(trilha, "123456");
		List<Cartao> cartoes = Arrays.asList(cartao);
		pf.setCartoes(cartoes);

		Conta conta = new ContaCorrente();
		List<Conta> contas = Arrays.asList(conta);
		pf.setContas(contas);

		Calendar data = Calendar.getInstance();
		data.set(1984, 1, 16);
		pf.setDataDeNascimento(new Date(data.getTimeInMillis()));

		assertEquals("Fulano de Tal", pf.getNome());
		assertEquals("33218181", pf.getCpf());
		assertEquals("2345678", pf.getRg());
		assertEquals(cartoes, pf.getCartoes());
		assertEquals(contas, pf.getContas());
		assertEquals(data.getTimeInMillis(), pf.getDataDeNascimento().getTime());
		assertEquals(null, pf.getIdentificacaoDoTitular());
		assertEquals("Fulano de Tal", pf.getNomeDoTitular());

	}

}
