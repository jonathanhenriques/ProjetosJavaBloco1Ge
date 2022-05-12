package listadepolimorfismo1.exer3;

/*
 3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e
   apresente as informações deste objeto no console.
 */

public class Exercicio3 {

	public static void main(String[] args) {
		
		ProdutoEletronico celular = ProdutoEletronico.cadastroProduto();
		celular.informacoesDoProduto();

	}

}
