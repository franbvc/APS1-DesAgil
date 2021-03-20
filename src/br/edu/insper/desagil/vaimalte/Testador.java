package br.edu.insper.desagil.vaimalte;

import static org.junit.Assert.assertEquals;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		
	    	assertEquals(0.0, totalCarrinho, 0.000001);
	    
	    	return true;
	}

	public boolean testeB() {
		Produto produto1 = new Produto(5839, "Alface", 3.50);
		Carrinho carrinho = new Carrinho();
		carrinho.addProduto(produto1);
		Caixa caixa = new Caixa();
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		
		assertEquals(3.50, totalCarrinho, 0.000001);
		
	    	return true;
	}

	public boolean testeC() {
		Produto produto1 = new Produto(5839, "Alface", 3.50);
		Carrinho carrinho = new Carrinho();
		carrinho.addProduto(produto1);
		Caixa caixa = new Caixa();
		caixa.adicionarDesconto(produto1, 20);
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		
		assertEquals(2.80, totalCarrinho, 0.000001);
		
	    	return true;
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
		
		assertEquals(7.05, totalCarrinho, 0.000001);
		
	    	return true;
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
		
		assertEquals(6.9, totalCarrinho, 0.000001);
		
	    	return true;
	}
}
