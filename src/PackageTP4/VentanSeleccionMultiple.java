package PackageTP4;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanSeleccionMultiple extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ButtonGroup grupoBtonSO;
	private JRadioButton rdbtnMac;
	private JRadioButton rdbtnwindows;
	private JRadioButton rdbtnlinux;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JTextField txths;
	

	public VentanSeleccionMultiple() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 512, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnwindows = new JRadioButton("Windows");
		rdbtnwindows.setBounds(193, 25, 86, 23);
		contentPane.add(rdbtnwindows);
		
		rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(294, 25, 67, 23);
		contentPane.add(rdbtnMac);
		
		rdbtnlinux = new JRadioButton("Linux");
		rdbtnlinux.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnlinux.setBounds(363, 25, 81, 23);
		contentPane.add(rdbtnlinux);
		
		lblNewLabel = new JLabel("Eliije un sistema operativo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(26, 25, 148, 23);
		contentPane.add(lblNewLabel);
		
		grupoBtonSO= new ButtonGroup();
		grupoBtonSO.add(rdbtnwindows);
		grupoBtonSO.add(rdbtnMac);
		grupoBtonSO.add(rdbtnlinux);
		
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(26, 159, 148, 23);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnprogramacion = new JRadioButton("Programacion");
		rdbtnprogramacion.setBounds(193, 118, 168, 23);
		contentPane.add(rdbtnprogramacion);
		
		JRadioButton rdbtnAdministracion = new JRadioButton("Administracion");
		rdbtnAdministracion.setBounds(193, 159, 152, 23);
		contentPane.add(rdbtnAdministracion);
		
		JRadioButton rdbtnDiseoGrafico = new JRadioButton("Dise\u00F1o Grafico");
		rdbtnDiseoGrafico.setBounds(193, 202, 152, 23);
		contentPane.add(rdbtnDiseoGrafico);
		
		lblNewLabel_2 = new JLabel("Cantidad de horas en el computador");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(26, 281, 207, 23);
		contentPane.add(lblNewLabel_2);
		
		txths = new JTextField();
		txths.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		txths.setBounds(243, 282, 102, 20);
		contentPane.add(txths);
		txths.setColumns(10);
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String SO= ButtonSeleccionadoSO();
				String Especialidad=ButtonSelecionadosES();
				String cantHs=txths.getText();
				
				if (SO!=null && Especialidad!= null) {
					JOptionPane.showMessageDialog(null,""+SO+Especialidad+" - "+cantHs);
				}
			}

			private String ButtonSelecionadosES() {
				String Seleccion ="";
				int b=0;
				if(rdbtnprogramacion.isSelected()) {
					 Seleccion+=" - " +rdbtnprogramacion.getText();
					 b++;
				}
				if(rdbtnAdministracion.isSelected()) {
					Seleccion+=" - " + rdbtnAdministracion.getText();
					b++;
					}
				if (rdbtnDiseoGrafico.isSelected()) {
					Seleccion+=" - "+ rdbtnDiseoGrafico.getText();
					b++;
				}
				if (b==0) {
					JOptionPane.showMessageDialog(null, "Elegir una opcion de Especialidad");
					Seleccion=null;
				}
				return Seleccion;
			}

			private String ButtonSeleccionadoSO() {
				String vacio = null;
				if(rdbtnwindows.isSelected()) {
					return rdbtnwindows.getText();
				}
				else {
					if(rdbtnMac.isSelected()) {
						return rdbtnMac.getText();
					}
					else {
						if (rdbtnlinux.isSelected()) {
							return rdbtnlinux.getText();
						}
					}
				}
				JOptionPane.showMessageDialog(null, "Elegir una opcion de Sistema Operativo");
				return vacio;
			}
		});
		btnaceptar.setBounds(355, 327, 89, 23);
		contentPane.add(btnaceptar);
	}
}
