package br.edu.unoesc.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unoesc.dao.PessoaDao;
import br.edu.unoesc.entity.Pessoa;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JList;

public class CadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoa frame = new CadastroPessoa();
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
	public CadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 20, 46, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(10, 45, 245, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(281, 20, 46, 14);
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(281, 45, 157, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setBounds(473, 20, 67, 14);
		contentPane.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setBounds(473, 45, 157, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnCadastroSalvar = new JButton("Salvar");
		btnCadastroSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		btnCadastroSalvar.setBounds(10, 305, 89, 23);
		contentPane.add(btnCadastroSalvar);

		JButton btnCadastroAlterar = new JButton("Alterar");
		btnCadastroAlterar.setBounds(109, 305, 89, 23);
		contentPane.add(btnCadastroAlterar);

		JButton btnCadastroExcluir = new JButton("Excluir");
		btnCadastroExcluir.setBounds(207, 305, 89, 23);
		contentPane.add(btnCadastroExcluir);

		JList listCadastroPessoas = new JList();
		listCadastroPessoas.setBounds(10, 90, 620, 181);
		contentPane.add(listCadastroPessoas);
	}
}
