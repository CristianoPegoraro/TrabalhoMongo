package br.edu.unoesc.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import br.edu.unoesc.dao.OrdemDao;
import br.edu.unoesc.entity.Ordem;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Excluir extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfexcluir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excluir frame = new Excluir();
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
	public Excluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(82, 74, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblExcluir = new JLabel("EXCLUIR");
		lblExcluir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExcluir.setBounds(175, 11, 86, 35);
		contentPane.add(lblExcluir);
		
		jtfexcluir = new JTextField();
		jtfexcluir.setToolTipText("Insira o nome do cliente para excluir");
		jtfexcluir.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		jtfexcluir.setBounds(82, 99, 284, 20);
		contentPane.add(jtfexcluir);
		jtfexcluir.setColumns(10);
		
		JButton btnExcluirExcluir = new JButton("Excluir");
		btnExcluirExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnExcluirExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Map<String, Object> map = new HashMap<String, Object>();
		        map.get((jtfexcluir.getText()));
		        
		        List<Ordem> query = new OrdemDao().findOrdems(map);
		        
		        
		        for (Ordem ordem : query) {
		            new OrdemDao().delete(ordem);
		        }

				
				
			}
		});
		btnExcluirExcluir.setBounds(175, 160, 89, 23);
		contentPane.add(btnExcluirExcluir);
	}
}
