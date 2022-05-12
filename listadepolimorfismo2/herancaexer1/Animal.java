package listadepolimorfismo2.herancaexer1;

public abstract class Animal {

	protected String nome;
	protected int idade;
	
	
	protected Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	protected String getNome() {
		return this.nome;
	}
	
	protected int getIdade() {
		return this.idade;
	}
	
	public void emitirSom() {
		
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("***\nINFORMAÇÕES DO ANIMAL***");
		sb.append("\nnome: " + this.nome);
		sb.append("\nidade: " + this.idade);
		return sb.toString();
	}
	
	
	
	
}
