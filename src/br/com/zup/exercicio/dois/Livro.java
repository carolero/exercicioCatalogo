package br.com.zup.exercicio.dois;

public class Livro extends Item{
	
	// Atributos
	private String autor;
	private int paginas;
	
	// Construtor
	public Livro(String nome, String categoria, String autor, int paginas) {
		super(nome, categoria);
		this.autor = autor;
		this.paginas = paginas;
	}

	// Getters & Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	// Método toString
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Categoria -> " + super.getCategoria() + "\n";
		modelo += "Autor -> " + this.getAutor() + "\n";
		modelo += "Páginas -> " + this.getPaginas() + "\n";
		
		return modelo;
	}	

}
