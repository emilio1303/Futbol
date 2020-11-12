import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Equipo {
	
	Jugador[] jugadores;
	Entrenador entrenador;
	Estadio estadio;
	Partido[] partidos;
	int puntos;
	Icon escudo;
	int posicion;
	int years;
	int titulos;
	String nombre;
	
	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Partido[] getPartidos() {
		return partidos;
	}

	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public Icon getEscudo() {
		return escudo;
	}

	public void setEscudo(Icon escudo) {
		this.escudo = escudo;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getyears() {
		return years;
	}

	public void setyears(int years) {
		this.years = years;
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


	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Equipo window = new Equipo("Chivas",7,26,114,13);
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
	public Equipo(String nombre, int posicion, int puntos, int years, int titulos) {
		this.nombre=nombre;
		this.posicion=posicion;
		this.puntos=puntos;
		this.years=years;
		this.titulos=titulos;
		initialize();
	}
	
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 153));
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Equipo: "+this.nombre);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Posición: "+this.posicion);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Puntos: "+this.puntos);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Años de existencia: "+this.years);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("Títulos: "+this.titulos);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("Estadio: "+this.estadio);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_6 = new JLabel("Entrenador: "+this.entrenador);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNewLabel_2)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel_1)
										.addGap(326)
										.addComponent(lblNewLabel))
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(198, Short.MAX_VALUE)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(137))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(29)
					.addComponent(lblNewLabel_4)
					.addGap(33)
					.addComponent(lblNewLabel_5)
					.addGap(36)
					.addComponent(lblNewLabel_6)
					.addGap(320))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	
	}
}
