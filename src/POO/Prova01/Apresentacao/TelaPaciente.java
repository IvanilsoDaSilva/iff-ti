package POO.Prova01.Apresentacao;

import POO.Prova01.Modelo.*;
import javax.swing.*;
import java.awt.event.*;

public class TelaPaciente extends JFrame {
    //atributos de usuario endereço e telefone
    private JPanel pUsuario, pEndereco, pTelefone;
    private JTextField tIdade, tPeso, tAltura, tCpf, tNascimento, tNome, tEmail, tRua, tNumero, tComplemento, tBairro, tCidade, tCep, tEstado, tDdi, tDdd, tTel, tTipo, tOperadora;
    private JLabel lIdade, lPeso, lAltura, lCpf, lNascimento, lNome, lEmail, lRua, lNumero, lComplemento, lBairro, lCidade, lCep, lEstado, lDdi, lDdd, lTel, lTipo, lOperadora;
    private JButton bSalvar, bLimpar;
    String cpf, nascimento, nome, email, rua,numero,complemento,bairro,cidade,cep,estado,ddi,ddd,tel,tipo,operadora;
    float peso, altura;
    int idade;
    
    
    Endereco end;
    Telefone fone;
    Paciente pasc;
    
    public TelaPaciente(){
        
    this.setSize(700,450);
    this.setTitle("Tela do paciente");
    this.setResizable(false);
    this.setLayout(null);
    this.setVisible(true);
    this.setLocationRelativeTo(null); 
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    pUsuario = new JPanel();
    pUsuario.setSize(660,90);
    pUsuario.setLocation(10,10);
    pUsuario.setBorder(BorderFactory.createTitledBorder("DADOS DE USUARIO:"));
    pUsuario.setLayout(null);
		
    pEndereco = new JPanel();
    pEndereco.setSize(660,120);
    pEndereco.setLocation(10,110);
    pEndereco.setBorder(BorderFactory.createTitledBorder("ENDEREÇO COMPLETO:"));
    pEndereco.setLayout(null);
		
    pTelefone = new JPanel();
    pTelefone.setSize(660,90);
    pTelefone.setLocation(10,240);	
    pTelefone.setBorder(BorderFactory.createTitledBorder("TELEFONE DE CONTATO:"));
    pTelefone.setLayout(null);
    
    //Usuario
                lNome = new JLabel("Nome completo do paciente: ");
		lNome.setSize(450,20);
		lNome.setLocation(20,20);
		
		tNome = new JTextField();
		tNome.setSize(140,20);
		tNome.setLocation(190,20);
                tNome.setText("Ex: Carlos Pereira Pinto");
                
                lEmail = new JLabel("email: ");
		lEmail.setSize(80,20);
		lEmail.setLocation(20,50);
		
                tEmail = new JTextField();
                tEmail.setSize(130,20);
		tEmail.setLocation(60,50);
                tEmail.setText("Ex: xxxxxx@gmail.com");
                
                lNascimento = new JLabel("Nascimento: ");
		lNascimento.setSize(100,20);
		lNascimento.setLocation(350,20);
		
		tNascimento = new JTextField();
		tNascimento.setSize(80,20);
		tNascimento.setLocation(430,20);
		tNascimento.setText("dia/mes/ano");
                
                lCpf = new JLabel("CPF: ");
		lCpf.setSize(80,20);
		lCpf.setLocation(200,50);
		
		tCpf = new JTextField();
		tCpf.setSize(100,20);
		tCpf.setLocation(230,50);
                
                lPeso = new JLabel("peso: ");
		lPeso.setSize(70,20);
		lPeso.setLocation(520,20);
		
		tPeso = new JTextField();
		tPeso.setSize(80,20);
		tPeso.setLocation(560,20);
                
                lIdade = new JLabel("idade: ");
		lIdade.setSize(70,20);
		lIdade.setLocation(520,50);
		
		tIdade = new JTextField();
		tIdade.setSize(80,20);
		tIdade.setLocation(560,50);
                
                lAltura = new JLabel("altura: ");
		lAltura.setSize(100,20);
		lAltura.setLocation(350,50);
		
		tAltura = new JTextField();
		tAltura.setSize(80,20);
		tAltura.setLocation(430,50);
    
    // telefone
                lDdi = new JLabel("Código Internacional DDI:");
		lDdi.setSize(160,30);
		lDdi.setLocation(20,20);
		
		tDdi = new JTextField();
		tDdi.setSize(30,20);
		tDdi.setText("+55");
		tDdi.setLocation(180,25);
		
		lDdd = new JLabel("Código Local DDD:");
		lDdd.setSize(120,30);
		lDdd.setLocation(250,20);
		
		tDdd = new JTextField();
		tDdd.setSize(30,20);
		tDdd.setText("22");
		tDdd.setLocation(370,25);
		
		lTel = new JLabel("Número: ");
		lTel.setSize(80,30);
		lTel.setLocation(435,20);
                
		tTel = new JTextField();
		tTel.setSize(140,20);
		tTel.setLocation(500,25);
                tTel.setText("0000-0000");
		
		lTipo = new JLabel("Tipo do Telefone:");
		lTipo.setSize(100,30);
		lTipo.setLocation(20,50);
		
		tTipo = new JTextField();
		tTipo.setSize(180,20);
		tTipo.setLocation(130,55);
		
		lOperadora = new JLabel("Operadora de Telefonia: ");
		lOperadora.setSize(150,30);
		lOperadora.setLocation(350,50);
				
		tOperadora = new JTextField();
		tOperadora.setSize(140,20);
		tOperadora.setLocation(500,55);
//Endereço       
                lRua = new JLabel("Logradouro:");
		lRua.setSize(120,30);
		lRua.setLocation(20,20);
		
		tRua = new JTextField();
		tRua.setSize(540,20);
		tRua.setLocation(100,25);

		lNumero = new JLabel("Número:");
		lNumero.setSize(120,30);
		lNumero.setLocation(20,50);
		
		tNumero = new JTextField();
		tNumero.setSize(70,20);
		tNumero.setLocation(80,55);

		lComplemento = new JLabel("Complemento:");
		lComplemento.setSize(120,30);
		lComplemento.setLocation(160,50);
		
		tComplemento = new JTextField();
		tComplemento.setSize(100,20);
		tComplemento.setLocation(250,55);
		
                lBairro = new JLabel("Bairro: ");
		lBairro.setSize(120,30);
		lBairro.setLocation(370,50);
		
		tBairro = new JTextField();
		tBairro.setSize(220,20);
		tBairro.setLocation(420,55);
		
		lCidade = new JLabel("Cidade: ");
		lCidade.setSize(120,30);
		lCidade.setLocation(20,80);
		
		tCidade = new JTextField();
		tCidade.setSize(270,20);
		tCidade.setLocation(80,85);
		
		lCep = new JLabel("CEP:");
		lCep.setSize(60,30);
		lCep.setLocation(370,80);
		
		tCep = new JTextField();
		tCep.setSize(70,20);
		tCep.setText("000000000");
		tCep.setLocation(410,85);
		
		lEstado = new JLabel("Estado:");
		lEstado.setSize(120,30);
		lEstado.setLocation(500,80);
		
		tEstado = new JTextField();
		tEstado.setSize(80,20);
		tEstado.setLocation(560,85);
                
class BatSinal extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == bSalvar) {
						
					//endereco
					rua = tRua.getText();
					numero = tNumero.getText();
					complemento = tComplemento.getText();
					bairro = tBairro.getText();
					cidade = tCidade.getText();
					cep = tCep.getText();
					estado = tEstado.getText();
					end = new Endereco(rua,numero,complemento,bairro,cidade,cep,estado);

					//telefone
					ddi = tDdi.getText();
					ddd = tDdd.getText();
					tel = tTel.getText();
					tipo = tTipo.getText();
					operadora = tOperadora.getText();
					fone = new Telefone(ddi,ddd,tel,tipo,operadora);
					
					//pessoal
					nome = tNome.getText();
                                        email = tEmail.getText();
                                        cpf = tCpf.getText();
                                        nascimento = tNascimento.getText();
                                        peso = Float.parseFloat(tPeso.getText());
                                        altura = Float.parseFloat(tAltura.getText());
                                        idade = Integer.parseInt(tIdade.getText());
                                        pasc = new Paciente(cpf, nascimento,peso, altura, idade, nome, email);
                                        
                                        
                                        
                                }
                                
				if (e.getSource() == bLimpar) {
					tNome.setText("");
					tEmail.setText("");
				        tCpf.setText("");
                                        tNascimento.setText("");
                                        tPeso.setText("");
                                        tAltura.setText("");
                                        tIdade.setText("");
                                                
					tRua.setText("");
					tNumero.setText("");
					tComplemento.setText("");
					tBairro.setText("");
					tCidade.setText("");
					tCep.setText("");
					tEstado.setText("");
					tDdi.setText("");
					tDdd.setText("");
					tTel.setText("");
					tTipo.setText("");
					tOperadora.setText("");
				}
                        
				
				}         
                        } 
                
                BatSinal batman = new BatSinal();
                
                bSalvar = new JButton("Salvar");
		bSalvar.setSize(90,45);
		bSalvar.setLocation(12,350);
		bSalvar.addMouseListener(batman);
                
                bLimpar = new JButton("Limpar");
		bLimpar.setSize(90,45);
		bLimpar.setLocation(130,350);
		bLimpar.addMouseListener(batman);
                
                this.add(pUsuario);
		pUsuario.add(lNome);
                pUsuario.add(tNome);
                pUsuario.add(lEmail);
                pUsuario.add(tEmail);
                pUsuario.add(lNascimento);
                pUsuario.add(tNascimento);
                pUsuario.add(lCpf);
                pUsuario.add(tCpf);
                pUsuario.add(tPeso);
                pUsuario.add(lPeso);
                pUsuario.add(lIdade);
                pUsuario.add(tIdade);
                pUsuario.add(lAltura);
                pUsuario.add(tAltura);
                

                this.add(pEndereco);
		pEndereco.add(lRua);
		pEndereco.add(lNumero);
		pEndereco.add(lComplemento);
		pEndereco.add(lBairro);
		pEndereco.add(lCidade);
		pEndereco.add(lCep);
		pEndereco.add(lEstado);
		pEndereco.add(tRua);
		pEndereco.add(tNumero);
		pEndereco.add(tComplemento);
		pEndereco.add(tBairro);
		pEndereco.add(tCidade);		
		pEndereco.add(tCep);
		pEndereco.add(tEstado);
		
		this.add(pTelefone);
		pTelefone.add(lDdi);
		pTelefone.add(lDdd);
		pTelefone.add(lTel);
		pTelefone.add(lTipo);
		pTelefone.add(lOperadora);
		pTelefone.add(tDdi);
		pTelefone.add(tDdd);
		pTelefone.add(tTel);
		pTelefone.add(tTipo);
		pTelefone.add(tOperadora);
                
                this.add(bSalvar);
		this.add(bLimpar);
		this.repaint();	

    }
}
