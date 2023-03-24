package POO.Prova01.Modelo;

import javax.swing.JOptionPane;

public class Clinica extends Pessoa
{
	//atributos comuns
	private String cnpj;
	private String razaoSocial;
	
	//métodos de acesso
	public String getCnpj()
	{	return cnpj;	}
	
	public void setCnpj(String cnpj)
	{	this.cnpj = cnpj;	}
	
	public String getRazaoSocial()
	{	return razaoSocial;	}
	
	public void setRazaoSocial(String razaoSocial)
	{	this.razaoSocial = razaoSocial;	}
	
	//método construtor
	public Clinica(String cnpj, String razaoSocial, String nome, String email)
	{	
                /*
                 super();
		cnpj = JOptionPane.showInputDialog("Informe o CNPJ: ");
		razaoSocial = JOptionPane.showInputDialog("Informe a razão social: ");
                */
	}
	
	//operação
	public void ImprimirDados()
	{	
                super.imprimirDados();
		JOptionPane.showMessageDialog(null,"CNPJ: "+cnpj+"\nRAZÃO SOCIAL: "+razaoSocial);
                                
	}
}