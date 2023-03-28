package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class ViewLivro {

	private JFrame frmLivro;
	private JTextField txtIsbn13;
	private JTextField txtAutor;
	private JTextField txtEditora;
	private JTextField txtSinopse;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLivro window = new ViewLivro();
					window.frmLivro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLivro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLivro = new JFrame();
		frmLivro.setTitle("Livro");
		frmLivro.setBounds(100, 100, 450, 346);
		frmLivro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		frmLivro.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("isbn13");
		lblNewLabel.setBounds(175, 236, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autor");
		lblNewLabel_1.setBounds(316, 23, 46, 14);
		panel.add(lblNewLabel_1);
		
		txtIsbn13 = new JTextField();
		txtIsbn13.setBounds(172, 256, 86, 20);
		panel.add(txtIsbn13);
		txtIsbn13.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(315, 42, 86, 20);
		panel.add(txtAutor);
		txtAutor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Editora");
		lblNewLabel_2.setBounds(315, 73, 46, 14);
		panel.add(lblNewLabel_2);
		
		txtEditora = new JTextField();
		txtEditora.setBounds(315, 98, 86, 20);
		panel.add(txtEditora);
		txtEditora.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sinopse");
		lblNewLabel_3.setBounds(315, 130, 46, 14);
		panel.add(lblNewLabel_3);
		
		txtSinopse = new JTextField();
		txtSinopse.setBounds(315, 154, 86, 20);
		panel.add(txtSinopse);
		txtSinopse.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(363, 271, 61, 23);
		panel.add(btnSair);
		
		JLabel lblNewLabel_4 = new JLabel("Id");
		lblNewLabel_4.setBounds(31, 23, 46, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(31, 42, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Preço");
		lblNewLabel_5.setBounds(31, 73, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(31, 98, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nome");
		lblNewLabel_6.setBounds(31, 130, 46, 14);
		panel.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(31, 154, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Descrição");
		lblNewLabel_7.setBounds(31, 182, 46, 14);
		panel.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(31, 206, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(31, 236, 46, 14);
		panel.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(31, 256, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Data Registro");
		lblNewLabel_9.setBounds(171, 23, 86, 14);
		panel.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(171, 42, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Quantidade");
		lblNewLabel_10.setBounds(171, 73, 86, 14);
		panel.add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(171, 98, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Data lancamento");
		lblNewLabel_11.setBounds(171, 130, 86, 14);
		panel.add(lblNewLabel_11);
		
		textField_7 = new JTextField();
		textField_7.setBounds(171, 154, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Gênero");
		lblNewLabel_12.setBounds(171, 182, 46, 14);
		panel.add(lblNewLabel_12);
		
		textField_8 = new JTextField();
		textField_8.setBounds(171, 206, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
	}
}
