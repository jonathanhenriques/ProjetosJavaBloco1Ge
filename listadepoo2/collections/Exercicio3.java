package listadepoo2.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 3-	Crie uma um programa para trabalhar com estoque de uma loja,
  o programa dever� trabalhar com Collection do tipo List do Java
   para manipular os dados desse estoque,
    o programa dever� atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

 */
public class Exercicio3 {

	static Scanner scan = new Scanner(System.in);
	static List<Item> estoque = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("***ACESSANDO ESTOQUE***");
		String opcao = " ";
		do {
			System.out.println("1 - Registrar Produto");
			System.out.println("2 - Remover Produto");
			System.out.println("3 - Atualizar Produto");
			System.out.println("4 - Listar Estoque");
			System.out.print("--> ");
			opcao = scan.next();
			switch (opcao) {
			case "1":
				System.out.println("case 1");
				registraProduto();
				break;
			case "2":
				System.out.println("case 2");
				removerProduto();
				break;
			case "3":
				System.out.println("case 3");
				atualizarProduto();
				break;
			case "4":
				System.out.println("case 4");
				listarProdutos();
				break;
			case "0":
				System.out.println("Saindo... At� logo!");
				opcao = "0";
				break;
			default:
				System.out.println("Op��o inv�lida!");
				opcao = " ";
				break;
			}

		} while (opcao != "0");

	}

	public static Boolean verificaSeEstoqueVazio() {
		if (estoque.size() == 0) {
			System.out.println("Estoque Vazio!");
			return true;
		}
		return false;
		
	}
	
	public static void listarProdutos() {
		if(verificaSeEstoqueVazio())
			return;
		

		int contador = 0;
		for (Item i : estoque) {
			System.out.println("n�" + (contador + 1) + " - " + i.getNome() + " - R$" + i.getPreco());
			contador++;
		}
		System.out.println("Fim");
		System.out.println();
	}

	public static void registraProduto() {
		
		System.out.print("Insira nome do Produto: ");
		scan.nextLine();
		String nomeProduto = scan.nextLine();
		double precoProduto = 0.0;
		try {
			System.out.print("Insira pre�o do Produto: ");
			precoProduto = scan.nextDouble();
		}catch (Exception e) {
			System.out.println("Insira n�meros");
			return;
		}
		
		

		estoque.add(new Item(nomeProduto, precoProduto));

		System.out.println(estoque.get(estoque.size() - 1).getNome() + " == Registrado!\n");

	}

	public static void removerProduto() {
		if(verificaSeEstoqueVazio())
			return;

		listarProdutos();
		System.out.print("Informe o n� do Item: ");
		int posicaoProduto = scan.nextInt() - 1;

		if (posicaoProduto > estoque.size() || posicaoProduto < 0) {
			System.out.println("Posi��o inv�lida!");
			return;
		}
		String nomeProduto = estoque.get(posicaoProduto).getNome();
		estoque.remove(posicaoProduto);
		System.out.println(nomeProduto + " == Removido!");
	}

	public static void atualizarProduto() {
		if(verificaSeEstoqueVazio())
			return;

		listarProdutos();
		System.out.print("Informe o n� do Item: ");
		int posicaoProduto = scan.nextInt() - 1;

		if (posicaoProduto > estoque.size() || posicaoProduto < 0) {
			System.out.println("Posi��o inv�lida!");
			return;
		}

		String escolha = " ";
		String nomeProduto;
		double valorProduto;
		while(escolha != "0") {
			System.out.println("1 - Alterar nome | 2 - Alterar pre�o");
			System.out.print("--> ");
			escolha = scan.next();
			switch (escolha) {
			
			case "1":
				System.out.print("Insira novo nome: ");
				escolha = scan.next();
				nomeProduto = scan.nextLine();
				estoque.get(posicaoProduto).setNome(nomeProduto);
				escolha = "0";
				break;
			case "2":
				System.out.print("Insira novo Pre�o: ");
				valorProduto = scan.nextDouble();
				estoque.get(posicaoProduto).setPreco(valorProduto);
				escolha = "0";
				break;

			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		}

		
		System.out.println(estoque.get(posicaoProduto) + " == Atualizado!");

	}

}
