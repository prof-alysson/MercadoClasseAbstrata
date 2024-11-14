package br.unitins.mercado;

import java.time.LocalDate;

public class Comprador {
    private String nome;
    private LocalDate dataNascimento;

    public Comprador(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Integer getIdade(){
        LocalDate agora = LocalDate.now();
        return agora.getYear() - dataNascimento.getYear();
    }
}
