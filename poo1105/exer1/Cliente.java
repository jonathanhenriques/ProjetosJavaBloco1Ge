package poo1105.exer1;

public class Cliente {
	private String nome;
	private String telefone;
	private int idade;
	
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do cliente: " + nome);
		sb.append("\nIdade do cliente: " + idade + " anos");
		sb.append("\nTelefone do cliente: " + telefone);
		return sb.toString();
	}
}
