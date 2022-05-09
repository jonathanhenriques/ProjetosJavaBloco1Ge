package lacos0905.exer4;
import java.util.Scanner;

/*
 4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
  Para tanto, a cada uma das pessoas era perguntado:
   idade, sexo (1-feminino / 2-masculino / 3-Outros),
    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
     Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
     
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.

 */
public class Exercicio4 {

	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Pessoa[] lista = new Pessoa[150];
		
		pesquisa(lista);
		calculaPesquisa(lista);
		
		scan.close();
	}
	
	public static void pesquisa(Pessoa[] lista) {
		int posicao = 0;
		int idade = 0;
		int personalidade = ' ';
		int sexo = ' ';
		
		while(posicao < lista.length) {
			System.out.println("Insira sua idade: ");
			idade = scan.nextInt();
			System.out.println("Insira seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = scan.nextInt();
			System.out.println("opções (1 - calma / 2 - nervosa / 3 - agressiva)");
			personalidade = scan.nextInt();
			System.out.println("*************************************************************");
			
			lista[posicao] = new Pessoa(idade, sexo, personalidade);
			posicao++;
		}
	}
	
	public static void calculaPesquisa(Pessoa[] lista) {
		
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		//int outrosCalmos = 0;
		int pessoasNervosasMaisDe40Anos = 0;
		int pessoasCalmasComMenosDe18Anos = 0;
		
		for(int i=0; i<lista.length;i++) {
			if(lista[i] == null)
				break;
			else {
				if(lista[i].getPersonalidade() == 1)
					pessoasCalmas++;
				if(lista[i].getSexo() == 1 && lista[i].getPersonalidade() == 2)
					mulheresNervosas++;
				if(lista[i].getSexo() == 2 && lista[i].getPersonalidade() == 3)
					homensAgressivos++;
				if(lista[i].getIdade() >= 40 && lista[i].getPersonalidade() == 2)
					pessoasNervosasMaisDe40Anos++;
				if(lista[i].getIdade() < 18 && lista[i].getPersonalidade() == 1)
					pessoasCalmasComMenosDe18Anos++;
			}
		}
		
		System.out.printf("\nPessoas calmas: %d\nMulheres Nervosas: %d\nHomens Agressivos: %d\nOutros Calmos: ?\n"+
				"Pessoas nervosas com mais de 40 anos: %d\nPessoas calmas com menos de 18 anos: %d",
				pessoasCalmas,mulheresNervosas,homensAgressivos,pessoasNervosasMaisDe40Anos,pessoasCalmasComMenosDe18Anos);
				
				
	}

}
