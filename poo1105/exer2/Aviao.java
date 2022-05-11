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
		sb.append("\n***Caracter�sticas Do Avi�o**\n");
		sb.append("Companhia A�rea Respons�vel: " + companhiaAerea);
		sb.append("\nModelo do Avi�o: " + modelo);
		sb.append("\nCor do Avi�o: " + cor);
		sb.append("\nN� de lugares no Avi�o: " + numeroDeLugares);
		return sb.toString();
	}

}
