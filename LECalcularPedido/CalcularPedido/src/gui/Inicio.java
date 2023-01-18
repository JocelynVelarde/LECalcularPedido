package gui;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JList;
import java.awt.List;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import java.awt.EventQueue;

import javax.swing.JFrame;

public class Inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
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
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(230,230,230));
		frame.getContentPane().setLayout(null);
		
		JLabel lblCalculador = new JLabel("Calculador de");
		lblCalculador.setFont(new Font("Avenir", Font.BOLD, 25));
		lblCalculador.setBounds(252, 0, 198, 74);
		frame.getContentPane().add(lblCalculador);	
		
		JLabel lblPedidos = new JLabel("Pedidos:");
		lblPedidos.setFont(new Font("Avenir", Font.PLAIN, 18));
		lblPedidos.setBounds(262, 138, 107, 25);
		frame.getContentPane().add(lblPedidos);
		
		JLabel Fraichelogo = new JLabel("");
		Fraichelogo.setIcon(new ImageIcon("resources/Logo azul.png"));
		Fraichelogo.setBounds(23, 19, 186, 54);
		frame.getContentPane().add(Fraichelogo);
		ImageIcon imgFraichelogo = new ImageIcon("resources/Logo azul.png");
		Image imgmodified_Fraichelogo = imgFraichelogo.getImage();
		Image newimg1 = imgmodified_Fraichelogo.getScaledInstance(186, 54, java.awt.Image.SCALE_SMOOTH);
		imgFraichelogo = new ImageIcon(newimg1);
		Fraichelogo.setIcon(new ImageIcon(newimg1));
		
		JLabel lblTitulo = new JLabel("Pedido");
		lblTitulo.setFont(new Font("Avenir", Font.BOLD, 25));
		lblTitulo.setBounds(252, 46, 160, 55);
		frame.getContentPane().add(lblTitulo);
		
		List list = new List();
		list.setBounds(211, 179, 218, 389);
		frame.getContentPane().add(list);
		Button buttonCalcular = new Button("Calcular" +'\n'+ "Pedido");
		buttonCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 Calcular Calcular = new Calcular();
				 Calcular.setVisible(true); 
				  
			}
		});
		buttonCalcular.setBounds(23, 300, 133, 46);
		frame.getContentPane().add(buttonCalcular);
		
		Button buttonVer = new Button("Ver pedido");
		buttonVer.setBounds(23, 179, 133, 46);
		frame.getContentPane().add(buttonVer);
		
		Button buttonEliminar = new Button("Eliminar pedido");
		buttonEliminar.setBounds(23, 240, 133, 46);
		frame.getContentPane().add(buttonEliminar);
		
		
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);

		// TODO Auto-generated method stub
		
	}
}
