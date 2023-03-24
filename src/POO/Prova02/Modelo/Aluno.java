package POO.Prova02.Modelo;

public class Aluno extends Usuario
{
	//atributos comuns
	private String curso;
	private String dataNascimento;
	
	//m�todos de acesso
	public String getCurso()
	{	return curso;	}
	
	public void setCurso(String curso)
	{	this.curso = curso;	}
	
	public String getDataNascimento()
	{	return dataNascimento;	}
	
	public void setDataNascimento(String dataNascimento)
	{	this.dataNascimento = dataNascimento;	}
	
	//m�todo construtor
	
	public Aluno()
	{	/*super();
		curso = JOptionPane.showInputDialog("Informe o curso: ");
		dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		*/
	}
	
	public Aluno(String nome,String curso,String matricula,String email, String dataNascimento, Endereco objE, Telefone objT, Emprestimo objEm, Livro objL)
	{ 	this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.atRefEndereco = objE;
		this.atRefTelefone = objT;
		this.atRefEmprestimo = objEm;
		this.atRefLivro= objL;
}
	
	//abaixo metodos que requerem BD
}