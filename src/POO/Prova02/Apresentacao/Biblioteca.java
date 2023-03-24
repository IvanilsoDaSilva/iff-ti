package POO.Prova02.Apresentacao;

import javax.swing.JOptionPane;

public class Biblioteca {

	public static void main(String[] args) {
		String resposta = JOptionPane.showInputDialog("Aluno ou Professor?");
		if(resposta.equalsIgnoreCase("Aluno")) {
			TelaAluno objA = new TelaAluno();
		}
		else {
			TelaProfessor objP = new TelaProfessor();
		}
	}
}