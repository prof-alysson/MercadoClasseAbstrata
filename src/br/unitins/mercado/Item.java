package br.unitins.mercado;

public abstract class Item {
    private String nome;
    private Double preco;
    protected Integer quantidadeDisponivel=10;

    public abstract Boolean vender(Integer quantidade);

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public Double getPreco(){
        return this.preco;
    }

    protected void setQuantidadeDisponivel(Integer quantidade){
        quantidadeDisponivel = quantidade;
    }

    public Integer getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }
}