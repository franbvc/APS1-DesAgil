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
	    return false;
	}

	public boolean testeE() {
	    return false;
	}
}
