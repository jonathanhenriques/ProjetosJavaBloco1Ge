package listadepolimorfismo2.herancaexer1;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Relinchar!");;
	}
	
	public void correr() {
		System.out.println("<---Correndo!!!--->");
	}
}
