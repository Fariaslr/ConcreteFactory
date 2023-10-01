package br.com.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import Atxy2k.CustomTextField.RestrictedTextField;
import br.com.aplication.BordaCantoArredondado;
import br.com.data.*;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VIEWconcreteFactory {

	private JFrame frmFbricaDeConcreto;
	private JTextField txtPesoHalter;
	private JLabel lblkg;
	private JTextField txtCimentoML;
	private JTextField txtAreiaML;
	private JTextField txtCimentoDosagem;
	private JTextField txtAreiaDosagem;
	private JTextField txtBritaML;
	private JTextField txtBritaDosagem;
	private JTextField txtColaML;
	private JTextField txtColaDosagem;
	private JTextField txtAguaML;
	private JTextField txtAguaDosagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIEWconcreteFactory window = new VIEWconcreteFactory();
					window.frmFbricaDeConcreto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VIEWconcreteFactory() {
		initialize();
	}

	Medida medida = new Medida();
	Dosagem dose = new Dosagem();

	public void mostraValores() {

		String ml = " ml";
		txtCimentoML.setText(Integer.toString(medida.getCimento()).concat(ml));
		txtAreiaML.setText(Integer.toString(medida.getAreia()).concat(ml));
		txtAguaML.setText(Integer.toString(medida.getAgua()).concat(ml));
		txtBritaML.setText(Integer.toString(medida.getBrita()).concat(ml));
		txtColaML.setText(Integer.toString(medida.getCola()).concat(ml));

		String doses = " doses";
		txtCimentoDosagem.setText(Float.toString(dose.getCimento()).format("%.0f", dose.getCimento()).concat(doses));
		txtAreiaDosagem.setText(Float.toString(dose.getAreia()).format("%.0f", dose.getAreia()).concat(doses));
		txtAguaDosagem.setText(Float.toString(dose.getAgua()).format("%.1f", dose.getAgua()).concat(doses));
		txtBritaDosagem.setText(Float.toString(dose.getBrita()).format("%.0f", dose.getBrita()).concat(doses));
		txtColaDosagem.setText(Float.toString(dose.getCola()).format("%.2f", dose.getCola()).concat(doses));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmFbricaDeConcreto = new JFrame();
		frmFbricaDeConcreto.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VIEWconcreteFactory.class.getResource("/br/com/icon/icon aplication.png")));
		frmFbricaDeConcreto.setResizable(false);
		frmFbricaDeConcreto.setTitle("Fábrica de concreto");
		frmFbricaDeConcreto.setAlwaysOnTop(true);
		frmFbricaDeConcreto.setBounds(-42, -177, 298, 584);
		frmFbricaDeConcreto.getContentPane().setLayout(null);

		JLabel lblPesoHalter = new JLabel("Halter", SwingConstants.CENTER);
		lblPesoHalter.setForeground(Color.WHITE);
		lblPesoHalter.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblPesoHalter.setToolTipText("");
		lblPesoHalter.setBounds(86, 39, 45, 15);
		frmFbricaDeConcreto.getContentPane().add(lblPesoHalter);

		txtPesoHalter = new JTextField();
		txtPesoHalter.setHorizontalAlignment(txtPesoHalter.CENTER);
		txtPesoHalter.setBounds(136, 35, 20, 25);
		frmFbricaDeConcreto.getContentPane().add(txtPesoHalter);
		txtPesoHalter.setColumns(10);
		txtPesoHalter.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
		txtPesoHalter.setBackground(new Color(192, 192, 192));

		lblkg = new JLabel("kg");
		lblkg.setForeground(Color.WHITE);
		lblkg.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblkg.setBounds(164, 33, 46, 23);
		frmFbricaDeConcreto.getContentPane().add(lblkg);

		JPanel panelHalterPeso = new JPanel();
		panelHalterPeso.setBackground(new Color(192, 192, 192));
		panelHalterPeso.setBounds(30, 25, 230, 100);
		panelHalterPeso.setBorder(new BordaCantoArredondado());
		frmFbricaDeConcreto.getContentPane().add(panelHalterPeso);
		panelHalterPeso.setLayout(null);

		JLabel lblDosagem = new JLabel("Dosagem");
		lblDosagem.setForeground(new Color(255, 255, 255));
		lblDosagem.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblDosagem.setBounds(25, 53, 68, 26);
		panelHalterPeso.add(lblDosagem);

		JComboBox cboDosagem = new JComboBox();
		cboDosagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					dose.setDoseRecipiente(Float.parseFloat(cboDosagem.getSelectedItem().toString().replace("ml", "")));
					dose.calculaDosagem(medida);
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		cboDosagem.setModel(new DefaultComboBoxModel(new String[] { "", "200 ml", "300 ml", "500 ml", "750 ml", "1000 ml" }));
		cboDosagem.setBounds(110, 57, 88, 22);
		panelHalterPeso.add(cboDosagem);
		frmFbricaDeConcreto.setLocationRelativeTo(null);

		JPanel panelCimento = new JPanel();
		panelCimento.setBounds(40, 156, 210, 55);
		frmFbricaDeConcreto.getContentPane().add(panelCimento);
		panelCimento.setLayout(null);
		panelCimento.setBorder(new BordaCantoArredondado());

		JLabel lblCimentoIcon = new JLabel("");
		lblCimentoIcon.setIcon(new ImageIcon(VIEWconcreteFactory.class.getResource("/br/com/icon/icon cimento.png")));
		lblCimentoIcon.setBounds(12, 5, 30, 35);
		panelCimento.add(lblCimentoIcon);

		JLabel lblCimento = new JLabel("Cimento");
		lblCimento.setForeground(Color.DARK_GRAY);
		lblCimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCimento.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblCimento.setBounds(3, 36, 55, 15);
		panelCimento.add(lblCimento);

		txtCimentoML = new JTextField();
		txtCimentoML.setHorizontalAlignment(SwingConstants.CENTER);
		txtCimentoML.setEditable(false);
		txtCimentoML.setBounds(112, 11, 85, 20);
		panelCimento.add(txtCimentoML);
		txtCimentoML.setColumns(10);
		txtCimentoML.setBorder(null);

		txtCimentoDosagem = new JTextField();
		txtCimentoDosagem.setHorizontalAlignment(SwingConstants.CENTER);
		txtCimentoDosagem.setEditable(false);
		txtCimentoDosagem.setBounds(112, 30, 85, 20);
		panelCimento.add(txtCimentoDosagem);
		txtCimentoDosagem.setColumns(10);
		txtCimentoDosagem.setBorder(null);

		JPanel panelAreia = new JPanel();
		panelAreia.setBounds(40, 217, 210, 55);
		frmFbricaDeConcreto.getContentPane().add(panelAreia);
		panelAreia.setLayout(null);
		panelAreia.setBorder(new BordaCantoArredondado());

		JLabel lblAreiaIcon = new JLabel("");
		lblAreiaIcon.setIcon(new ImageIcon(VIEWconcreteFactory.class.getResource("/br/com/icon/icon areia.png")));
		lblAreiaIcon.setBounds(15, 3, 30, 35);
		panelAreia.add(lblAreiaIcon);

		JLabel lbliconAreia = new JLabel("Areia");
		lbliconAreia.setForeground(Color.DARK_GRAY);
		lbliconAreia.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconAreia.setFont(new Font("Tahoma", Font.BOLD, 9));
		lbliconAreia.setBounds(5, 35, 55, 15);
		panelAreia.add(lbliconAreia);

		txtAreiaML = new JTextField();
		txtAreiaML.setHorizontalAlignment(SwingConstants.CENTER);
		txtAreiaML.setEditable(false);
		txtAreiaML.setColumns(10);
		txtAreiaML.setBorder(null);
		txtAreiaML.setBounds(112, 10, 86, 20);
		panelAreia.add(txtAreiaML);

		txtAreiaDosagem = new JTextField();
		txtAreiaDosagem.setHorizontalAlignment(SwingConstants.CENTER);
		txtAreiaDosagem.setEditable(false);
		txtAreiaDosagem.setBounds(112, 29, 86, 20);
		panelAreia.add(txtAreiaDosagem);
		txtAreiaDosagem.setColumns(10);
		txtAreiaDosagem.setBorder(null);

		JPanel panelBrita = new JPanel();
		panelBrita.setLayout(null);
		panelBrita.setBorder(new BordaCantoArredondado());
		panelBrita.setBounds(40, 280, 210, 55);
		frmFbricaDeConcreto.getContentPane().add(panelBrita);

		JLabel lblBritaIcon = new JLabel("");
		lblBritaIcon.setIcon(new ImageIcon(VIEWconcreteFactory.class.getResource("/br/com/icon/icon brita.png")));
		lblBritaIcon.setBounds(15, 4, 30, 35);
		panelBrita.add(lblBritaIcon);

		JLabel lbliconAreia_1 = new JLabel("Brita");
		lbliconAreia_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconAreia_1.setForeground(Color.DARK_GRAY);
		lbliconAreia_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		lbliconAreia_1.setBounds(5, 36, 55, 15);
		panelBrita.add(lbliconAreia_1);

		txtBritaML = new JTextField();
		txtBritaML.setHorizontalAlignment(SwingConstants.CENTER);
		txtBritaML.setEditable(false);
		txtBritaML.setColumns(10);
		txtBritaML.setBorder(null);
		txtBritaML.setBounds(112, 10, 86, 20);
		panelBrita.add(txtBritaML);

		txtBritaDosagem = new JTextField();
		txtBritaDosagem.setHorizontalAlignment(SwingConstants.CENTER);
		txtBritaDosagem.setEditable(false);
		txtBritaDosagem.setColumns(10);
		txtBritaDosagem.setBorder(null);
		txtBritaDosagem.setBounds(112, 29, 86, 20);
		panelBrita.add(txtBritaDosagem);

		JPanel panelBrita_1 = new JPanel();
		panelBrita_1.setLayout(null);
		panelBrita_1.setBorder(new BordaCantoArredondado());
		panelBrita_1.setBounds(40, 403, 210, 55);
		frmFbricaDeConcreto.getContentPane().add(panelBrita_1);

		JLabel lblColaIcon = new JLabel("");
		lblColaIcon.setIcon(new ImageIcon(VIEWconcreteFactory.class.getResource("/br/com/icon/icon glue.png")));
		lblColaIcon.setBounds(15, 4, 30, 35);
		panelBrita_1.add(lblColaIcon);

		JLabel txtCola = new JLabel("Cola");
		txtCola.setHorizontalAlignment(SwingConstants.CENTER);
		txtCola.setForeground(Color.DARK_GRAY);
		txtCola.setFont(new Font("Tahoma", Font.BOLD, 9));
		txtCola.setBounds(5, 36, 55, 15);
		panelBrita_1.add(txtCola);

		txtColaML = new JTextField();
		txtColaML.setHorizontalAlignment(SwingConstants.CENTER);
		txtColaML.setEditable(false);
		txtColaML.setColumns(10);
		txtColaML.setBounds(112, 10, 86, 20);
		panelBrita_1.add(txtColaML);
		txtColaML.setBorder(null);

		txtColaDosagem = new JTextField();
		txtColaDosagem.setHorizontalAlignment(SwingConstants.CENTER);
		txtColaDosagem.setEditable(false);
		txtColaDosagem.setColumns(10);
		txtColaDosagem.setBounds(112, 29, 86, 20);
		panelBrita_1.add(txtColaDosagem);
		txtColaDosagem.setBorder(null);

		JPanel panelAreia_1 = new JPanel();
		panelAreia_1.setLayout(null);
		panelAreia_1.setBorder(new BordaCantoArredondado());
		panelAreia_1.setBounds(40, 341, 210, 55);
		frmFbricaDeConcreto.getContentPane().add(panelAreia_1);

		JLabel lblAguaIcon = new JLabel("");
		lblAguaIcon.setIcon(new ImageIcon(VIEWconcreteFactory.class.getResource("/br/com/icon/icon água.png")));
		lblAguaIcon.setBounds(15, 3, 30, 35);
		panelAreia_1.add(lblAguaIcon);

		JLabel lbliconAreia_2 = new JLabel("Água");
		lbliconAreia_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconAreia_2.setForeground(Color.DARK_GRAY);
		lbliconAreia_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		lbliconAreia_2.setBounds(5, 35, 55, 15);
		panelAreia_1.add(lbliconAreia_2);

		txtAguaML = new JTextField();
		txtAguaML.setHorizontalAlignment(SwingConstants.CENTER);
		txtAguaML.setEditable(false);
		txtAguaML.setColumns(10);
		txtAguaML.setBounds(112, 10, 86, 20);
		panelAreia_1.add(txtAguaML);
		txtAguaML.setBorder(null);

		txtAguaDosagem = new JTextField();
		txtAguaDosagem.setHorizontalAlignment(SwingConstants.CENTER);
		txtAguaDosagem.setEditable(false);
		txtAguaDosagem.setColumns(10);
		txtAguaDosagem.setBounds(112, 29, 86, 20);
		panelAreia_1.add(txtAguaDosagem);
		txtAguaDosagem.setBorder(null);

		RestrictedTextField validar = new RestrictedTextField(txtPesoHalter);
		validar.setOnlyNums(true);
		validar.setLimit(2);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (txtPesoHalter.getText().equals("")) {
						JOptionPane.showMessageDialog(frmFbricaDeConcreto, "Informe o peso do halter");
					} else {
						medida.setPesoHalter(Integer.parseInt(txtPesoHalter.getText()));
						medida.calculaMedidas();
						dose.calculaDosagem(medida);

						mostraValores();
					}
				} catch (Exception e2) {
					JOptionPane.showConfirmDialog(null, e2);
				}

			}

		});

		btnConsultar.setBounds(161, 490, 89, 23);
		frmFbricaDeConcreto.getContentPane().add(btnConsultar);

	}
}
