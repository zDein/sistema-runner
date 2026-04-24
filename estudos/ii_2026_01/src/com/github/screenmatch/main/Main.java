package com.github.screenmatch.main;

import java.util.ArrayList;

import exercicios.lists_and_collections.Produto;
import exercicios.lists_and_collections.ProdutoPerecivel;

public class Main {

	public static void main(String[] args) {

		var listaDeProdutos = new ArrayList<Produto>();

		Produto produto1 = new Produto("Cheetos Sabor Requeijão 90g", 10, 30);
		Produto produto2 = new Produto("M&M Amendoim 120g", 15, 15);
		Produto produto3 = new Produto("Pringles Tradicional", 12, 20);

		listaDeProdutos.add(produto1);
		listaDeProdutos.add(produto2);
		listaDeProdutos.add(produto3);

		/*
		produto1.setNome("Correia Dentada");
		produto1.setPreco(80);
		produto1.setQuantidade(20);
		
		produto2.setNome("Anel Oring");
		produto2.setPreco(2);
		produto2.setQuantidade(15);
		
		produto1.setNome("Cambio de Marcha");
		produto1.setPreco(250);
		produto1.setQuantidade(2);
		
		*/
		
		System.out.println("Lista de produtos:\n" + listaDeProdutos);

		var produtoPerecivel = new ProdutoPerecivel("Carne Vegana", 50, 10, "24/04/2030");
		
		
		System.out.println(produtoPerecivel);
	}

}
