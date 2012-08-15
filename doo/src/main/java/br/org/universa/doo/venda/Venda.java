package br.org.universa.doo.venda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	private Date dataDaVenda;
	private List<ItemDaVenda> itensDaVenda = new ArrayList<ItemDaVenda>();
	private List<PagamentoDaVenda> pagamentosDaVenda = new ArrayList<PagamentoDaVenda>();
	private double totalDaVenda;

	public Date getDataDaVenda() {
		return dataDaVenda;
	}

	public void setDataDaVenda(Date dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}

	public List<ItemDaVenda> getItensDaVenda() {
		return itensDaVenda;
	}

	public List<PagamentoDaVenda> getPagamentosDaVenda() {
		return pagamentosDaVenda;
	}

	public void adicionaItemDaVenda(Produto produto, int quantidade) {
		this.itensDaVenda.add(new ItemDaVenda(produto, quantidade));
		totalDaVenda += (produto.getPreco() * quantidade);
	}

	public void geraPagamentosDaVenda(int numeroDeParcelas) throws Exception {
		if (numeroDeParcelas < 1) {
			throw new Exception(
					"Número Inválido de Parcelas, deve ser maior que 0");
		}
		for (int i = 1; i <= numeroDeParcelas; i++) {
			PagamentoDaVenda pg = new PagamentoDaVenda(i, totalDaVenda
					/ numeroDeParcelas);

			pagamentosDaVenda.add(pg);
		}
	}

	public double getTotalDaVenda() {
		return totalDaVenda;
	}

}
