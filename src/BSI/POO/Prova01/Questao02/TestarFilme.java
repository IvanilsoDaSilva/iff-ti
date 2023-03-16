package BSI.POO.Prova01.Questao02;

public class TestarFilme {
	public static void main(String[] args) {
		// Filme1
		Filme filme1 = new Filme();
		
		filme1.setTitulo("Os Vingadores");
		filme1.setDuracaoEmMinutos(142);
		System.out.println(filme1.exibirDUracaoEmHoras()+"\n");
		
		// Filme2
		Filme filme2 = new Filme();
		
		filme2.setTitulo("Hotel Transilvânia");
		filme2.setDuracaoEmMinutos(93);
		System.out.println(filme2.exibirDUracaoEmHoras()+"\n");
		
		System.out.println("Os filmes em cartaz são "+filme1.getTitulo()+" e "+filme2.getTitulo()+".\n");
		
		// Filme3
		Filme filme3 = new Filme("Filme3", 80);
		
		System.out.println(filme3.exibirDUracaoEmHoras()+"\n");
		
		// Filme4
		Filme filme4 = new Filme("Filme4", 100);
		
		System.out.println(filme4.exibirDUracaoEmHoras()+"\n");
		
		// Filme5
		Filme filme5 = new Filme("Filme5", 120);
		
		System.out.println(filme5.exibirDUracaoEmHoras()+"\n");
		
		// Filme3
		Filme filme6 = new Filme("Filme6", 140);
		
		System.out.println(filme6.exibirDUracaoEmHoras()+"\n");
		
		// Filme3
		Filme filme7 = new Filme("Filme7", 200);
		
		System.out.println(filme7.exibirDUracaoEmHoras()+"\n");
		
	}
}
