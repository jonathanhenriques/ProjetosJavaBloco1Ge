package poo1105.exer3;

import java.util.Scanner;

public class ProdutoEletronico {
	private String nome;
	private String modelo;
	private String marca;
	private String cor;

	static Scanner scan = new Scanner(System.in);
	
	public ProdutoEletronico(String nome, String modelo, String marca, String cor) {
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
	}

	

	static public ProdutoEletronico cadastroProduto() {
		System.out.println("Olá. Informe nome do produto: ");
		String nome = scan.nextLine();
		System.out.println("Informe modelo do produto: ");
		String modelo = scan.next();
		System.out.println("Informe marca do produto:");
		String marca = scan.next();
		System.out.println("Informe cor do produto: ");
		String cor = scan.next();

		ProdutoEletronico celular = new ProdutoEletronico(nome, modelo, marca, cor);
		return celular;
	}

	public void informacoesDoProduto() {
		System.out.println("\n***iNFORMAÇÕES DO PRODUTO ELETRÔNICO***");
		System.out.println("Nome: " + nome);
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
	}

}
