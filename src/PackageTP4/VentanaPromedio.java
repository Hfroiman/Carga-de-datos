package PackageTP4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPromedio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txrnota1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txtpromedio;
	private JTextField txtcondicion;
	private JComboBox<String> cboTP;
	private JButton btncalcular;
	private JButton btnNuevo;
	private JButton btnSalir;
	
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public VentanaPromedio() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 504, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nota 1:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 60, 100, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(47, 106, 100, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNota = new JLabel("Nota 3:");
		lblNota.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota.setBounds(47, 153, 100, 24);
		contentPane.add(lblNota);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setHorizontalAlignment(SwingConstants.CENTER);
		lblTps.setBounds(47, 215, 100, 24);
		contentPane.add(lblTps);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromedio.setBounds(47, 328, 120, 35);
		contentPane.add(lblPromedio);
		
		JLabel lblPromedio_1 = new JLabel("Condicion");
		lblPromedio_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromedio_1.setBounds(47, 380, 120, 35);
		contentPane.add(lblPromedio_1);
		
		txrnota1 = new JTextField();
		txrnota1.setBounds(176, 62, 113, 24);
		contentPane.add(txrnota1);
		txrnota1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(176, 106, 113, 24);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(176, 153, 113, 24);
		contentPane.add(txt3);
		
		txtpromedio = new JTextField();
		txtpromedio.setColumns(10);
		txtpromedio.setBounds(177, 335, 113, 24);
		contentPane.add(txtpromedio);
		
		txtcondicion = new JTextField();
		txtcondicion.setColumns(10);
		txtcondicion.setBounds(177, 387, 113, 24);
		contentPane.add(txtcondicion);
		
		cboTP = new JComboBox<String>();
		cboTP.setBounds(176, 217, 113, 24);
		cboTP.addItem("Aprobado");
		cboTP.addItem("Desaprobado");
		contentPane.add(cboTP);
		
		btncalcular = new JButton("CALCULAR");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Numeroscorrectos()) {
					Calculo();
				}
			}

			private void Calculo() {
				String d="Desaprobado";
				int n1=Integer.parseInt(txrnota1.getText());
				int n2=Integer.parseInt(txt2.getText());
				int n3=Integer.parseInt(txt3.getText());
				int min=6;
				int pr=8;
				int promedio= (n1+n2+n3)/3;
				if (cboTP.getSelectedItem().equals(d) || n1<min || n2<min || n3<min) {
					txtcondicion.setText("LIBRE");
					txtpromedio.setText(String.valueOf(promedio));
					return;
				}
				else {
					if (n1>=pr && n2>=pr && n3>=pr) {
						txtcondicion.setText("PROMOCIONADO");
						txtpromedio.setText(String.valueOf(promedio));
						return;
					}
					else {
						if (n1<=pr && n1>=min && n2<=pr && n2>=min && n3<=pr && n3>=min) {
							txtcondicion.setText("Regular");
							txtpromedio.setText(String.valueOf(promedio));
							return;
						}
					}
				}
				
				
			}

			private boolean Numeroscorrectos() {
				boolean ok= true;
				int min=0;
				int max=10;
				if(!(Integer.parseInt(txrnota1.getText())>min && Integer.parseInt(txrnota1.getText())<=max)) {
					JOptionPane.showMessageDialog(null,"Numero no permitido. "+txrnota1.getText());
					txrnota1.setText("");
					ok=false;
				}
				if(!(Integer.parseInt(txt2.getText())>min && Integer.parseInt(txt2.getText())<=max)) {
					JOptionPane.showMessageDialog(null,"Numero no permitido. "+txt2.getText());
					txt2.setText("");
					ok=false;
				}
				if (!(Integer.parseInt(txt3.getText())>min && Integer.parseInt(txt3.getText())<=max)) {
					JOptionPane.showMessageDialog(null,"Numero no permitido. "+txt3.getText());
					txt3.setText("");
					ok=false;
				}
				return ok;
			}
		});
		btncalcular.setBounds(345, 120, 106, 35);
		contentPane.add(btncalcular);
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txrnota1.setText("");
				txt2.setText("");
				txt3.setText("");
				txtcondicion.setText("");
				txtpromedio.setText("");
			}
		});
		btnNuevo.setBounds(345, 170, 106, 35);
		contentPane.add(btnNuevo);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setBounds(345, 216, 106, 35);
		contentPane.add(btnSalir);
	}
}
