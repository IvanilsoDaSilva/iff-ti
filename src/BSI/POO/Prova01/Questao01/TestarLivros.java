package BSI.POO.Prova01.Questao01;
public class TestarLivros {
	public static void main(String[] args) {
		// Livro 1
		Livro livrofavorito = new Livro();
		
		livrofavorito.setTitulo("O Pequeno Príncipe");
		livrofavorito.setQtdPaginas(98);
		
		System.out.println("O livro "+livrofavorito.getTitulo()+" possui "+livrofavorito.getQtdPaginas()+" páginas.");
		
		livrofavorito.setPaginasLidas(20);
		System.out.println(livrofavorito.verificarProgresso());
		livrofavorito.setPaginasLidas(50);
		System.out.println(livrofavorito.verificarProgresso()+"\n");
		
		// Livro 2
		Livro livrofavorito2 = new Livro("O Alquimista", 50);
		
		System.out.println("O livro "+livrofavorito2.getTitulo()+" possui "+livrofavorito2.getQtdPaginas()+" páginas.");
		
		livrofavorito2.setPaginasLidas(20);
		System.out.println(livrofavorito2.verificarProgresso());
		livrofavorito2.setPaginasLidas(50);
		System.out.println(livrofavorito2.verificarProgresso()+"\n");
		
		// Livro 3
		Livro livrofavorito3 = new Livro("Black Clover", 200);
		
		System.out.println("O livro "+livrofavorito3.getTitulo()+" possui "+livrofavorito3.getQtdPaginas()+" páginas.");
		
		livrofavorito3.setPaginasLidas(20);
		System.out.println(livrofavorito3.verificarProgresso());
		livrofavorito3.setPaginasLidas(50);
		System.out.println(livrofavorito3.verificarProgresso()+"\n");
	}
}
