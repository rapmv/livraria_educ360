package br.com.cdb.livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VerificarMenu verficarOpcao = new VerificarMenu();
		
		//Linha 14 ate 22 - simula os dados que vem do BD
		ListaLivro criarListaLivro = new ListaLivro();
		//Lista livro Fisico
		ArrayList<LivroFisico> listaLivroFisico = criarListaLivro.criarListaLivroFisico();
		//Lista livro Ebook
		ArrayList<LivroEbook> listaLivroEbook = criarListaLivro.criarListaLivroEbook();
		//lista de todos os Livros
		ArrayList<Livro> listaLivro = new ArrayList<>();
		listaLivro = criarListaLivro.criarListaLivro(listaLivroFisico, listaLivroEbook);
		
		
		Livro livro = new Livro();
		
		ArrayList<Livro> listaCarrinhoDeCompra = new ArrayList<>();
		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra(listaCarrinhoDeCompra);
		
		
		
		int loop = -1;
		int opcao;
		boolean opcaoResultado;
		int posicao;
		String isbnLivro;
		double valorTotal;
		
		while(loop !=0) {
			opcaoResultado = true;	
			System.out.println("===========LIVRARIA==============");
			System.out.println("Digite o primeiro numero da opção que deseja!");
			System.out.println("1-Listar os livros");
			System.out.println("2-Adicionar um livro no carrinho");
			System.out.println("3-Remover um livro do carrinho");
			System.out.println("4-Listar o valor total da compra");
			System.out.println("0-Sair do programa");
			opcao=input.next().charAt(0);
			
			opcaoResultado = verficarOpcao.verificacao(opcao);
			
			if(opcao=='0') {
				loop=0;
				System.out.println("SISTEMA FINALIZADO!");
				break;
			}
			if (opcaoResultado == true) {
				switch(opcao) {
					case '1':
						System.out.println("LISTA DOS LIVROS DISPONIVEIS\n");
						for(int i=0; i<listaLivro.size(); i+=2) {
							System.out.print(listaLivro.get(i).toString());
							System.out.print(", Codigo Ebook: ");
							System.out.println(listaLivro.get(i+1).getIsbn()+"\n");		
						}	
					break;
					case '2':
						System.out.println("Digite o ISBN do livro que deseja adiconar: ");
						isbnLivro = input.next();				
						posicao = livro.posicaoLivro(listaLivro, isbnLivro);
						
						if(posicao!=-1) {
							System.out.println(listaLivro.get(posicao).toString());
							System.out.println("Tem certeza disso?(s/n)");
							opcao=input.next().charAt(0);
							if(opcao=='s') {	
								System.out.println("Item adicionado ao seu carrinho!");
								listaCarrinhoDeCompra = carrinhoDeCompra.adicionarLivroCarrinho(listaCarrinhoDeCompra, listaLivro, isbnLivro);
							}
							else {
								System.out.println("Item não adicionado ao carrinho!");
							}
						}
						else {
							System.out.println("ISBN incorreto!!");
						}
					break;
					case '3':
						System.out.println("Digite o ISBN do livro que deseja remover: ");
						isbnLivro = input.next();				
						posicao = livro.posicaoLivro(listaLivro, isbnLivro);
						
						if(posicao!=-1) {
							System.out.println(listaLivro.get(posicao).toString());
							System.out.println("Tem certeza disso?(s/n)");
							opcao=input.next().charAt(0);
							if(opcao=='s') {	
								System.out.println("Item removido ao seu carrinho!");
								listaCarrinhoDeCompra = carrinhoDeCompra.removerLivroCarrinho(listaCarrinhoDeCompra, isbnLivro);
							}
							else {
								System.out.println("Item não adicionado ao carrinho!");
							}
						}
						else {
							System.out.println("ISBN incorreto!!");
						}
					break;
					case '4':
						valorTotal = carrinhoDeCompra.calcularTotal(listaCarrinhoDeCompra, listaLivroFisico, listaLivroEbook);
						System.out.printf("Valor Total mais o frete: %.2f\n", valorTotal);
						System.out.println("Finalizar compra?(s/n)");
						opcao=input.next().charAt(0);
						if(opcao=='s') {
							listaCarrinhoDeCompra = new ArrayList<>();
							System.out.println("COMPRA FINALIZADA");
						}
						else {
							System.out.println("COMPRA NÃO FINALIZADA");
						}
					break;
				}
			}
			else {
				System.out.println("OPÇÃO NÃO REGISTRADA");
			}
		}
		input.close();
	}

}
