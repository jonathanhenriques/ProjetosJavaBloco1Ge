package listadepoo2.polimorfismoexer2;

public abstract class Animal {

	private String nome;
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
		
}
