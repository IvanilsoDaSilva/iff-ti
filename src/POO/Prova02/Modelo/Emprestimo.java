package POO.Prova02.Modelo;

public class Emprestimo
{
	//atributos comuns
	private String dataEmprestimo;
	private String dataDevolucao;
	private int prazo;
	
	//atributos de refer�ncia
	private Livro atRefLivro;
	private Usuario atRefUsuario;

	//m�todos de acesso - atributos comuns
	public String getDataEmprestimo()
	{	return dataEmprestimo;	}
	
	public void setDataEmprestimo(String dataEmprestimo)
	{	this.dataEmprestimo = dataEmprestimo;	}
	
	public String getDataDevolucao()
	{	return dataDevolucao;	}
	
	public void setDataDevolucao(String dataDevolucao)
	{	this.dataDevolucao = dataDevolucao;	}
	
	public int getPrazo()
	{	return prazo;	}
	
	public void setPrazo(int prazo)
	{	this.prazo = prazo;	}

	//m�todos de acesso - atributos de referencia
	public Livro getAtRefLivro()
	{	return atRefLivro;	}

	public void setAtRefLivro(Livro atRefLivro)
	{	this.atRefLivro = atRefLivro;	}

	public Usuario getAtRefUsuario() 
	{	return atRefUsuario;	}

	public void setAtRefUsuario(Usuario atRefUsuario)
	{	this.atRefUsuario = atRefUsuario;	}
	
	//m�todo construtor
	/*
	public Emprestimo()
	{	/dataEmprestimo = JOptionPane.showInputDialog("Informe a data do empr�stimo: ");
		dataDevolucao = JOptionPane.showInputDialog("Informe a data de devolu��o: ");
		prazo = Integer.parseInt(JOptionPane.showInputDialog("Informe o prazo: "));
		emprestarLivro();
	}
	*/
	public Emprestimo(String dataEmprestimo,String datadevolucao,String prazo) {
		this.dataEmprestimo=dataEmprestimo;
		this.dataDevolucao= datadevolucao;
		this.prazo=Integer.parseInt(prazo);
	}
}