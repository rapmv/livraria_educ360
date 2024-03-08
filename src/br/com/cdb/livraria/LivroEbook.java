package br.com.cdb.livraria;

import java.util.Objects;

public class LivroEbook extends Livro{

	private double tamanhoEmMb;
	
	public LivroEbook() {
		super();
	}

	public LivroEbook(double tamanhoEmMb, String titulo, String autor, String isbn, double preco) {
		super(titulo, autor, isbn, preco);
		this.tamanhoEmMb = tamanhoEmMb;
	}

	public double getTamanhoEmMb() {
		return tamanhoEmMb;
	}

	public void setTamanhoEmMb(double tamanhoEmMb) {
		this.tamanhoEmMb = tamanhoEmMb;
	}

	@Override
	public String toString() {
		
		return super.toString()+ ", Tamanho do Arquivo="+ String.format("%.3f", tamanhoEmMb);
	}
	
	
	
}
