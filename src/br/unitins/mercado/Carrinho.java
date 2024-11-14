package br.unitins.mercado;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Item> produtos;

    public Carrinho(){
        this.produtos = new ArrayList<>();
    }

    public Boolean addItem(Item item, Integer quantidade){
        produtos.add(item);
        return item.vender(quantidade);
    }
}