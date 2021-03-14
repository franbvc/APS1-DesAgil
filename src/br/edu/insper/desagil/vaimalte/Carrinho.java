package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Pedido> listaDePedidos;

    public Carrinho() {
        super();
        this.listaDePedidos = new ArrayList<Pedido>();
    }

    public void addProduto(Produto produto) {
        
        for (Pedido x: listaDePedidos) {
            if (x.getProduto().getCodigo() == produto.getCodigo()) {
                x.incrementa();
                return;
            }
        }
        
        listaDePedidos.add(new Pedido(produto));
        
    }
    
    public List<Pedido> getListaDePedidos() {
        return listaDePedidos;
    }
    
}
