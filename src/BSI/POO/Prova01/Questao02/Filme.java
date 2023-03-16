package BSI.POO.Prova01.Questao02;

public class Filme {
	// Variáveis
	private String titulo;
	private int duracaoEmMinutos;
	
	// Métodos - Getters e Setters
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	// Método - Construtor
	/*
	 * Cria um filme vazio
	 */
	public Filme() {
		
	}
	
	/*
	 * Cria um filme
	 * @param titulo para inserir o titulo do filme
	 * @param duracaoEmMinutos para inserir a duração em minutos do filme
	 */
	public Filme(String titulo, int duracaoEmMinutos) {
		this.titulo = titulo;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	// Método - 
	public String exibirDUracaoEmHoras() {
		return "O "+this.titulo+" possui "+this.duracaoEmMinutos/60+" horas e "+this.duracaoEmMinutos%60+" minutos de duração.";
	}
}
