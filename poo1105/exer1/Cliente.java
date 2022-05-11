package poo1105.exer1;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private String telefone;
	private int idade;
	
	static Scanner scan = new Scanner(System.in);
	
	public Cliente(String nome, String telefone, int idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public static Cliente cadastraCliente() {
		int idade = 0;

		System.out.println("Olá, informe seu nome: ");
		String nome = scan.nextLine();
		try {
			System.out.println(nome + ", Insira sua idade: ");
			idade = scan.nextInt();
		} catch (Exception e) {
			System.err.println("Insira somente números!");
		}
		System.out.println("Agora insira seu telefone: [99999-9999]");
		scan.nextLine();
		String telefone = scan.next();

		Cliente cliente = new Cliente(nome, telefone, idade);
		return cliente;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do cliente: " + nome);
		sb.append("\nIdade do cliente: " + idade + " anos");
		sb.append("\nTelefone do cliente: " + telefone);
		return sb.toString();
	}
}
