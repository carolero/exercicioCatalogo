package br.com.zup.exercicio.dois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCatalogo {

	public static void main(String[] args) {
		
		// Inicia o scanner para as escolhas
		Scanner entradaEscolhas = new Scanner(System.in);
	
		// Escolha da opção
		System.out.println("Digite: ");
		System.out.println("1 para adicionar um filme");
		System.out.println("2 para adicionar um livro");
		System.out.println("3 para adicionar uma música");
		int escolha = entradaEscolhas.nextInt();
		
		// Validando a opção escolhida
		if (escolha == 1) {
			// FILME
			Scanner entradaFilme = new Scanner(System.in);
			System.out.println("Qual o nome do filme?");
			String nome = entradaFilme.nextLine();
			
			System.out.println("Qual a categoria?");
			String categoria = entradaFilme.nextLine();
			
			System.out.println("Qual o genero?");
			String genero = entradaFilme.nextLine();
			
			System.out.println("Qual a duração?");
			int duracao = entradaFilme.nextInt();
			
			// Variavel para controle do loop
			int controle = 1;
			
			// Cria a lista de atores do filme
			List<String> atores = new ArrayList<String>();
			
			// Adicionando atores à lista
			while (controle == 1) {
				Scanner entradaAtor = new Scanner(System.in);
				System.out.println("Qual o nome do ator?");
				String novoAtor = entradaAtor.nextLine();
				atores.add(novoAtor);
								
				Scanner controleAdicionar = new Scanner(System.in);
				System.out.println("Para adicionar outro ator digite 1, para parar digite 0");
				controle = controleAdicionar.nextInt();
			}
			
			// Mostrando todos os itens catalogados
			Filme filmes = new Filme(nome, categoria, genero, duracao, atores);
			System.out.println(filmes);
			
			entradaFilme.close();
			
		} else if (escolha == 2) {
			// LIVRO
			Scanner entradaLivro = new Scanner(System.in);
			
			System.out.println("Qual o título?");
			String nome = entradaLivro.nextLine();
			
			System.out.println("Qual a categoria?");
			String categoria = entradaLivro.nextLine();
			
			System.out.println("Quem é o autor?");
			String autor = entradaLivro.nextLine();
			
			System.out.println("Quantas páginas tem?");
			int paginas = entradaLivro.nextInt();
			
			// Mostrando todos os itens catalogados
			Livro livros = new Livro(nome, categoria, autor, paginas);
			System.out.println(livros);
			
			entradaLivro.close();
			
		} else if (escolha == 3) {
			// MUSICA
			Scanner entradaMusica = new Scanner(System.in);
			
			System.out.println("Qual o nome da música?");
			String nome = entradaMusica.nextLine();
			
			System.out.println("Qual a categoria?");
			String categoria = entradaMusica.nextLine();
			
			System.out.println("Quem é o cantor?");
			String cantor = entradaMusica.nextLine();
			
			System.out.println("De qual banda ele é?");
			String banda = entradaMusica.nextLine();
			
			System.out.println("Qual o gênero?");
			String genero = entradaMusica.nextLine();
			
			// Mostrando todos os itens catalogados
			Musica musicas = new Musica(nome, categoria, cantor, banda, genero);
			System.out.println(musicas);
			
			entradaMusica.close();
			
		} else {
			System.out.println("Opção invalida");
		}
	entradaEscolhas.close();
	}

}
