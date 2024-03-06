package br.com.cdb.livraria;

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
	
	
	
}
