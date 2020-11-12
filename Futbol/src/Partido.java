import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Partido {
	
	Equipo local;
	Equipo visitante;
	String resultado;
	String arbitro;

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Equipo local = new Equipo("Chivas",7,26,114,13);
		Equipo visita = new Equipo("Querétaro",7,26,114,13);
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Partido window = new Partido(local,visita,"3-1", "Alfredo Lecona");
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
	public Partido(Equipo local, Equipo visitante, String resultado, String arbitro) {
		this.local=local;
		this.visitante=visitante;
		this.resultado=resultado;
		this.arbitro=arbitro;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 102));
		
		JLabel lblNewLabel = new JLabel("Local: "+ this.local.nombre);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Visita: "+ this.visitante.nombre);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel(this.resultado);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe el resultado: ");
				setResultado(name);
				lblNewLabel_2.setText(getResultado());
			}
		});
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Aribtro: "+this.arbitro);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name;
			    name = JOptionPane.showInputDialog("Escribe el nombre del arbitro: ");
				setArbitro(name);
				lblNewLabel_3.setText("Aribtro: "+getArbitro());
				
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addGap(52)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
							.addGap(19))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(93)
					.addComponent(lblNewLabel_3)
					.addContainerGap(99, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
