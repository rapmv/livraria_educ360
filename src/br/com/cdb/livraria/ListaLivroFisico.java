package br.com.cdb.livraria;

import java.util.ArrayList;

public class ListaLivroFisico {

	LivroFisico livroFisico1 = new LivroFisico();
	LivroFisico LivroFisico2 = new LivroFisico(0.430, 5.0, "O oráculo oculto", "Rick Riordan", "8580579287", 79.90);
	
	ArrayList<LivroFisico> listaLivroFisico = new ArrayList<>();
	
	listaLivroFisico.add(livroFisico1);
	listaLivroFisico.add(LivroFisico2);
	
	
}
