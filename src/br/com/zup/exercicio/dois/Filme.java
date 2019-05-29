package br.com.zup.exercicio.dois;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Item {
	
	// Atributos
	private String genero;
	private int duracao;
	List<String> atores;
	
	// Construtor
	public Filme(String nome, String categoria, String genero, int duracao, List<String> atores) {
		super(nome, categoria);
		this.genero = genero;
		this.duracao = duracao;
		this.atores = atores;
	}

	// Getters & Setters
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}

	// Método toString
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Categoria -> " + super.getCategoria() + "\n";
		modelo += "Gênero -> " + this.getGenero() + "\n";
		modelo += "Duração -> " + this.getDuracao() + "\n";
		modelo += "Atores -> " + this.getAtores() + "\n";
		
		return modelo;
	}	
	
}
