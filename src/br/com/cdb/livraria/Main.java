package br.com.cdb.livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VerificarMenu verficarOpcao = new VerificarMenu();
		
		
		
		
		ListaLivro criarLista = new ListaLivro();
		//Lista livro Fisico
		ArrayList<LivroFisico> listaLivroFisico = criarLista.criarListaLivroFisico();
		//Lista livro Ebook
		ArrayList<LivroEbook> listaLivroEbook = criarLista.criarListaLivroEbook();
		
		int loop = -1;
		int opcao;
		boolean opcaoResultado;
		
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
						
					break;
					case '2':
						System.out.println("opcao 2");
					break;
					case '3':
						System.out.println("opcao 3");
					break;
					case '4':
						System.out.println("opcao 4");
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
