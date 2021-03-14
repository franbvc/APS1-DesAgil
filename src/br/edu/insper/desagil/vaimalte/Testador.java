package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		
	    return totalCarrinho == (double) 0;
	}

	public boolean testeB() {
	    return false;
	}

	public boolean testeC() {
	    return false;
	}

	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
		
		Produto alface = new Produto(5839, "Alface", 4.50);
		Produto cenoura = new Produto(5840, "Cenoura", 2.40);
		
		carrinho.addProduto(alface);
		carrinho.addProduto(cenoura);
		carrinho.addProduto(cenoura);
		
		
		Caixa caixa = new Caixa();
		
		caixa.adicionarDesconto(alface, 50);
		
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		
	    return totalCarrinho == 7.05;
	}

	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
		
		Produto alface = new Produto(5839, "Alface", 4.50);
		Produto cenoura = new Produto(5840, "Cenoura", 2.40);
		
		carrinho.addProduto(alface);
		carrinho.addProduto(alface);
		carrinho.addProduto(cenoura);
		
		
		Caixa caixa = new Caixa();
		
		caixa.adicionarDesconto(alface, 50);
		
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		
	    return totalCarrinho == 6.9;
	}
}
