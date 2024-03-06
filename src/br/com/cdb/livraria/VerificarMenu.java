package br.com.cdb.livraria;

public class VerificarMenu {
	
	private char [] listaOpcoes = {'0', '1', '2', '3', '4'};

	public boolean verificacao(int opcao) {
		
		boolean resultado = false;
		
		for(int i=0; i<listaOpcoes.length; i++) {
			if(listaOpcoes[i]==opcao) {
				resultado=true;
			}
		}
		return resultado;
	}
}
