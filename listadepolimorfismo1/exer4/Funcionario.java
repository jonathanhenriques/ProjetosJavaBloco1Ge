package listadepolimorfismo1.exer4;

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

		double salario = 0.0;
		try {
			System.out.println("Informe salário do funcionário: ");
			salario = scan.nextDouble();
		} catch (Exception e) {
			System.err.println("Insira somente números!");
		}

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
		sb.append("\nNome: " + nome);
		sb.append("\nCargo: " + cargo);
		sb.append("\nSalário: R$" + salario);
		return sb.toString();
	}

}
