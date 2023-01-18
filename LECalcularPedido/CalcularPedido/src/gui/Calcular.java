package gui;
import Procesos.Ventas;
import Procesos.Existencias;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Label;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calcular {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcular window = new Calcular();
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
	public Calcular() {
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
		
		JLabel lblCalculador = new JLabel("Calcular Nuevo");
		lblCalculador.setFont(new Font("Avenir", Font.BOLD, 25));
		lblCalculador.setBounds(252, 0, 198, 74);
		frame.getContentPane().add(lblCalculador);
		
		JLabel lblTitulo = new JLabel("Pedido");
		lblTitulo.setFont(new Font("Avenir", Font.BOLD, 25));
		lblTitulo.setBounds(252, 46, 160, 55);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("Inserta los archivos de Venta");
		lblNewLabel.setFont(new Font("Avenir", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(23, 129, 198, 16);
		frame.getContentPane().add(lblNewLabel);
		
		Label labelMesActual = new Label("Mes Actual");
		labelMesActual.setFont(new Font("Avenir", Font.PLAIN, 15));
		labelMesActual.setBounds(23, 195, 113, 16);
		frame.getContentPane().add(labelMesActual);
		
		
		//Boton de Ventas
		Button button1 = new Button("Cargar");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Abrir ventana para seleccionar archivo y recibir el archivo
				
				FileOpener ventas = new FileOpener();
				File VentasPath = null;
				
				try {
					 VentasPath = ventas.escoger();
					
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "El archivo: \"" + VentasPath.getName() + "\" se cargo correctamente");
				
				//Sacar la informacion
				Ventas procesoventa = new Ventas(VentasPath);
				procesoventa.initialize();
				
				
				
				
			}
		});
		button1.setFont(new Font("Avenir", Font.PLAIN, 12));
		button1.setBounds(180, 195, 117, 29);
		frame.getContentPane().add(button1);
		
		Button button1MesPrevisualizar = new Button("Previsualizar");
		button1MesPrevisualizar.setFont(new Font("Avenir", Font.PLAIN, 12));
		button1MesPrevisualizar.setBounds(311, 195, 117, 29);
		frame.getContentPane().add(button1MesPrevisualizar);
		
		
		Button buttonRegresar = new Button("Regresar");
		buttonRegresar.setFont(new Font("Avenir", Font.PLAIN, 12));
		buttonRegresar.setBounds(164, 539, 117, 29);
		frame.getContentPane().add(buttonRegresar);
		
		JLabel lblInsertarE = new JLabel("Inserta el archivo de Existencias");
		lblInsertarE.setBackground(Color.BLUE);
		lblInsertarE.setForeground(Color.BLACK);
		lblInsertarE.setFont(new Font("Avenir", Font.BOLD | Font.ITALIC, 15));
		lblInsertarE.setBounds(23, 300, 216, 16);
		frame.getContentPane().add(lblInsertarE);
		
		//Boton de Existencias
		JButton btnCargarE = new JButton("Cargar");
		btnCargarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileOpener existencias = new FileOpener();
				File ExistenciasPath = null;
				
				try {
					 ExistenciasPath = existencias.escoger();
					
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "El archivo: \"" + ExistenciasPath.getName() + "\" se cargo correctamente");
				
				//Sacar la informacion
				Existencias procesoexistencia = new Existencias(ExistenciasPath);
				procesoexistencia.calcularexistencia();
			}
		});
		btnCargarE.setFont(new Font("Avenir", Font.PLAIN, 13));
		btnCargarE.setBounds(23, 350, 117, 29);
		frame.getContentPane().add(btnCargarE);
		
		JButton btnNewButton_1 = new JButton("Previsualizar");
		btnNewButton_1.setFont(new Font("Avenir", Font.PLAIN, 13));
		btnNewButton_1.setBounds(152, 350, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Avenir", Font.BOLD, 20));
		btnCalcular.setBounds(311, 350, 117, 62);
		frame.getContentPane().add(btnCalcular);
		
		textField = new JTextField();
		textField.setBounds(33, 226, 339, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);




		



	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

}
