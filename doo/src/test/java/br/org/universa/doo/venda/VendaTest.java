package br.org.universa.doo.venda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;

public class VendaTest {

	@Test
	public void deveFuncionarVendaDeUmUnicoProdutoEmUmaUnicaParcela() {

		// Cenário
		Venda v = new Venda();

		Produto produto = new Produto(0, "Playstation 3", 1200.0);

		v.adicionaItemDaVenda(produto, 1);

		Date dataDaVenda = new Date();

		v.setDataDaVenda(dataDaVenda);

		// Ação:
		try {
			v.geraPagamentosDaVenda(1);
		} catch (Exception e) {
			fail("Não deve lançar essa exceção");
		}

		// Verificações e validações:

		assertEquals(dataDaVenda, v.getDataDaVenda());
		assertEquals(1, v.getItensDaVenda().size());
		assertEquals("Playstation 3", v.getItensDaVenda().get(0).getProduto()
				.getDescricao());
		assertEquals(1, v.getItensDaVenda().get(0).getQuantidade());
		assertEquals(0, v.getItensDaVenda().get(0).getProduto().getCodigo());
		assertEquals(1200.0, v.getItensDaVenda().get(0).getSubTotal(), 0.000001);
		assertEquals(1, v.getPagamentosDaVenda().size());

		PagamentoDaVenda pagamento = v.getPagamentosDaVenda().get(0);

		assertEquals(1, pagamento.getNumeroDaParcela());
		assertEquals(1200.0, pagamento.getValorDaParcela(), 0.0000001);

		assertEquals(1200.0, v.getTotalDaVenda(), 0.0000001);

	}

	@Test(expected = Exception.class)
	public void deveLancarExcecaoNaTentativaDeGerarPagamentoComNumeroDeParcelasZero()
			throws Exception {

		// Cenário
		Venda v = new Venda();

		Produto produto = new Produto(0, "Playstation 3", 1200.0);

		v.adicionaItemDaVenda(produto, 1);

		Date dataDaVenda = new Date();

		v.setDataDaVenda(dataDaVenda);

		// Ação:
		v.geraPagamentosDaVenda(0);
	}
}
