package listadepoo2.polimorfismoexer2;

public class Cachorro extends Animal{
	
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Auauauauauuuuuuu!");;
	}
	
	public void correr() {
		System.out.println("<---Correndo!!!--->");
	}
	

}
