package POO.Prova01.Modelo;

import javax.swing.JOptionPane;

public class Paciente extends Pessoa
{
	//atributos comuns
	private String cpf;
	private String dataNascimento;
	private float peso;
	private float altura;
	private int idade;
	
	//métodos de acesso
	public String getCpf()
	{	return cpf;	}
	
	public void setCpf(String cpf)
	{	this.cpf = cpf;	}
	
	public String getDataNascimento()
	{	return dataNascimento;	}
	
	public void setDataNascimento(String dataNascimento)
	{	this.dataNascimento = dataNascimento;	}
	
	public float getPeso()
	{	return peso;	}
	
	public void setPeso(float peso)
	{	this.peso = peso;	}
	
	public float getAltura()
	{	return altura;	}
	
	public void setAltura(float altura)
	{	this.altura = altura;	}
	
	public int getIdade()
	{	return idade;	}
	
	public void setIdade(int idade)
	{	this.idade = idade;	}
	
	//método construtor
	public Paciente(String cpf, String dataNascimento, float peso, float altura, int idade, String nome, String email)
	{	/*
                super();
		cpf = JOptionPane.showInputDialog("Informe o CPF: ");
		dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
                */
	}
	
	//operações
	public double calcularIMC()
	{	return peso/Math.pow(altura,2);	}
	
	public void imprimirDados()
	{	
		super.imprimirDados();
		
		JOptionPane.showMessageDialog(null,"CPF: "+cpf
				+"\nDATA DE NASCIMENTO: "+dataNascimento
				+"\nPESO: "+peso
				+"\nALTURA: "+altura
				+"\nIDADE: "+idade);
		
		double imc = calcularIMC();
		
		if(imc<=18.5)
		{	JOptionPane.showMessageDialog(null,"Paciente abaixo do peso com IMC = "+imc);	}
		else if(imc>18.5 && imc<=24.9)
		{	JOptionPane.showMessageDialog(null,"Paciente com peso normal e IMC = "+imc);	}
		else if(imc>=25 && imc<=29.9)
		{	JOptionPane.showMessageDialog(null,"Paciente com sobrepeso e IMC = "+imc);	}
		else if(imc>=30 && imc<=34.9)
		{	JOptionPane.showMessageDialog(null,"Paciente com obesidade grau I e IMC = "+imc);	}
		else if(imc>=35 && imc<=39.9)
		{	JOptionPane.showMessageDialog(null,"Paciente com obesidade grau II e IMC = "+imc);	}
		else
		{	JOptionPane.showMessageDialog(null,"Paciente com obesidade grau III e IMC = "+imc);	}	
	}
}