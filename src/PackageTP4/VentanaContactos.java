package PackageTP4;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaContactos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefon;
	private JTextField txtfechanac;
	private JLabel lblnombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblFechaNac;
	private JButton btnNewButton;
	private JLabel lblmensaje;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VentanaContactos() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 367, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
		txtNombre.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				txtNombre.setBackground(Color.white);
			}
		});
		txtNombre.setBounds(124, 50, 190, 25);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				txtApellido.setBackground(Color.white);
			}
		});
		txtApellido.setColumns(10);
		txtApellido.setBounds(124, 101, 190, 25);
		contentPane.add(txtApellido);
		
		txtTelefon = new JTextField();
		txtTelefon.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				txtTelefon.setBackground(Color.white);
			}
		});
		txtTelefon.setColumns(10);
		txtTelefon.setBounds(124, 156, 190, 25);
		contentPane.add(txtTelefon);
		
		txtfechanac = new JTextField();
		txtfechanac.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				txtfechanac.setBackground(Color.white);
			}
		});
		txtfechanac.setColumns(10);
		txtfechanac.setBounds(124, 211, 190, 25);
		contentPane.add(txtfechanac);
		
		lblnombre = new JLabel("Nombre:");
		lblnombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblnombre.setBounds(10, 50, 93, 25);
		contentPane.add(lblnombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setBounds(10, 101, 93, 25);
		contentPane.add(lblApellido);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setBounds(10, 156, 93, 25);
		contentPane.add(lblTelefono);
		
		lblFechaNac = new JLabel("Fecha Nac");
		lblFechaNac.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaNac.setBounds(10, 211, 93, 25);
		contentPane.add(lblFechaNac);
		
		btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtcompletos()) {
					lblmensaje.setVisible(true);
					lblmensaje.setText("Los datos ingresados fueron: "+txtNombre.getText()+", "+txtApellido.getText()+", "+txtfechanac.getText()+", "+txtTelefon.getText());
					txtApellido.setText("");
					txtfechanac.setText("");
					txtTelefon.setText("");
					txtNombre.setText("");
				}
			}

			private boolean txtcompletos() {
				boolean correcto= true;
				String vacio="";
				if(txtNombre.getText().equals(vacio)) {
					correcto=false;
					txtNombre.setBackground(Color.red);
				}
				if (txtApellido.getText().equals(vacio)) {
					correcto=false;
					txtApellido.setBackground(Color.red);
				}
				if (txtTelefon.getText().equals(vacio)) {
					correcto=false;
					txtTelefon.setBackground(Color.red);
				}
				if(txtfechanac.getText().equals(vacio)) {
					correcto= false;
					txtfechanac.setBackground(Color.red);
				}
				return correcto;
			}
		});
		btnNewButton.setBounds(169, 268, 144, 25);
		contentPane.add(btnNewButton);
		
		lblmensaje = new JLabel("");
		lblmensaje.setBounds(10, 351, 259, 25);
		contentPane.add(lblmensaje);
	}
}
