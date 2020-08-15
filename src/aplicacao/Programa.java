package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objeto.Produto;

public class Programa {

	public static void main(String[] args) {

		List<Produto> listaProdutos = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		char resposta1;

		System.out.println("Bem vindo ao sistema de controle de estoque.");

		do {

			System.out.println("Deseja cadastrar algum produto no estoque? (Digite s ou n)");

			resposta1 = sc.next().charAt(0);

		}

		while (resposta1 != 's' || resposta1 != 'n');

		char s = resposta1;

		if (resposta1 == s) {

			System.out.println("Digite a quantidade de produtos que deseja cadastrar");

			int quantidade_de_produtos = sc.nextInt();

			for (int i = 1; i <= quantidade_de_produtos; i++) {

				System.out.println("Digite os dados do produto");
				System.out.print("ID: ");
				int ID = sc.nextInt();

				System.out.println("Digite os dados do produto");
				System.out.print("Nome: ");
				String nome = sc.next();

				System.out.print("Preço: ");
				double preco_do_produto = sc.nextDouble();

				System.out.print("quantidade: ");
				int quantidade_inicial = sc.nextInt();

				Produto produto1 = new Produto(ID, nome, preco_do_produto, quantidade_inicial);

				listaProdutos.add(produto1);

				System.out.println(produto1 + "Produto cadastrado no estoque.");
			}
		}

		System.out.println();
		System.out.println("Deseja fazer alguma operação de entrada ou retirada do estoque? (Digite s ou n)");

		char resposta2 = sc.next().charAt(0);
		char k = resposta2;

		if (k == s) {

			System.out.print("Digite o ID do protudo: ");
			int id_Produto_Alteracao = sc.nextInt();

			Produto produto3 = listaProdutos.stream().filter(x -> x.getId_Produto() == id_Produto_Alteracao).findFirst()
					.orElse(null);

			if (produto3 == null) {
				System.out.println("O ID digitado é inválido");
			}

			else {

				System.out.print("Digite E para dar entrada em algum produto ou R para fazer uma retirada");
				String entrada_ou_retirada = sc.next();

				if (entrada_ou_retirada.equals("r")) {

					System.out.print("Digite uma quantidade a ser adicionada no estoque: ");
					int quantidade_adc = sc.nextInt();

					produto3.adicionarEstque(quantidade_adc);
					System.out.println(produto3);
				}

				if (entrada_ou_retirada.equals("a")) {

					System.out.print("Digite uma quantidade a ser adicionada no estoque: ");
					int quantidade_adc = sc.nextInt();

					produto3.adicionarEstque(quantidade_adc);
					System.out.println(produto3);
				}
			}
		}
	}

}
