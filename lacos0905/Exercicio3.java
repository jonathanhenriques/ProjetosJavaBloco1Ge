package lacos0905;
import java.util.Scanner;

/*
 3-	Solicitar a idade de várias pessoas e imprimir:
  Total de pessoas com menos de 21 anos.
   Total de pessoas com mais de 50 anos.
    O programa termina quando idade for =-99. (WHILE)
 */

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0;
		int total21Anos = 0;
		int totalMais50Anos = 0;
		
		System.out.println("Informe sua idade: ");
		idade = scan.nextInt();
		while(idade != -99) {
			
			
			if(idade < 21)
				total21Anos++;
			else
				if(idade > 50)
				totalMais50Anos++;
				
			try {
				System.out.println("Informe sua idade: ");
				idade = scan.nextInt();
			}catch (Exception e) {
				System.err.println("Insira somente números inteiros!");
				idade = -99;
			}
		}
		
		System.out.printf("Menores de 21 anos: %d pessoas | Maiores de 50 anos: %d pessoas", total21Anos, totalMais50Anos);
		

		scan.close();
	}

}
