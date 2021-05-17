import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Ejemplo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;

	public static ResultSet resul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Label1 = new JLabel("NOMBRE");
		Label1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Label1.setBounds(41, 11, 190, 37);
		contentPane.add(Label1);

		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldNombre.setBounds(100, 373, 349, 26);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		JButton Boton1 = new JButton("Cargar Datos");
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNombre.setText("Hello world");
				JOptionPane.showMessageDialog(contentPane, "Accediendo a Pokeball", "Mi Pokeball",
						JOptionPane.INFORMATION_MESSAGE);

				try {

					Class.forName("com.mysql.jdbc.Driver"); // Driver JDBC para conexion
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Pokedex", "root", ""); // Parametros
																														// conexion:
																														// servidor
																														// bbdd,
																														// usuario,
																														// password
					Statement sentencia = conexion.createStatement(); // variable de tipo Statement para poder hacer la
																		// conulta
					String sql = "SELECT * FROM mispokemon"; // string que contiene la consulta a bbbdd
					resul = sentencia.executeQuery(sql); // ejecucion de la consulta, toda la información de la bbdd
															// está ahora en resul
					resul.next(); // avanzamos al primer elemento de la consulta
					textFieldNombre.setText(resul.getString(2)); // el elemento de la posicion dos es el nombre del
																	// pokemon asi que accedemos a el y lo mostramos en
																	// la caja de texto

				} catch (ClassNotFoundException cn) {
					cn.printStackTrace();
				} catch (SQLException e3) {
					e3.printStackTrace();
				}

			}
		});
		Boton1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Boton1.setBounds(100, 410, 164, 37);
		contentPane.add(Boton1);

		JButton nextbutton = new JButton("Siguiente");
		nextbutton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nextbutton.setBounds(297, 410, 155, 37);
		contentPane.add(nextbutton);

		nextbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					resul.next();
					textFieldNombre.setText(resul.getString(2));

				} catch (SQLException e1) {

					JOptionPane.showMessageDialog(contentPane, "No hay más Pokemon",
							"En tu Pokeball no hay más Pokemon", JOptionPane.ERROR_MESSAGE);

				}

			}
		});

		
		public static final Blob fotos;
		public static final Image img=null;
		public static final ImageIcon imagen=null;
		JLabel lblImagenPokemon = new JLabel("");
		lblImagenPokemon.setBounds(192, 133, 150, 150);
		contentPane.add(lblImagenPokemon);

		fotos=resul.getBlob(7);
		byte[] fotorecuperada= fotos.getBytes(1, (int)fotos.length());
		BufferedImage imagenes = ImageIO.read(new ByteArrayInputStream(fotorecuperada));
		img= imagenes.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		imagen= new ImageIcon(img);
		lblImagenPokemon.setIcon(imagen);
	}
}
