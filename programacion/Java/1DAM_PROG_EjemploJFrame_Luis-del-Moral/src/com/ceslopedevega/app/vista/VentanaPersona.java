package com.ceslopedevega.app.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPersona extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-301,154
	 */
	private final JButton button = new JButton("New button");
	private JTextField textoPersona;

	public VentanaPersona() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("Personas");
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textoPersona = new JTextField();
		textoPersona.setBounds(45, 36, 341, 169);
		contentPane.add(textoPersona);
		textoPersona.setColumns(10);
		
		JButton brnSalir = new JButton("Salir");
		brnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		brnSalir.setBounds(168, 215, 85, 21);
		contentPane.add(brnSalir);
	}
}
