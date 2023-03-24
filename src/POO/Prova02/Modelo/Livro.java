package POO.Prova02.Modelo;

public class Livro
{
	//atributos comuns
	private String codigo;
	private String titulo;
	private String autor;
	private String editora;
	private int ano;
	private float precoUnitario;
	
	//m�todos de acesso - atributos comuns
	public String getCodigo()
	{	return codigo;	}
	
	public void setCodigo(String codigo)
	{	this.codigo = codigo;	}
	
	public String getTitulo()
	{	return titulo;	}
	
	public void setTitulo(String titulo)
	{	this.titulo = titulo;	}
	
	public String getAutor()
	{	return autor;	}
	
	public void setAutor(String autor)
	{	this.autor = autor;	}
	
	public String getEditora()
	{	return editora;	}
	
	public void setEditora(String editora)
	{	this.editora = editora;	}
	
	public int getAno()
	{	return ano;	}
	
	public void setAno(int ano)
	{	this.ano = ano;	}
	
	public float getPrecoUnitario()
	{	return precoUnitario;	}
	
	public void setPrecoUnitario(float precoUnitario)
	{	this.precoUnitario = precoUnitario;	}
	
	//m�todo construtor
	/*
	public Livro()
	{	codigo = JOptionPane.showInputDialog("Informe o c�digo: ");
		titulo = JOptionPane.showInputDialog("Informe o t�tulo: ");
		autor = JOptionPane.showInputDialog("Informe o autor: ");
		editora = JOptionPane.showInputDialog("Informe a editora: ");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
		precoUnitario = Float.parseFloat(JOptionPane.showInputDialog("Informe o pre�o: "));
	}
	*/
	public Livro(String codigo,String titulo,String autor,String editora,String ano,String precounitario) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.autor=autor;
		this.editora=editora;
		this.ano=Integer.parseInt(ano);
		this.precoUnitario=Float.parseFloat(precounitario);
	}
}