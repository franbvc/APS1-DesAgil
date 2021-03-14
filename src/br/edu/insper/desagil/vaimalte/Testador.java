package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		
	    return totalCarrinho == (double) 0;
	}

	public boolean testeB() {
		Produto produto1 = new Produto(5839, "Alface", 3.50);
		Carrinho carrinho = new Carrinho();
		carrinho.addProduto(produto1);
		Caixa caixa = new Caixa();
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		
	    return totalCarrinho == (double) 3.50;
	}

	public boolean testeC() {
		Produto produto1 = new Produto(5839, "Alface", 3.50);
		Carrinho carrinho = new Carrinho();
		carrinho.addProduto(produto1);
		Caixa caixa = new Caixa();
		caixa.adicionarDesconto(produto1, 50);
		double totalCarrinho = caixa.totalCarrinho(carrinho);
		System.out.println(totalCarrinho);
		
	    return totalCarrinho == 1.75;
	}

	public boolean testeD() {
	    return false;
	}

	public boolean testeE() {
	    return false;
	}
}
