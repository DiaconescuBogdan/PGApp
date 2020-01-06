package PGApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class View {

	JFrame frame;
	private JTextField txtPret;
	private JTextField txtId;
	private JTextField textId2;
	private JTextField txtPret_1;
	private JTextField txtNumeprodus;
	private JTextField txtCantitate;
	private JTextField txtCategorie;

	public JTextField getTextId2() {
		return textId2;
	}

	public JTextField getTxtPret_1() {
		return txtPret_1;
	}

	public JTextField getTxtNumeprodus() {
		return txtNumeprodus;
	}

	public JTextField getTxtCantitate() {
		return txtCantitate;
	}

	public JTextField getTxtCategorie() {
		return txtCategorie;
	}

	public JTextField getTxtPret() {
		return txtPret;
	}

	public void setTxtPret(JTextField txtPret) {
		this.txtPret = txtPret;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
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
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Controller cmd = new Controller(new SelectOperation("postgres", "cartofiprajiti"), this, new InsertOperation(),
				new UpdateOperation());
		frame = new JFrame();
		frame.setBounds(100, 100, 458, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 432, 130);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnLoadDB = new JButton("Load DB");
		btnLoadDB.addActionListener(cmd);
		btnLoadDB.setForeground(Color.WHITE);
		btnLoadDB.setBackground(Color.BLUE);
		btnLoadDB.setBounds(12, 13, 113, 40);
		panel.add(btnLoadDB);

		JButton btnAdaugaCategorie = new JButton("Adauga Categorie");
		btnAdaugaCategorie.setForeground(Color.WHITE);
		btnAdaugaCategorie.setBackground(Color.BLUE);
		btnAdaugaCategorie.setBounds(137, 13, 135, 40);
		panel.add(btnAdaugaCategorie);

		JButton btnAdaugaProdus = new JButton("Adauga Produs");
		btnAdaugaProdus.addActionListener(cmd);
		btnAdaugaProdus.setForeground(Color.WHITE);
		btnAdaugaProdus.setBackground(Color.BLUE);
		btnAdaugaProdus.setBounds(284, 13, 136, 40);
		panel.add(btnAdaugaProdus);

		txtPret = new JTextField();
		txtPret.setText("Pret");
		txtPret.setBounds(9, 66, 116, 22);
		panel.add(txtPret);
		txtPret.setColumns(10);

		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setBounds(9, 103, 116, 22);
		panel.add(txtId);
		txtId.setColumns(10);

		JButton btnActualizarePret = new JButton("Actualizare pret");
		btnActualizarePret.addActionListener(cmd);
		btnActualizarePret.setBounds(147, 78, 125, 25);
		panel.add(btnActualizarePret);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 128, 432, 144);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		textId2 = new JTextField();
		textId2.setText("CodProdus");
		textId2.setBounds(12, 13, 116, 22);
		panel_1.add(textId2);
		textId2.setColumns(10);

		txtPret_1 = new JTextField();
		txtPret_1.setText("Pret");
		txtPret_1.setBounds(12, 36, 116, 22);
		panel_1.add(txtPret_1);
		txtPret_1.setColumns(10);

		txtNumeprodus = new JTextField();
		txtNumeprodus.setText("NumeProdus");
		txtNumeprodus.setBounds(12, 60, 116, 22);
		panel_1.add(txtNumeprodus);
		txtNumeprodus.setColumns(10);

		txtCantitate = new JTextField();
		txtCantitate.setText("Cantitate");
		txtCantitate.setBounds(12, 84, 116, 22);
		panel_1.add(txtCantitate);
		txtCantitate.setColumns(10);

		txtCategorie = new JTextField();
		txtCategorie.setText("Categorie");
		txtCategorie.setBounds(12, 109, 116, 22);
		panel_1.add(txtCategorie);
		txtCategorie.setColumns(10);

		JButton btnAdaugaProdus_1 = new JButton("Adauga Produs");
		btnAdaugaProdus_1.addActionListener(cmd);
		btnAdaugaProdus_1.setBounds(140, 106, 127, 25);
		panel_1.add(btnAdaugaProdus_1);
	}
}
