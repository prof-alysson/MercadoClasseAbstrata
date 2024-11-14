package br.unitins;

import br.unitins.mercado.*;
import java.time.LocalDate;

public class MercadoTester {

    public static void main (String[] args){
        Carrinho carrinhoCompra = new Carrinho();

        Alimento arroz = new Alimento(LocalDate.of(2024,12,31));
        arroz.setNome("Arroz");
        arroz.setPreco(38.0);

        Eletronico iphone = new Eletronico();
        iphone.setNome("iPhone 16 PRO MAX ULTRA MEGA TURBO");
        iphone.setPreco(10000000.0);

        Livro livro = new Livro();
        livro.setNome("O Senhor dos Anéis - A sociedade do anel");
        livro.setPreco(58.0);

        if(carrinhoCompra.addItem(arroz, 3)) {
            System.out.printf("Vendeu %s, sobrou %d\n", arroz.getNome(), arroz.getQuantidadeDisponivel());
        }
        else {
            System.out.println("Não vendeu o Arroz");
        }

        if(carrinhoCompra.addItem(iphone, 1)){
            System.out.printf("Vendeu %s, sobrou %d\n", iphone.getNome(), iphone.getQuantidadeDisponivel());
        }
        else {
            System.out.printf("Não vendeu o %s\n", iphone.getNome());
        }

        if(carrinhoCompra.addItem(livro, 3)){
            System.out.printf("Vendeu %s, sobrou %d\n", livro.getNome(), livro.getQuantidadeDisponivel());
        }
        else {
            System.out.printf("Não vendeu o %s\n", livro.getNome());
        }
    }


}