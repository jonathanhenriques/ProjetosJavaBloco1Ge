package listadepolimorfismo1.exer3;

/*
 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe,
  em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e
   apresente as informa��es deste objeto no console.
 */

public class Exercicio3 {

	public static void main(String[] args) {
		
		ProdutoEletronico celular = ProdutoEletronico.cadastroProduto();
		celular.informacoesDoProduto();

	}

}
