package listadepolimorfismo2.herancaexer1;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(".........ÂNW");;
	}
	
	public void subirArvores() {
		System.out.println("<---Subindo Árvores!--->");
	}

}
