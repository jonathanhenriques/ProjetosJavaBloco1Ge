package poo1105.exer4;

import java.util.Scanner;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	
	static Scanner scan = new Scanner(System.in);
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public static Funcionario cadastraFuncionario() {
		
		System.out.println("Olá. Por favor, informe nome do funcionário: ");
		String nome = scan.nextLine();
		System.out.println("Informe cargo do funcionário: ");
		String cargo = scan.nextLine();
		System.out.println("Informe salário do funcionário: ");
		double salario = scan.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, cargo, salario);
		
		return funcionario;
	}
	
	public void informacoesFuncionario() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n***INFORMAÇÕES DO FUNCIONÁRIO***");
		sb.append("\nNome do funcionário: " + nome);
		sb.append("\nCargo do funcionário: " + cargo);
		sb.append("\nSalário do funcionário: " + salario);
		return sb.toString();
	}
	
}
