package poo1105.exer6;

import java.util.Scanner;

public class ContaBancaria {
	private String cliente;
	private double saldo;
	private String conta;
	private int agencia;
	
	static Scanner scan = new Scanner(System.in);
	
	public ContaBancaria(String cliente, double saldo, String conta, int agencia) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.conta = conta;
		this.agencia = agencia;
	}
	
	public static ContaBancaria criaContaBancaria() {
		System.out.println("Ol�, Por favor, informe seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Informe n� da conta: ");
		String numeroConta = scan.next();
		
		double saldo = 0.0;
		int agencia = 0;
		try {
			System.out.println("Informe seu saldo: ");
			saldo = scan.nextDouble();
			
			System.out.println("Informe ag�ncia: ");
			agencia = scan.nextInt();
		}catch (Exception e) {
			System.err.println("Insira somente n�meros!");
		}
		
		ContaBancaria conta = new ContaBancaria(nome, saldo, numeroConta, agencia) ;
		return conta;
	}
	
	public void informacoesDaConta() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n***INFORMA��ES DA CONTA BANC�RIA***");
		sb.append("\nCliente: " + cliente);
		sb.append("\nSaldo em conta: R$" + saldo);
		sb.append("\nN� da conta: " + conta);
		sb.append("\nN� da Ag�ncia: " + agencia);
		return sb.toString();
	}

}
