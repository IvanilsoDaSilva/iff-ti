package POO.Prova01.Modelo;

public class Endereco
{
	//atributos comuns
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	
	//métodos de acesso
	public String getRua()
	{	return rua;	}
	
	public void setRua(String rua)
	{	this.rua = rua;	}
	
	public String getNumero()
	{	return numero;	}
	
	public void setNumero(String numero)
	{	this.numero = numero;	}
	
	public String getComplemento()
	{	return complemento;	}
	
	public void setComplemento(String complemento)
	{	this.complemento = complemento;	}
	
	public String getBairro()
	{	return bairro;	}
	
	public void setBairro(String bairro)
	{	this.bairro = bairro;	}
	
	public String getCidade()
	{	return cidade;	}
	
	public void setCidade(String cidade)
	{	this.cidade = cidade;	}
	
	public String getCep()
	{	return cep;	}
	
	public void setCep(String cep)
	{	this.cep = cep;	}
	
	public String getEstado()
	{	return estado;	}
	
	public void setEstado(String estado)
	{	this.estado = estado;	}
	
	//método construtor
	public Endereco(String rua,String numero,String complemento,String bairro,String cidade,String cep,String estado)
	{	
                /*
                rua = JOptionPane.showInputDialog("Informe a rua");
		numero = JOptionPane.showInputDialog("Informe o número");
		complemento = JOptionPane.showInputDialog("Informe o complemento");
		bairro = JOptionPane.showInputDialog("Informe o bairro");
		cidade = JOptionPane.showInputDialog("Informe a cidade");
		cep = JOptionPane.showInputDialog("Informe o cep");
		estado = JOptionPane.showInputDialog("Informe o estado");
                */
	}
}