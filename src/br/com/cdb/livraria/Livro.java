package br.com.cdb.livraria;

import java.util.ArrayList;
import java.util.Objects;

public class Livro {
	
	private String titulo;
	private String autor;
	private String isbn;
    protected double preco;
    
    public Livro() {
    	
    }
    
	public Livro(String titulo, String autor, String isbn, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calcularPrecoTotal() {
		return preco;
	}
	
	//Procurando se o livro existe e retornando a posição dele na lista
	public int posicaoLivro(ArrayList<Livro> listaLivro, String isbnLivro) {
		
		int posicaoLivro = -1;
		
		for(int i=0; i<listaLivro.size(); i++) {
			if(isbnLivro.equals(listaLivro.get(i).getIsbn())) {
				posicaoLivro = i;
			}
		}
		
		return posicaoLivro;
	}

	public String toString() {
		return "Livro - Titulo = " + titulo + ", Autor = " + autor + ", ISBN = " + isbn + ", Preco = " + String.format("%.2f", preco);
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, isbn, preco, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco)
				&& Objects.equals(titulo, other.titulo);
	}
}

