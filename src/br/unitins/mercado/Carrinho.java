package br.unitins.mercado;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Item> produtos;
    Comprador comprador;

    public Carrinho(Comprador comprador){
        this.produtos = new ArrayList<>();
        this.comprador = comprador;
    }

    public Boolean addItem(Item item, Integer quantidade){
        Boolean vendeu = false;
        if(item instanceof Bebida ){
            vendeu =((Bebida) item).vender(quantidade, comprador);
        }

        else {
            vendeu = item.vender(quantidade);
        }
        return vendeu; 
    }
}