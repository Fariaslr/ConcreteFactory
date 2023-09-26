package br.com.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;
import br.com.data.Dosagem;
import br.com.data.Medidas;

import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VIEWFactoryHalter extends JFrame {

    private JPanel contentPane;
    private JTextField txtPesoHalter;
    private JTextField txtCimento;
    private JTextField txtAreia;
    private JLabel lblAgua;
    private JTextField txtAgua;
    private JLabel lblBrita;
    private JTextField txtBrita;
    private JLabel lblCola;
    private JTextField txtCola;
    private JLabel lblDosagem;

    /**
     * Launch the application.
     */
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VIEWFactoryHalter frame = new VIEWFactoryHalter();
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
    public VIEWFactoryHalter() {
        setAlwaysOnTop(true);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(VIEWFactoryHalter.class.getResource("/br/com/icon/icon aplication.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, -20, 400, 273);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setLocationRelativeTo(null);

        Medidas medida = new Medidas();
        Dosagem dose = new Dosagem();

        setContentPane(contentPane);
        contentPane.setLayout(null);
        getContentPane().setLayout(null);

        txtPesoHalter = new JTextField();
        txtPesoHalter.setBounds(101, 27, 29, 20);
        txtPesoHalter.setBackground(Color.WHITE);
        txtPesoHalter.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        contentPane.add(txtPesoHalter);
        txtPesoHalter.setColumns(10);

        JButton btnConsulta = new JButton("Consultar");
        btnConsulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtPesoHalter.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informe o peso do halter");
                } else {

                    medida.setPesoHalter(Integer.parseInt(txtPesoHalter.getText()));

                    medida.calculaMedidas();
                    dose.calculaDosagem(medida);

                    mostraValores();

                    System.out.println(dose.toString());
                }
            }

            public void mostraValores() {

                String ml = " ml";
                txtCimento.setText(Integer.toString(medida.getCimento()).concat(ml));
                txtAreia.setText(Integer.toString(medida.getAreia()).concat(ml));
                txtAgua.setText(Integer.toString(medida.getAgua()).concat(ml));
                txtBrita.setText(Integer.toString(medida.getBrita()).concat(ml));
                txtCola.setText(Integer.toString(medida.getCola()).concat(ml));
            }
        });

        btnConsulta.setBounds(240, 195, 100, 20);
        contentPane.add(btnConsulta);

        JLabel lblNewLabel = new JLabel("Halter");
        lblNewLabel.setBounds(52, 29, 57, 14);
        lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(240, 240, 240));
        contentPane.add(lblNewLabel);

        txtCimento = new JTextField();
        txtCimento.setBounds(90, 82, 54, 20);
        txtCimento.setEditable(false);
        contentPane.add(txtCimento);
        txtCimento.setColumns(10);
        txtCimento.setBorder(null);

        txtAreia = new JTextField();
        txtAreia.setBounds(199, 83, 54, 20);
        contentPane.add(txtAreia);
        txtAreia.setColumns(10);
        txtAreia.setEditable(false);
        txtAreia.setBorder(null);

        JLabel lblCimento = new JLabel();
        lblCimento.setIcon(new ImageIcon(VIEWFactoryHalter.class.getResource("/br/com/icon/icon cimento.png")));
        lblCimento.setBounds(50, 72, 32, 32);
        contentPane.add(lblCimento);

        JLabel lblAreia = new JLabel();
        lblAreia.setIcon(new ImageIcon(VIEWFactoryHalter.class.getResource("/br/com/icon/icon areia.png")));
        lblAreia.setBounds(160, 72, 32, 32);
        contentPane.add(lblAreia);

        lblAgua = new JLabel();
        lblAgua.setIcon(new ImageIcon(VIEWFactoryHalter.class.getResource("/br/com/icon/icon água.png")));
        lblAgua.setBounds(263, 72, 32, 32);
        contentPane.add(lblAgua);

        txtAgua = new JTextField();
        txtAgua.setBounds(301, 82, 57, 20);
        contentPane.add(txtAgua);
        txtAgua.setColumns(10);
        txtAgua.setEditable(false);
        txtAgua.setBorder(null);

        lblBrita = new JLabel();
        lblBrita.setIcon(new ImageIcon(VIEWFactoryHalter.class.getResource("/br/com/icon/icon brita.png")));
        lblBrita.setBounds(86, 125, 32, 32);
        contentPane.add(lblBrita);

        txtBrita = new JTextField();
        txtBrita.setBounds(130, 135, 57, 20);
        contentPane.add(txtBrita);
        txtBrita.setColumns(10);
        txtBrita.setEditable(false);
        txtBrita.setBorder(null);

        lblCola = new JLabel();
        lblCola.setIcon(new ImageIcon(VIEWFactoryHalter.class.getResource("/br/com/icon/icon glue.png")));
        lblCola.setBounds(222, 125, 32, 32);
        contentPane.add(lblCola);

        txtCola = new JTextField();
        txtCola.setBounds(268, 135, 46, 20);
        contentPane.add(txtCola);
        txtCola.setColumns(10);
        txtCola.setEditable(false);
        txtCola.setBorder(null);

        RestrictedTextField validar = new RestrictedTextField(txtPesoHalter);

        JComboBox CboDosagem = new JComboBox();
        CboDosagem.setModel(new DefaultComboBoxModel(new String[]{"", "200 ml", "300 ml", "500 ml", "750 ml", "1000 ml"}));
        CboDosagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    dose.setDoseRecipiente(Float.parseFloat(CboDosagem.getSelectedItem().toString().replace("ml", "")));

                } catch (Exception e2) {
                    System.out.println(e);
                }
            }

        });
        CboDosagem.setBounds(268, 24, 75, 22);
        contentPane.add(CboDosagem);

        JLabel lblKg = new JLabel("Kg");
        lblKg.setFont(new Font("Verdana", Font.BOLD, 11));
        lblKg.setBounds(141, 28, 20, 14);
        contentPane.add(lblKg);

        lblDosagem = new JLabel("Dose (ml)");
        lblDosagem.setFont(new Font("Verdana", Font.BOLD, 11));
        lblDosagem.setBounds(195, 28, 64, 14);
        contentPane.add(lblDosagem);
        validar.setOnlyNums(true);
        validar.setLimit(2);

    }
}
