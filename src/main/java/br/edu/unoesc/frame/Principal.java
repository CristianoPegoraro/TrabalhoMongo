package br.edu.unoesc.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;


import com.mongodb.DBObject;

import br.edu.unoesc.converter.CidadeConverter;
import br.edu.unoesc.dao.OrdemDao;
import br.edu.unoesc.entity.Cidade;
import br.edu.unoesc.entity.Funcionario;
import br.edu.unoesc.entity.Ordem;
import br.edu.unoesc.entity.Pessoa;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import java.awt.Font;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField jtfNome;
	private JTextField JtfCpf;
	private JTextField JtfFone;
	private JTextField jtfEndereco;
	private JTextField jtfBairro;
	private JTextField jtfCidade;
	private JTextField jtfServico;
	private JTextField jtfObservacoes;
	private JTextField jtfUF;
	private JTextField jtfFuncionario;
	private JTextField jtfSetor;
	private JTextField jtfCargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 504);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel);

		jtfNome = new JTextField();
		jtfNome.setBounds(10, 61, 280, 20);
		contentPane.add(jtfNome);
		jtfNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(298, 36, 46, 14);
		contentPane.add(lblNewLabel_1);

		JtfCpf = new JTextField();
		JtfCpf.setBounds(300, 61, 138, 20);
		contentPane.add(JtfCpf);
		JtfCpf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setBounds(448, 36, 67, 14);
		contentPane.add(lblNewLabel_2);

		JtfFone = new JTextField();
		JtfFone.setBounds(448, 61, 184, 20);
		contentPane.add(JtfFone);
		JtfFone.setColumns(10);

		JButton btnCadastroSalvar = new JButton("Salvar");
		btnCadastroSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			    
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(jtfNome.getText());
				pessoa.setCpf(JtfCpf.getText());
				pessoa.setFone(JtfFone.getText());
				pessoa.setEndereco(jtfEndereco.getText());
				pessoa.setBairro(jtfBairro.getText());
				
				Cidade cidade = new Cidade();

				cidade.setNomeCidade(jtfCidade.getText());
				cidade.setNomeUF(jtfUF.getText());
				
				Funcionario funcionario = new Funcionario();
				funcionario.setNomeFuncionario(jtfFuncionario.getText());
				funcionario.setSetor(jtfSetor.getText());
				funcionario.setCargo(jtfCargo.getText());
								
				Ordem ordem = new Ordem();
				ordem.setPessoa(pessoa);
				ordem.setCidade(cidade);
				ordem.setServico(jtfServico.getText());
				ordem.setObservacoes(jtfObservacoes.getText());
				
				
				
						

				new OrdemDao().save(ordem);
				
				List<Ordem> ordems = new OrdemDao().findOrdems();
		        for (Ordem ordem1 : ordems) {
		            System.out.println(ordem1.toString());
		        }

			}
		});

		btnCadastroSalvar.setBounds(109, 431, 89, 23);
		contentPane.add(btnCadastroSalvar);

		JButton btnCadastroAlterar = new JButton("Alterar");
		btnCadastroAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			/*	Map<String, Object> map = new HashMap<String, Object>();
				map.get(jtfNome.getText());
				Ordem query = new OrdemDao().findOrdem(map);

				Ordem ordem = new Ordem();
				ordem.setNome(jtfNome.getText());
				ordem.setCpf(JtfCpf.getText());
				ordem.setFone(JtfFone.getText());
				new OrdemDao().update(query, ordem);
*/
			}
		});
		btnCadastroAlterar.setBounds(208, 431, 89, 23);
		contentPane.add(btnCadastroAlterar);

		JButton btnCadastroExcluir = new JButton("Excluir");
		btnCadastroExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Excluir().setVisible(true);
			}
		});
		btnCadastroExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*new Excluir();*/
			}
		});
		btnCadastroExcluir.setBounds(300, 431, 89, 23);
		contentPane.add(btnCadastroExcluir);

		JButton btnCadastroNovo = new JButton("Novo");
		btnCadastroNovo.setBounds(10, 431, 89, 23);
		contentPane.add(btnCadastroNovo);

		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setBounds(10, 92, 67, 14);
		contentPane.add(lblEndereo);

		jtfEndereco = new JTextField();
		jtfEndereco.setBounds(10, 117, 261, 20);
		contentPane.add(jtfEndereco);
		jtfEndereco.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(281, 92, 46, 14);
		contentPane.add(lblBairro);

		jtfBairro = new JTextField();
		jtfBairro.setBounds(281, 117, 157, 20);
		contentPane.add(jtfBairro);
		jtfBairro.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Cidade:");
		lblNewLabel_3.setBounds(448, 92, 46, 14);
		contentPane.add(lblNewLabel_3);

		jtfCidade = new JTextField();
		jtfCidade.setBounds(448, 117, 131, 20);
		contentPane.add(jtfCidade);
		jtfCidade.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Serviço:");
		lblNewLabel_4.setBounds(10, 248, 46, 14);
		contentPane.add(lblNewLabel_4);

		jtfServico = new JTextField();
		jtfServico.setBounds(10, 261, 622, 71);
		contentPane.add(jtfServico);
		jtfServico.setColumns(10);

		JLabel lblObservaes = new JLabel("Observações:");
		lblObservaes.setBounds(10, 343, 89, 14);
		contentPane.add(lblObservaes);

		jtfObservacoes = new JTextField();
		jtfObservacoes.setBounds(10, 368, 622, 34);
		contentPane.add(jtfObservacoes);
		jtfObservacoes.setColumns(10);

		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(586, 92, 46, 14);
		contentPane.add(lblUf);

		jtfUF = new JTextField();
		jtfUF.setBounds(586, 117, 46, 20);
		contentPane.add(jtfUF);
		jtfUF.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 148, 626, 2);
		contentPane.add(separator);
		
		JLabel lblTcnico = new JLabel("Técnico:");
		lblTcnico.setBounds(10, 180, 67, 14);
		contentPane.add(lblTcnico);
		
		jtfFuncionario = new JTextField();
		jtfFuncionario.setBounds(13, 205, 258, 20);
		contentPane.add(jtfFuncionario);
		jtfFuncionario.setColumns(10);
		
		JLabel lblSetor = new JLabel("Setor:");
		lblSetor.setBounds(281, 180, 46, 14);
		contentPane.add(lblSetor);
		
		jtfSetor = new JTextField();
		jtfSetor.setBounds(281, 205, 138, 20);
		contentPane.add(jtfSetor);
		jtfSetor.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(429, 180, 46, 14);
		contentPane.add(lblCargo);
		
		jtfCargo = new JTextField();
		jtfCargo.setBounds(429, 205, 203, 20);
		contentPane.add(jtfCargo);
		jtfCargo.setColumns(10);
		
		JLabel lblCliente = new JLabel("DADOS DO CLIENTE");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCliente.setBounds(10, 11, 149, 14);
		contentPane.add(lblCliente);
		
		JLabel lblDadosDoFuncionario = new JLabel("DADOS DO FUNCIONARIO");
		lblDadosDoFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDadosDoFuncionario.setBounds(10, 155, 188, 14);
		contentPane.add(lblDadosDoFuncionario);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 236, 626, 2);
		contentPane.add(separator_1);
		
		JButton btnPesquisa = new JButton("Pesquisar");
		btnPesquisa.setBounds(521, 431, 111, 23);
		contentPane.add(btnPesquisa);

	}
}
