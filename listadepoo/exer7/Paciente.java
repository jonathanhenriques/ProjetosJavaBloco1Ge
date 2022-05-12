package listadepoo.exer7;

import java.util.Scanner;

public class Paciente {
	
	private String nome;
	private String planoDeSaude;
	private String especialidade;
	
	static Scanner scan = new Scanner(System.in);
	
	public Paciente(String nome, String planoDeSaude, String especialidade) {
		this.nome = nome;
		this.planoDeSaude = planoDeSaude;
		this.especialidade = especialidade;
	}
	
	public static Paciente cadastraPaciente() {
		System.out.println("Olá. Informe nome do Paciente: ");
		String nome = scan.nextLine();
		System.out.println("Informe Plano de Saúde do Paciente: ");
		String planoDeSaude = scan.next();
		System.out.println("Informe especialidade: ");
		scan.nextLine();
		String especialidade = scan.nextLine();
		
		Paciente paciente = new Paciente(nome, planoDeSaude, especialidade);
		return paciente;
	}
	
	public void informacoesPaciente() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("***INFORMAÇÕES DO PACIENTE***");
		sb.append("\nNome: " + nome);
		sb.append("\nPlano de Saúde: " + planoDeSaude);
		sb.append("\nEspecialidade: " + especialidade);
		return sb.toString();
	}

}
