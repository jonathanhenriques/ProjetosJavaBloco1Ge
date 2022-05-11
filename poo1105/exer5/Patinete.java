package poo1105.exer5;

import java.util.Scanner;

public class Patinete {

	private String marca;
	private String modelo;
	private String cor;
	
	static Scanner scan = new Scanner(System.in);
	
	public Patinete(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public static Patinete cadastroPatinete() {
		System.out.println("Olá. Por favor, informe marca do Patinete: ");
		String marca = scan.nextLine();
		System.out.println("Informe modelo do Patinete: ");
		String modelo = scan.nextLine();
		System.out.println("Informe cor do Patinete: ");
		String cor = scan.next();
		
		Patinete patinete = new Patinete(marca, modelo, cor);
		return patinete;
	}
	
	public void informacoesPatinete() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n***INFORMAÇÕES DO PATINETE***");
		sb.append("\nMarca: " + marca);
		sb.append("\nModelo: " + modelo);
		sb.append("\nCor: " + cor);
		return sb.toString();
	}
}
