package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class NuevoPedido {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoPedido window = new NuevoPedido();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NuevoPedido() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 600);
		frame.getContentPane().setBackground(new Color(230,230,230));
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Fraichelogo = new JLabel("");
		Fraichelogo.setIcon(new ImageIcon("resources/Logo azul.png"));
		Fraichelogo.setBounds(23, 19, 186, 54);
		frame.getContentPane().add(Fraichelogo);
		ImageIcon imgFraichelogo = new ImageIcon("resources/Logo azul.png");
		Image imgmodified_Fraichelogo = imgFraichelogo.getImage();
		Image newimg1 = imgmodified_Fraichelogo.getScaledInstance(186, 54, java.awt.Image.SCALE_SMOOTH);
		imgFraichelogo = new ImageIcon(newimg1);
		Fraichelogo.setIcon(new ImageIcon(newimg1));	
		
		JLabel lblCalculador = new JLabel("Esencias a ");
		lblCalculador.setFont(new Font("Avenir", Font.BOLD, 25));
		lblCalculador.setBounds(252, 0, 198, 74);
		frame.getContentPane().add(lblCalculador);
		
		JLabel lblTitulo = new JLabel(" Pedir");
		lblTitulo.setFont(new Font("Avenir", Font.BOLD, 25));
		lblTitulo.setBounds(252, 46, 160, 55);
		frame.getContentPane().add(lblTitulo);
		
		Button buttonRegresar = new Button("Regresar");
		buttonRegresar.setFont(new Font("Avenir", Font.PLAIN, 12));
		buttonRegresar.setBounds(164, 539, 117, 29);
		frame.getContentPane().add(buttonRegresar);	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 122, 401, 320);
		frame.getContentPane().add(scrollPane);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Avenir", Font.PLAIN, 13));
		btnGuardar.setBounds(23, 454, 117, 29);
		frame.getContentPane().add(btnGuardar);
		
		textField = new JTextField();
		textField.setBounds(164, 454, 228, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnExportar = new JButton("Exportar");
		btnExportar.setFont(new Font("Avenir", Font.PLAIN, 13));
		btnExportar.setBounds(23, 495, 117, 29);
		frame.getContentPane().add(btnExportar);}
}
