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

		System.out.println("Ol�. Por favor, informe nome do funcion�rio: ");
		String nome = scan.nextLine();
		System.out.println("Informe cargo do funcion�rio: ");
		String cargo = scan.nextLine();

		double salario = 0.0;
		try {
			System.out.println("Informe sal�rio do funcion�rio: ");
			salario = scan.nextDouble();
		} catch (Exception e) {
			System.err.println("Insira somente n�meros!");
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
		sb.append("\n***INFORMA��ES DO FUNCION�RIO***");
		sb.append("\nNome: " + nome);
		sb.append("\nCargo: " + cargo);
		sb.append("\nSal�rio: R$" + salario);
		return sb.toString();
	}

}
