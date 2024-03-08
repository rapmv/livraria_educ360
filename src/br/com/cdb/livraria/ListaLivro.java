package br.com.cdb.livraria;

import java.util.ArrayList;
import java.util.List;

public class ListaLivro {
	

	//Lista de Livros FISICOS
	public ArrayList<LivroFisico> criarListaLivroFisico() {
		
		//peso, frete, titulo, autor, isbn, preco
		LivroFisico livroFisico1 = new LivroFisico(0.430, 5.0, "O oráculo oculto", "Rick Riordan", "8580579287", 79.90);
		LivroFisico livroFisico2 = new LivroFisico(0.300, 5.0, "Destrua este diário", "Rogerio Durst", "8580574161", 60.39 );
		LivroFisico livroFisico3 = new LivroFisico(0.480, 5.0, "Amor & Azeitonas", "Viviane Diniz", "6555603070", 65.89);
		LivroFisico livroFisico4 = new LivroFisico(0.220, 5.0, "Uma casa no fundo de um lago", "Fabiana Colasanti", "8551003852", 49.90);
		LivroFisico livroFisico5 = new LivroFisico(0.590, 5.0, "A espada do verão", "Rick Riordan", "8580577950", 89.90);	
		
		ArrayList<LivroFisico> listaLivroFisico = new ArrayList<>();
	
		listaLivroFisico.add(livroFisico1);
		listaLivroFisico.add(livroFisico2);
		listaLivroFisico.add(livroFisico3);
		listaLivroFisico.add(livroFisico4);
		listaLivroFisico.add(livroFisico5);
		
		return listaLivroFisico;
	}
	
	
	//lista de Livros EBOOK
	public ArrayList<LivroEbook> criarListaLivroEbook() {
		
		//tamanhoEmMb, titulo, autor, isbn, preco
		LivroEbook livroEbook1 = new LivroEbook(430.79, "O oráculo oculto", "Rick Riordan", "8580579287E", 79.90);
		LivroEbook livroEbook2 = new LivroEbook(000.60, "Destrua este diário", "Rogerio Durst", "8580574161E", 60.39 );
		LivroEbook livroEbook3 = new LivroEbook(480.65, "Amor & Azeitonas", "Viviane Diniz", "6555603070E", 65.89);
		LivroEbook livroEbook4 = new LivroEbook(590.49, "Uma casa no fundo de um lago", "Fabiana Colasanti", "8551003852E", 49.90);
		LivroEbook livroEbook5 = new LivroEbook(448.89, "A espada do verão", "Rick Riordan", "8580577950E", 89.90);
		
		ArrayList<LivroEbook> listaEbook = new ArrayList<>();
		
		listaEbook.add(livroEbook1);
		listaEbook.add(livroEbook2);
		listaEbook.add(livroEbook3);
		listaEbook.add(livroEbook4);
		listaEbook.add(livroEbook5);
		
		return listaEbook;
	}
	
	public ArrayList<Livro> criarListaLivro(ArrayList<LivroFisico> listaLivroFisico, ArrayList<LivroEbook> listaLivroEbook ){
		
		ArrayList<Livro> listaLivro = new ArrayList<>();
		
		//converte os LivrosFisico e LivroEbook para somente Livro
		for(int i=0; i<listaLivroFisico.size(); i++) {
			listaLivro.add((Livro) listaLivroFisico.get(i));
			listaLivro.add((Livro) listaLivroEbook.get(i));
		}
		
		return listaLivro;
	}
	
}
