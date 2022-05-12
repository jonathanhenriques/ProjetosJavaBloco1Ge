package listadepolimorfismo1.exer4;

/*
 4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto funcionário, defina as instancias deste objeto e
   apresente as informações deste objeto no console.
 */

public class Exercicio4 {

	public static void main(String[] args) {
		
		Funcionario funcionario = Funcionario.cadastraFuncionario();
		funcionario.informacoesFuncionario();
	}

}
