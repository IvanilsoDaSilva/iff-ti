package BSI.POO.Prova01.Questao01;

public class Livro {
	// Variáveis
	private String titulo;
	private int qtdPaginas, paginasLidas;
	
	// Métodos - Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	
	// Método - Construtor
	/*
	 * Cria um livro vazio
	 */
	public Livro() {
	}
	
	/*
	 * Cria um livro
	 * @param titulo para inserir o titulo do livro
	 * @param qtdPaginas para inserir a quantidade de paginas do livro
	 */
	public Livro(String titulo, int qtdPaginas) {
		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
	}
	
	// Métodos - Outros
	public String verificarProgresso() {
		double porcentagem = this.paginasLidas * 100/this.qtdPaginas;
		return "Você leu "+porcentagem+" por cento do livro";
	}
}
