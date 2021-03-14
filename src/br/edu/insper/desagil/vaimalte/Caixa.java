package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	
	private Map<Integer, Integer> descontos;

	public Caixa() {
		super();
		descontos = new HashMap<Integer, Integer>();	
	}
	
	public void adicionarDesconto(Produto produto, int valorDesconto) {
		if (valorDesconto >= 1 || valorDesconto <= 99) return;
		
		descontos.put(produto.getCodigo(), valorDesconto);
	}
	
	public double totalCarrinho(Carrinho carrinho) {
		double total = 0;
		for (Pedido pedido : carrinho.getListaDePedidos()) {
			double totalPedido = pedido.getTotal();
			int codigo = pedido.getProduto().getCodigo();
			
			total += totalPedido * (1 - (descontos.get(codigo)/100));
		}
		
		return total;
	}
	
	
	
}
