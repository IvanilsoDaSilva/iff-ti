package POO.Prova02.Modelo;

import javax.swing.JOptionPane;

public abstract class Usuario
{
	//atributos comuns
	protected String matricula;
	protected String nome;
	protected String email;
	
	//atributos de refer�ncia
	protected Telefone atRefTelefone;
	protected Endereco atRefEndereco;
	protected Livro atRefLivro;
	protected Emprestimo atRefEmprestimo;
	
	//m�todos de acesso - atributos comuns
	public String getMatricula()
	{	return matricula;	}
	
	public void setMatricula(String matricula)
	{	this.matricula = matricula;	}
	
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public String getEmail()
	{	return email;	}
	
	public void setEmail(String email)
	{	this.email = email;	}
	
	//m�todos de acesso - atributos de refer�ncia
	public Telefone getAtRefTelefone()
	{	return atRefTelefone;	}

	public void setAtRefTelefone(Telefone atRefTelefone)
	{	this.atRefTelefone = atRefTelefone;	}

	public Endereco getAtRefEndereco()
	{	return atRefEndereco;	}

	public void setAtRefEndereco(Endereco atRefEndereco)
	{	this.atRefEndereco = atRefEndereco;	}

	public Livro getAtRefLivro()
	{	return atRefLivro;	}

	public void setAtRefLivro(Livro atRefLivro)
	{	this.atRefLivro = atRefLivro;	}

	public Emprestimo getAtRefEmprestimo()
	{	return atRefEmprestimo;	}

	public void setAtRefEmprestimo(Emprestimo atRefEmprestimo)
	{	this.atRefEmprestimo = atRefEmprestimo;	}
	
	//m�todo construtor
	public Usuario()
	{	/*
		matricula = JOptionPane.showInputDialog("Informe a matr�cula: ");
		nome = JOptionPane.showInputDialog("Informe o nome: ");
		email = JOptionPane.showInputDialog("Informe o email: ");
		atRefEndereco = new Endereco();
		atRefTelefone = new Telefone();
		*/
	}
	
	//m�todo concreto
		public void imprimir()
		{	JOptionPane.showMessageDialog(null,"NOME: "+nome);
			JOptionPane.showMessageDialog(null,"Matricula: "+matricula);
			JOptionPane.showMessageDialog(null,"Email: "+email);
			JOptionPane.showMessageDialog(null,"ENDERE�O COMPLETO: Rua "+atRefEndereco.getRua()+", "+atRefEndereco.getNumero()+" - "+atRefEndereco.getComplemento()+" - "+atRefEndereco.getBairro()+" - "+atRefEndereco.getCidade()+"/"+atRefEndereco.getEstado()+" CEP: "+atRefEndereco.getCep());
			JOptionPane.showMessageDialog(null,"TELEFONE COMPLETO: +"+atRefTelefone.getDdi()+" ("+atRefTelefone.getDdd()+") "+atRefTelefone.getNumero()+" - "+atRefTelefone.getTipo()+" - "+atRefTelefone.getOperadora());
		}
}
