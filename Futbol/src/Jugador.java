import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Jugador {
	Equipo equipo;
	int tiempoDisputado;
	int goles;
	String posicion;
	Icon foto;
	
	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public int getTiempoDisputado() {
		return tiempoDisputado;
	}

	public void setTiempoDisputado(int tiempoDisputado) {
		this.tiempoDisputado = tiempoDisputado;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Icon getFoto() {
		return foto;
	}

	public void setFoto(Icon foto) {
		this.foto = foto;
	}

	public Equipo getEquipoDebut() {
		return equipoDebut;
	}

	public void setEquipoDebut(Equipo equipoDebut) {
		this.equipoDebut = equipoDebut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	Equipo equipoDebut;
	int edad;
	int titulos;
	String nombre;
	String nacionalidad;
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Equipo actual = new Equipo("Chivas",7,26,114,13);
		Equipo pasado = new Equipo("Querétaro",7,26,114,13);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jugador window = new Jugador(actual,270,70,"Delantero",pasado,27,2,"Raúl Jiménez","Mexicana");
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
	public Jugador(Equipo equipo, int tiempoDisputado, int goles, String posicion, Equipo equipoDebut, int edad, int titulos, String nombre, String nacionalidad) {
		this.equipo=equipo;
		this.tiempoDisputado=tiempoDisputado;
		this.goles=goles;
		this.posicion=posicion;
		this.equipoDebut=equipoDebut;
		this.edad=edad;
		this.titulos=titulos;
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		
		JLabel lblNewLabel = new JLabel("Nombre: "+getNombre());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Equipo: "+getEquipo().nombre);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Equipo equipo = getEquipo();
				equipo.setNombre(JOptionPane.showInputDialog("Escribe el nombre del equipo: "));
				lblNewLabel_1.setText("Equipo: "+equipo.getNombre());
			}
		});
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1 = new JLabel("Equipo Debut: "+getEquipoDebut().nombre);
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Equipo equipo = getEquipoDebut();
				equipo.setNombre(JOptionPane.showInputDialog("Escribe el nombre del equipo: "));
				lblNewLabel_1_1.setText("Equipo: "+equipo.getNombre());
			}
		});
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_2 = new JLabel("Nacionalidad: "+getNacionalidad());
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe la Nacionalidad: ");
				setNacionalidad(name);
				lblNewLabel_1_2.setText("Nacionalidad: "+getNacionalidad());
			}
		});
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Goles: "+getGoles());
		lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe los goles: ");
			    int titulos = Integer.parseInt(name);
				setGoles(titulos);
				lblNewLabel_1_2_1.setText("Goles: "+getGoles());
			}
		});
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Tiempo Disputado: "+getTiempoDisputado()+" minutos");
		lblNewLabel_1_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe el tiempo disputado: ");
			    int titulos = Integer.parseInt(name);
				setTiempoDisputado(titulos);
				lblNewLabel_1_2_1_1.setText("Tiempo Disputado: "+getTiempoDisputado()+" minutos");
			}
		});
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Posición: "+getPosicion());
		lblNewLabel_1_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe la Posición: ");
				setPosicion(name);
				lblNewLabel_1_2_1_2.setText("Posición: "+getPosicion());
			}
		});
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("Edad: "+getEdad());
		lblNewLabel_1_2_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe la edad: ");
			    int titulos = Integer.parseInt(name);
				setEdad(titulos);
				lblNewLabel_1_2_1_3.setText("Edad: "+getEdad());
			}
		});
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_2_1_4 = new JLabel("Títulos: "+getTitulos());
		lblNewLabel_1_2_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe los títulos: ");
			    int titulos = Integer.parseInt(name);
				setTitulos(titulos);
				lblNewLabel_1_2_1_4.setText("Títulos: "+getTitulos());
			}
		});
		lblNewLabel_1_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(133)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
					.addGap(46))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_2_1_2, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_2_1_4, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_2_1_3, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(26)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(lblNewLabel_1_2_1_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_2_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_2_1_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(321, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
