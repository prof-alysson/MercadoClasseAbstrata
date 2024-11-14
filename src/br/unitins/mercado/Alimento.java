package br.unitins.mercado;

import java.time.LocalDate;

public class Alimento extends Item {
    LocalDate dataValidade;

    public Alimento(LocalDate validade){
        super();
        this.dataValidade = validade;
    }

    @Override
    public Boolean vender(Integer quantidade){
        LocalDate agora = LocalDate.now();
        if((agora.isBefore(this.dataValidade)) && (this.quantidadeDisponivel > quantidade)){
            this.quantidadeDisponivel -= quantidade;
            return true;
        }
        else{
            return false;
        }
        
    }
}