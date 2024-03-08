package br.com.cdb.livraria;

import java.util.ArrayList;
import java.util.Objects;

public class CarrinhoDeCompra {
	
	private ArrayList<Livro> listaLivro;
	
	
	public CarrinhoDeCompra(ArrayList<Livro> listaLivro) {
		this.listaLivro = listaLivro;
	}

	
	public ArrayList<Livro> getListaLivro() {
		return listaLivro;
	}

	public void setListaLivro(ArrayList<Livro> listaLivro) {
		this.listaLivro = listaLivro;
	}
	

	// calcula o preço de todos o livros no carrinho
	public double calcularTotal(ArrayList<Livro> listaCarrinho,	ArrayList<LivroFisico> listaLivroFisico, ArrayList<LivroEbook> listaLivroEbook) {
		
		double valorTotalCarrinho = 0;
		
		for(int i = 0; i<listaCarrinho.size(); i++) {
			for(int j = 0; j<listaLivroFisico.size(); j++) {
				if(listaCarrinho.get(i).getIsbn().equals(listaLivroFisico.get(j).getIsbn())){
					valorTotalCarrinho += listaLivroFisico.get(j).calcularPrecoTotal();
				}
				if(listaCarrinho.get(i).getIsbn().equals(listaLivroEbook.get(j).getIsbn())) {
					valorTotalCarrinho += listaLivroEbook.get(j).calcularPrecoTotal();					
				}
			}
			
		}
		return valorTotalCarrinho;
	}
	
	//Adiciona o livro no carrinho
	public ArrayList<Livro> adicionarLivroCarrinho(ArrayList<Livro> listaCarrinhoDeCompra, ArrayList<Livro> listaLivro, String isbn){
		
		for(int i=0; i<listaLivro.size(); i++) {
			if(isbn.equals(listaLivro.get(i).getIsbn())) {
				listaCarrinhoDeCompra.add(listaLivro.get(i));
				break;
			}
		}
		
		return listaCarrinhoDeCompra;
	}
	
	public ArrayList<Livro> removerLivroCarrinho(ArrayList<Livro> listaCarrinhoDeCompra, String isbn){
		
		for(int i=0; i<listaLivro.size(); i++) {
			if(isbn.equals(listaCarrinhoDeCompra.get(i).getIsbn())) {
				listaCarrinhoDeCompra.remove(listaCarrinhoDeCompra.get(i));	
				break;
			}
		}
		
		return listaCarrinhoDeCompra;
	}


	@Override
	public int hashCode() {
		return Objects.hash(listaLivro);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarrinhoDeCompra other = (CarrinhoDeCompra) obj;
		return Objects.equals(listaLivro, other.listaLivro);
	}
	
}
