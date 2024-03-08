package br.com.cdb.livraria;

import java.util.Objects;

public class LivroFisico extends Livro{

	private double peso;
	private double frete;
	
	public LivroFisico() {
		super();
	}
			
	public LivroFisico(double peso, double frete, String titulo, String autor, String isbn, double preco) {
		super(titulo, autor, isbn, preco);
		this.peso = peso;
		this.frete = frete;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	@Override
	public double calcularPrecoTotal() {
		return preco+frete;
	}

	@Override
	public String toString() {
		return super.toString() + ", Peso = " +  String.format("%.2f", peso);
	}
}
