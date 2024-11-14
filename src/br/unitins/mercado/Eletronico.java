package br.unitins.mercado;

public class Eletronico extends Item {
    
    @Override
    public Boolean vender(Integer quantidade){
        if(getQuantidadeDisponivel()>quantidade){
            setQuantidadeDisponivel(getQuantidadeDisponivel()-quantidade);
            return true;
        }
        return false;
    }
}