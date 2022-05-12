package listadepoo2.polimorfismoexer2;

public class Exercicio2 {

	public static void main(String[] args) {
		Cachorro doguinho = new Cachorro("Nick", 11);
		Cavalo pegasus = new Cavalo("Pegasus", 25);
		Preguica preguicinha = new Preguica("Lua", 5);

		emitirSom(doguinho);
		emitirSom(pegasus);
		emitirSom(preguicinha);

	}

	public static void emitirSom(Animal obj) {
		obj.emitirSom();
	}

}
