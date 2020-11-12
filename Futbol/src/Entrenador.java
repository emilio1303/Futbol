import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Entrenador {
	
	String nombre;
	Equipo equipo;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Icon getFoto() {
		return foto;
	}

	public void setFoto(Icon foto) {
		this.foto = foto;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public Equipo getEquipoPasado() {
		return equipoPasado;
	}

	public void setEquipoPasado(Equipo equipoPasado) {
		this.equipoPasado = equipoPasado;
	}

	int edad;
	Icon foto;
	int titulos;
	Equipo equipoPasado;

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
					Entrenador window = new Entrenador("Victor Manuel Vucetich",actual,65,5,pasado);
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
	public Entrenador(String nombre, Equipo equipo, int edad, int titulos, Equipo equipoPasado) {
		this.nombre=nombre;
		this.equipo=equipo;
		this.edad=edad;
		this.titulos=titulos;
		this.equipoPasado=equipoPasado;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 0, 51));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Equipo: "+this.equipo.nombre);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Equipo equipo = getEquipo();
				equipo.setNombre(JOptionPane.showInputDialog("Escribe el nombre del equipo actual: "));
				lblNewLabel.setText("Equipo: "+equipo.getNombre());
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: "+this.nombre);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe el nombre del entrenador: ");
				setNombre(name);
				lblNewLabel_1.setText("Nombre: "+getNombre());
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Edad: "+this.edad);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe la edad del entrenador: ");
			    int edad = Integer.parseInt(name);
				setEdad(edad);
				lblNewLabel_2.setText("Edad: "+getEdad());
			}
		});
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Títulos: "+this.titulos);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe la cantidad de títulos: ");
			    int titulos = Integer.parseInt(name);
				setTitulos(titulos);
				lblNewLabel_3.setText("Títulos: "+getTitulos());
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("Equipo anterior: "+this.equipoPasado.nombre);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Equipo equipo = getEquipoPasado();
				equipo.setNombre(JOptionPane.showInputDialog("Escribe el nombre del equipo anterior: "));
				lblNewLabel_4.setText("Equipo anterior: "+equipo.getNombre());
			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(39, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(113, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_1)
					.addGap(27)
					.addComponent(lblNewLabel_2)
					.addGap(26)
					.addComponent(lblNewLabel)
					.addGap(39)
					.addComponent(lblNewLabel_3)
					.addGap(33)
					.addComponent(lblNewLabel_4)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
