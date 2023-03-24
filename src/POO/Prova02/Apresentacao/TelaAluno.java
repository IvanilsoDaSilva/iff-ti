package POO.Prova02.Apresentacao;

import POO.Prova02.Modelo.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


@SuppressWarnings("serial")
public class TelaAluno extends JFrame{
	
	//atributos
	private JLabel lNome,lMatricula,lCurso,lEmail,ldtNascim,lrua,lnumeroendereco,lcomplemento,lbairro,lcidade,lcep,lestado,lddi,lddd,lnumerotelefone,ltipo,loperadora,ldtemprestimo,ldtdevolucao,lcodigo,ltitulo,lautor,leditora,lano,lprecounitario,lprazo;
	private JButton BtnLimpar,BtnSalvar,BtnListar,BtnBuscar,BtnExcluir,BtnEditar,BtnFechar;
	private JTextField tNome,tMatricula,tCurso,tEmail,tdtNascim,trua,tnumeroendereco,tcomplemento,tbairro,tcidade,tcep,testado,tddi,tddd,tnumerotelefone,ttipo,toperadora,tdtemprestimo,tdtdevolucao,tcodigo,ttitulo,tautor,teditora,tano,tprecounitario,tprazo;
	private JPanel pAluno,pTelefone,pEndereco,pEmprestimo,pLivro;
	
	//vari�veis locais para armazenar o que for digitado
	String nome,matricula,curso,email,dtNascim,rua,numeroendereco,complemento,bairro,cidade,cep,estado,ddi,ddd,numerotelefone,tipo,operadora,dtemprestimo,prazo,dtdevolucao,codigo,titulo,autor,editora,ano,precounitario;
	
	//atributos de refer�ncia
	Aluno Al;	
	Endereco end;
	Telefone fone;
	Emprestimo Em;
	Livro Lv;
		
	
	public TelaAluno(){
		//configura��es da janela
		this.setSize(890,510);
		this.setTitle("Biblioteca - Aluno");
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null); //centraliza a janela na abertura
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("../Biblioteca/src/Imagens/book.png");
		this.setIconImage(img);
		
		//criando os panels para estruturar as �reas na tela 
		pAluno = new JPanel();
		pAluno.setSize(860,90);
		pAluno.setLocation(10,10);
		pAluno.setBorder(BorderFactory.createTitledBorder("DADOS DO ALUNO:"));
		pAluno.setLayout(null);
		
		
		pEndereco = new JPanel();
		pEndereco.setSize(860,90);
		pEndereco.setLocation(10,110);
		pEndereco.setBorder(BorderFactory.createTitledBorder("ENDERE�O COMPLETO:"));
		pEndereco.setLayout(null);
		
		pTelefone = new JPanel();
		pTelefone.setSize(860,50);
		pTelefone.setLocation(10,210);	
		pTelefone.setBorder(BorderFactory.createTitledBorder("TELEFONE DE CONTATO:"));
		pTelefone.setLayout(null);
		
		
		pEmprestimo = new JPanel();
		pEmprestimo.setSize(860,50);
		pEmprestimo.setLocation(10,270);	
		pEmprestimo.setBorder(BorderFactory.createTitledBorder("EMPRESTIMO:"));
		pEmprestimo.setLayout(null);
		
		pLivro = new JPanel();
		pLivro.setSize(860,90);
		pLivro.setLocation(10,330);	
		pLivro.setBorder(BorderFactory.createTitledBorder("LIVROS:"));
		pLivro.setLayout(null);
		
		//aluno
		lEmail = new JLabel("Email: ");
		lEmail.setSize(260,30);
		lEmail.setLocation(20,20);
		
		tEmail = new JTextField();
		tEmail.setSize(277,20);
		tEmail.setLocation(65,25);
		
		lMatricula = new JLabel("Matricula: ");
		lMatricula.setSize(260,30);
		lMatricula.setLocation(350,20);
		
		tMatricula = new JTextField();
		tMatricula.setSize(180,20);
		tMatricula.setLocation(415,25);
		
		lCurso = new JLabel("Curso: ");
		lCurso.setSize(260,30);
		lCurso.setLocation(20,50);
		
		tCurso = new JTextField();
		tCurso.setSize(277,20);
		tCurso.setLocation(65,55);
		
		lNome = new JLabel("Nome: ");
		lNome.setSize(260,30);
		lNome.setLocation(350,50);
		
		tNome = new JTextField();
		tNome.setSize(400,20);
		tNome.setLocation(415,55);
		
		ldtNascim = new JLabel("Data de Nascimento: ");
		ldtNascim.setSize(260,30);
		ldtNascim.setLocation(600,20);
		
		tdtNascim = new JTextField();
		tdtNascim.setSize(90,20);
		tdtNascim.setText("dd/mm/yyyy");
		tdtNascim.setLocation(724,25);
		
		//endere�o
		lcidade = new JLabel("Cidade: ");
		lcidade.setSize(80,30);
		lcidade.setLocation(20,20);
		
		tcidade = new JTextField();
		tcidade.setSize(200,20);
		tcidade.setLocation(72,25);
		
		lestado = new JLabel("Estado: ");
		lestado.setSize(80,20);
		lestado.setLocation(20,55);
		
		testado = new JTextField();
		testado.setSize(200,20);
		testado.setLocation(72,55);
		
		lcep = new JLabel("CEP: ");
		lcep.setSize(80,30);
		lcep.setLocation(280,20);
		
		tcep = new JTextField();
		tcep.setSize(80,20);
		tcep.setLocation(335,25);
		tcep.setText("00000-000");
		
		lnumeroendereco = new JLabel("N�mero: ");
		lnumeroendereco.setSize(80,20);
		lnumeroendereco.setLocation(280,55);
		
		tnumeroendereco = new JTextField();
		tnumeroendereco.setSize(80,20);
		tnumeroendereco.setLocation(335,55);
		
		lcomplemento = new JLabel("Complemento: ");
		lcomplemento.setSize(90,20);
		lcomplemento.setLocation(420,55);
		
		tcomplemento = new JTextField();
		tcomplemento.setSize(120,20);
		tcomplemento.setLocation(520,55);
		
		lrua = new JLabel("Rua: ");
		lrua.setSize(80,25);
		lrua.setLocation(420,20);
		
		trua = new JTextField();
		trua.setSize(360,20);
		trua.setLocation(460,25);
		
		lbairro = new JLabel("Bairro: ");
		lbairro.setSize(80,20);
		lbairro.setLocation(650,55);
		
		tbairro = new JTextField();
		tbairro.setSize(120,20);
		tbairro.setLocation(700,55);
		
		//telefone
		lddi = new JLabel("DDI: ");
		lddi.setSize(80,20);
		lddi.setLocation(20,20);
		
		tddi = new JTextField("+55");
		tddi.setSize(50,20);
		tddi.setLocation(55,20);
		
		lddd = new JLabel("DDD: ");
		lddd.setSize(80,20);
		lddd.setLocation(115,20);
		
		tddd = new JTextField("22");
		tddd.setSize(50,20);
		tddd.setLocation(155,20);
		
		lnumerotelefone = new JLabel("N�mero: ");
		lnumerotelefone.setSize(80,20);
		lnumerotelefone.setLocation(215,20);
		
		tnumerotelefone = new JTextField();
		tnumerotelefone.setSize(150,20);
		tnumerotelefone.setLocation(275,20);
		
		ltipo = new JLabel("Tipo: ");
		ltipo.setSize(80,20);
		ltipo.setLocation(435,20);
		
		ttipo = new JTextField();
		ttipo.setSize(120,20);
		ttipo.setLocation(470,20);
		
		loperadora = new JLabel("Operadora: ");
		loperadora.setSize(80,20);
		loperadora.setLocation(600,20);
		
		toperadora = new JTextField();
		toperadora.setSize(150,20);
		toperadora.setLocation(675,20);
		
		//panel Emprestimo
		ldtdevolucao = new JLabel("Data de Devolu��o: ");
		ldtdevolucao.setSize(150,20);
		ldtdevolucao.setLocation(20,20);
		
		tdtdevolucao = new JTextField("dd/mm/yyyy");
		tdtdevolucao.setSize(150,20);
		tdtdevolucao.setLocation(140,20);
		
		lprazo = new JLabel("Prazo: ");
		lprazo.setSize(80,20);
		lprazo.setLocation(350,20);
		
		tprazo = new JTextField();
		tprazo.setSize(80,20);
		tprazo.setLocation(400,20);
		
		ldtemprestimo = new JLabel("Data do Emprestimo: ");
		ldtemprestimo.setSize(150,20);
		ldtemprestimo.setLocation(545,20);
		
		tdtemprestimo = new JTextField("dd/mm/yyyy");
		tdtemprestimo.setSize(150,20);
		tdtemprestimo.setLocation(675,20);
			
		//panel Livro
		lcodigo = new JLabel("C�digo: ");
		lcodigo.setSize(80,20);
		lcodigo.setLocation(20,20);
		
		tcodigo = new JTextField();
		tcodigo.setSize(120,20);
		tcodigo.setLocation(70,20);
		
		ltitulo = new JLabel("Titulo: ");
		ltitulo.setSize(80,20);
		ltitulo.setLocation(20,50);
		
		ttitulo = new JTextField();
		ttitulo.setSize(280,20);
		ttitulo.setLocation(70,50);
		
		lautor = new JLabel("Autor(es): ");
		lautor.setSize(80,20);
		lautor.setLocation(360,50);
		
		tautor = new JTextField();
		tautor.setSize(370,20);
		tautor.setLocation(455,50);
		
		leditora = new JLabel("Editora: ");
		leditora.setSize(80,20);
		leditora.setLocation(585,20);
		
		teditora = new JTextField();
		teditora.setSize(185,20);
		teditora.setLocation(640,20);
		
		lano = new JLabel("Ano: ");
		lano.setSize(80,20);
		lano.setLocation(200,20);
		
		tano = new JTextField();
		tano.setSize(120,20);
		tano.setLocation(230,20);
		
		lprecounitario = new JLabel("Pre�o Unit�rio: ");
		lprecounitario.setSize(120,20);
		lprecounitario.setLocation(360,20);
		
		tprecounitario = new JTextField();
		tprecounitario.setSize(120,20);
		tprecounitario.setLocation(455,20);
		
		//criando classe interna para funcionar como ouvinte dos eventos de mouse
		class BatSinal extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == BtnSalvar) {	
					//endereco
					rua = trua.getText();
					numeroendereco = tnumeroendereco.getText();
					complemento = tcomplemento.getText();
					bairro = tbairro.getText();
					cidade = tcidade.getText();
					cep = tcep.getText();
					estado = testado.getText();
					end = new Endereco(rua,numeroendereco,complemento,bairro,cidade,cep,estado);

					//telefone
					ddi = tddi.getText();
					ddd = tddd.getText();
					numerotelefone = tnumerotelefone.getText();
					tipo = ttipo.getText();
					operadora = toperadora.getText();
					fone = new Telefone(ddi,ddd,numerotelefone,tipo,operadora);
					
					//emprestimo
					dtemprestimo= tdtemprestimo.getText();
					dtdevolucao = tdtdevolucao.getText();
					prazo = tprazo.getText();
					Em = new Emprestimo(dtemprestimo,dtdevolucao,prazo);
					
					//Livro
					codigo= tcodigo.getText();
					titulo = ttitulo.getText();
					autor = tautor.getText();
					editora = teditora.getText();
					ano = tano.getText();
					precounitario = tprecounitario.getText();
					Lv = new Livro(codigo,titulo,autor,editora,ano,precounitario);
					
					//Usuario
					matricula = tMatricula.getText();
					nome = tNome.getText();
					email = tEmail.getText();
					curso = tCurso.getText();
					dtNascim = tdtNascim.getText();
					Al = new Aluno(nome,curso,matricula,email,dtNascim,end,fone,Em,Lv);			
					}	
				if (e.getSource() == BtnLimpar) {
					tNome.setText("");
					tMatricula.setText("");
					tCurso.setText("");
					tEmail.setText("");
					//tdtNascim.setText("");
					trua.setText("");
					tnumeroendereco.setText("");
					tcomplemento.setText("");
					tbairro.setText("");
					tcidade.setText("");
					//.tcep.setText("");
					testado.setText("");
					//tddi.setText("");
					//tddd.setText("");
					tnumerotelefone.setText("");
					ttipo.setText("");
					toperadora.setText("");
					//tdtemprestimo.setText("");
					//tdtdevolucao.setText("");
					tcodigo.setText("");
					ttitulo.setText("");
					tautor.setText("");
					tano.setText("");
					tprecounitario.setText("");
					tprazo.setText("");
					
						}			
				if (e.getSource() == BtnBuscar){	
					matricula = tMatricula.getText();
					if (matricula.equalsIgnoreCase("")){	
						JOptionPane.showMessageDialog(null,"A Matricula est� vazia! O preenchimento � obrigat�rio!");
						System.out.println("A matricula est� vazia! O preenchimento � obrigat�rio!");
							}
					else{	
						System.out.println("Matricula devidamente preenchido!");
						System.out.println("Buscar os dados do Aluno com esta Matricula!");
						Aluno objAl = new Aluno();
						//objAl = (Aluno) Aluno.buscar(cpf); esse metodo requer conex�o com o BD
						
						JOptionPane.showMessageDialog(null,"ENDERE�O COMPLETO:\n\n"+objAl.getAtRefEndereco().getRua()+", "+objAl.getAtRefEndereco().getNumero()+" - "+objAl.getAtRefEndereco().getComplemento()+" - "+objAl.getAtRefEndereco().getBairro()+" - "+objAl.getAtRefEndereco().getCidade()+"/"+objAl.getAtRefEndereco().getEstado()+" - CEP: "+objAl.getAtRefEndereco().getCep());
						JOptionPane.showMessageDialog(null,"TELEFONE COMPLETO:\n\n"+objAl.getAtRefTelefone().getDdi()+" ("+objAl.getAtRefTelefone().getDdd()+") "+objAl.getAtRefTelefone().getNumero()+" - "+objAl.getAtRefTelefone().getTipo()+" - "+objAl.getAtRefTelefone().getOperadora());		
							}		
						}
						
						if (e.getSource() == BtnListar)
						{	matricula = tMatricula.getText();
							if (matricula.equalsIgnoreCase(""))
							{	JOptionPane.showMessageDialog(null,"A matricula est� vazia! O preenchimento � obrigat�rio!");
								System.out.println("A matricula est� vazia! O preenchimento � obrigat�rio!");
							}
							else
							{	System.out.println("Matricula devidamente preenchido!");
								System.out.println("consultar");
								//Al.Imprimir(matricula);
							}
							
						}
						
						if (e.getSource() == BtnFechar) {
							dispose(); 
						}
					}
				}		
		
		//adicionando ouvinte para os bot�es
		BatSinal batman = new BatSinal();
		
		//adicionando os buttons
		BtnSalvar = new JButton("Salvar");
		BtnSalvar.setSize(75,30);
		BtnSalvar.setLocation(20,430);
		BtnSalvar.setForeground(Color.white);
		BtnSalvar.setBackground(Color.blue);
		BtnSalvar.addMouseListener(batman);	
		
		BtnLimpar = new JButton("Limpar");
		BtnLimpar.setSize(75,30);
		BtnLimpar.setLocation(148,430);
		BtnLimpar.setForeground(Color.white);
		BtnLimpar.setBackground(Color.gray);
		BtnLimpar.addMouseListener(batman);
				
		BtnListar = new JButton("Listar");
		BtnListar.setSize(75,30);
		BtnListar.setLocation(276,430);
		BtnListar.setForeground(Color.white);
		BtnListar.setBackground(Color.green);
		BtnListar.addMouseListener(batman);
						
		BtnBuscar = new JButton("Buscar");
		BtnBuscar.setSize(80,30);
		BtnBuscar.setLocation(394,430);
		BtnBuscar.setForeground(Color.white);
		BtnBuscar.setBackground(Color.magenta);
		BtnBuscar.addMouseListener(batman);

		BtnExcluir = new JButton("Excluir");
		BtnExcluir.setSize(75,30);
		BtnExcluir.setLocation(522,430);
		BtnExcluir.setForeground(Color.white);
		BtnExcluir.setBackground(Color.orange);
		BtnExcluir.addMouseListener(batman);
				
		BtnEditar = new JButton("Editar");
		BtnEditar.setSize(75,30);
		BtnEditar.setLocation(650,430);
		BtnEditar.setForeground(Color.white);
		BtnEditar.setBackground(Color.pink);
		BtnEditar.addMouseListener(batman);
				
		BtnFechar = new JButton("Fechar");
		BtnFechar.setSize(75,30);
		BtnFechar.setLocation(786,430);
		BtnFechar.setForeground(Color.white);
		BtnFechar.setBackground(Color.red);
		BtnFechar.addMouseListener(batman);
		
		
		//acrescentando os componentes � tela
		
		//panel aluno
		this.add(pAluno);
		pAluno.add(lNome);
		pAluno.add(tNome);
		pAluno.add(lMatricula);
		pAluno.add(tMatricula);
		pAluno.add(lEmail);
		pAluno.add(tEmail);
		pAluno.add(lCurso);
		pAluno.add(tCurso);
		pAluno.add(ldtNascim);
		pAluno.add(tdtNascim);
		
		//panel endere�o
		this.add(pEndereco);
		pEndereco.add(lcidade);
		pEndereco.add(tcidade);
		pEndereco.add(lestado);
		pEndereco.add(testado);
		pEndereco.add(lcep);
		pEndereco.add(tcep);
		pEndereco.add(lnumeroendereco);
		pEndereco.add(tnumeroendereco);
		pEndereco.add(lcomplemento);
		pEndereco.add(tcomplemento);
		pEndereco.add(lrua);
		pEndereco.add(trua);
		pEndereco.add(lbairro);
		pEndereco.add(tbairro);
		
		//panel Emprestimo
		this.add(pEmprestimo);
		pEmprestimo.add(ldtdevolucao);
		pEmprestimo.add(tdtdevolucao);
		pEmprestimo.add(lprazo);
		pEmprestimo.add(tprazo);
		pEmprestimo.add(ldtemprestimo);
		pEmprestimo.add(tdtemprestimo);
		
		//panel telefone
		this.add(pTelefone);
		pTelefone.add(lnumerotelefone);
		pTelefone.add(tnumerotelefone);
		pTelefone.add(lddi);
		pTelefone.add(tddi);
		pTelefone.add(ltipo);
		pTelefone.add(ttipo);
		pTelefone.add(lddd);
		pTelefone.add(tddd);
		pTelefone.add(loperadora);
		pTelefone.add(toperadora);

		//panel Livro
		this.add(pLivro);
		pLivro.add(lcodigo);
		pLivro.add(tcodigo);
		pLivro.add(ltitulo);
		pLivro.add(ttitulo);
		pLivro.add(lautor);
		pLivro.add(tautor);
		pLivro.add(leditora);
		pLivro.add(teditora);
		pLivro.add(lano);
		pLivro.add(tano);
		pLivro.add(lprecounitario);
		pLivro.add(tprecounitario);
		
		
		this.add(BtnSalvar);
		this.add(BtnLimpar);
		this.add(BtnListar);
		this.add(BtnBuscar);
		this.add(BtnExcluir);
		this.add(BtnEditar);
		this.add(BtnFechar);
		this.repaint();
		
		
	}

}
