package br.unitins.mercado;

import java.time.LocalDate;

public class Bebida extends Alimento {
    public Bebida(LocalDate validade){
        super(validade);
    }

    public Boolean vender(Integer quantidade, Comprador comprador){
        if(comprador.getIdade()>=18) {
            return super.vender(quantidade);
        }
        return false;
    }
}
