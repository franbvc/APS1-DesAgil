package br.edu.insper.desagil.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		this.quantidade = 1;
	}
	
	public void incrementa() {
		this.quantidade += 1;
	}
	
	
	public double total() {
		double output = produto.getPreco() * quantidade;
		return output;
	}


	public Produto getProduto() {
		return produto;
	}

	
	public int getQuantidade() {
		return quantidade;
	}


}
