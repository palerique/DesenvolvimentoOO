package br.org.universa.doo.venda;

public class ItemDaVenda {

	private int quantidade;
	private Produto produto;

	public ItemDaVenda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
