package POO.Prova02.Modelo;

public class Professor extends Usuario
{
	//atributos comuns
	private String titulacao;
	private String dataAdmissao;
	
	//m�todos de acesso - atributos comuns
	public String getTitulacao()
	{	return titulacao;	}
	
	public void setTitulacao(String titulacao)
	{	this.titulacao = titulacao;	}
	
	public String getDataAdmissao()
	{	return dataAdmissao;	}
	
	public void setDataAdmissao(String dataAdmissao)
	{	this.dataAdmissao = dataAdmissao;	}
	
	//m�todo construtor
	public Professor()
	{	/*super();
		titulacao = JOptionPane.showInputDialog("Informe a titula��o: ");
		dataAdmissao = JOptionPane.showInputDialog("Informe a data de admiss�o: ");
	*/
	}
	public Professor(String nome,String titulacao,String matricula,String email, String dataAdmissao, Endereco objE, Telefone objT, Emprestimo objEm, Livro objL)
	{ 	this.nome = nome;
	{ 	this.titulacao = titulacao;
		this.matricula = matricula;
		this.email = email;
		this.dataAdmissao = dataAdmissao;
		this.atRefEndereco = objE;
		this.atRefTelefone = objT;
		this.atRefEmprestimo = objEm;
		this.atRefLivro= objL;
}

}
	//abaixo metodos que requerem BD
}