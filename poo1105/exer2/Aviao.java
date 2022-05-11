package poo1105.exer2;

public class Aviao {
	private String companhiaAerea;
	private String modelo;
	private String cor;
	private int numeroDeLugares;

	public Aviao(String companhiaAerea, String modelo, String cor, int numeroDeLugares) {
		this.companhiaAerea = companhiaAerea;
		this.modelo = modelo;
		this.cor = cor;
		this.numeroDeLugares = numeroDeLugares;
	}

	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getNumeroDeLugares() {
		return numeroDeLugares;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n***Características Do Avião**\n");
		sb.append("Companhia Aérea Responsável: " + companhiaAerea);
		sb.append("\nModelo do Avião: " + modelo);
		sb.append("\nCor do Avião: " + cor);
		sb.append("\nN° de lugares no Avião: " + numeroDeLugares);
		return sb.toString();
	}

}
