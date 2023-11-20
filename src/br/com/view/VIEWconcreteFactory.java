package br.com.view;

import Atxy2k.CustomTextField.RestrictedTextField;
import br.com.aplication.BordaCantoArredondado;
import br.com.controller.Controller;
import br.com.model.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Lucas
 */
public class VIEWconcreteFactory extends javax.swing.JFrame {

    Medida medida;
    Dosagem dose;
    Controller controller;
    Font fontJOptionPane;
    Icon iconInfo;
    Icon iconAlert;

    public VIEWconcreteFactory() {
        initComponents();
        initPanel();
        initIcons();
        initTextFieldMedidas();
        initTextFieldDosagens();

        fontJOptionPane = new Font("Tahoma", Font.PLAIN, 12);
        medida = new Medida();
        dose = new Dosagem();
        controller = new Controller();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        panelHalterPeso = new javax.swing.JPanel();
        labelPesoHalter = new javax.swing.JLabel();
        txtPesoHalter = new javax.swing.JTextField();
        lblKg = new javax.swing.JLabel();
        lblDosagem = new javax.swing.JLabel();
        cboDosagem = new javax.swing.JComboBox<>();
        panelBrita = new javax.swing.JPanel();
        lblIconBrita = new javax.swing.JLabel();
        lblBrita = new javax.swing.JLabel();
        txtMedidaBrita = new javax.swing.JTextField();
        txtDosagemBrita = new javax.swing.JTextField();
        panelCimento = new javax.swing.JPanel();
        lblIconCimento = new javax.swing.JLabel();
        lblCimento = new javax.swing.JLabel();
        txtMedidaCimento = new javax.swing.JTextField();
        txtDosagemCimento = new javax.swing.JTextField();
        panelAreia = new javax.swing.JPanel();
        lblIconAreia = new javax.swing.JLabel();
        lblAreia = new javax.swing.JLabel();
        txtMedidaAreia = new javax.swing.JTextField();
        txtDosagemAreia = new javax.swing.JTextField();
        panelAgua = new javax.swing.JPanel();
        lblIconAgua = new javax.swing.JLabel();
        lblAgua = new javax.swing.JLabel();
        txtMedidaAgua = new javax.swing.JTextField();
        txtDosagemAgua = new javax.swing.JTextField();
        panelCola = new javax.swing.JPanel();
        lblIconAgua1 = new javax.swing.JLabel();
        lblCola = new javax.swing.JLabel();
        txtMedidaCola = new javax.swing.JTextField();
        txtDosagemCola = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        sliderDosagem = new javax.swing.JSlider();
        lblLitro = new javax.swing.JLabel();
        lblMl = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fábrica de concreto");
        setResizable(false);

        panelHalterPeso.setBackground(new java.awt.Color(192, 192, 192));

        labelPesoHalter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPesoHalter.setText("Halter");

        txtPesoHalter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPesoHalter.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblKg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblKg.setText("Kg");

        lblDosagem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDosagem.setText("Dosagem");

        cboDosagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboDosagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "100 ml", "200 ml", "300 ml", "500 ml", "750 ml", "1000 ml", "1500 ml" }));
        cboDosagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelHalterPesoLayout = new javax.swing.GroupLayout(panelHalterPeso);
        panelHalterPeso.setLayout(panelHalterPesoLayout);
        panelHalterPesoLayout.setHorizontalGroup(
            panelHalterPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHalterPesoLayout.createSequentialGroup()
                .addGroup(panelHalterPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHalterPesoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(labelPesoHalter))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHalterPesoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDosagem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHalterPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHalterPesoLayout.createSequentialGroup()
                        .addComponent(txtPesoHalter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKg))
                    .addComponent(cboDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelHalterPesoLayout.setVerticalGroup(
            panelHalterPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHalterPesoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelHalterPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesoHalter)
                    .addComponent(txtPesoHalter, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHalterPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDosagem)
                    .addComponent(cboDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelBrita.setBackground(new java.awt.Color(204, 204, 204));
        panelBrita.setLayout(null);

        lblIconBrita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconBrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Brita.png"))); // NOI18N
        panelBrita.add(lblIconBrita);
        lblIconBrita.setBounds(10, 10, 40, 32);

        lblBrita.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        lblBrita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrita.setText("Brita");
        lblBrita.setToolTipText("");
        lblBrita.setMaximumSize(new java.awt.Dimension(32, 32));
        lblBrita.setMinimumSize(new java.awt.Dimension(32, 32));
        lblBrita.setPreferredSize(new java.awt.Dimension(32, 32));
        panelBrita.add(lblBrita);
        lblBrita.setBounds(10, 40, 40, 16);

        txtMedidaBrita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMedidaBrita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelBrita.add(txtMedidaBrita);
        txtMedidaBrita.setBounds(110, 10, 110, 21);

        txtDosagemBrita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDosagemBrita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelBrita.add(txtDosagemBrita);
        txtDosagemBrita.setBounds(110, 30, 110, 21);

        panelCimento.setBackground(new java.awt.Color(204, 204, 204));
        panelCimento.setLayout(null);

        lblIconCimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconCimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Cimento.png"))); // NOI18N
        panelCimento.add(lblIconCimento);
        lblIconCimento.setBounds(10, 10, 40, 32);

        lblCimento.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        lblCimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCimento.setText("Cimento");
        lblCimento.setToolTipText("");
        lblCimento.setMaximumSize(new java.awt.Dimension(32, 32));
        lblCimento.setMinimumSize(new java.awt.Dimension(32, 32));
        lblCimento.setPreferredSize(new java.awt.Dimension(32, 32));
        panelCimento.add(lblCimento);
        lblCimento.setBounds(5, 40, 50, 16);

        txtMedidaCimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMedidaCimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCimento.add(txtMedidaCimento);
        txtMedidaCimento.setBounds(110, 10, 110, 21);

        txtDosagemCimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDosagemCimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCimento.add(txtDosagemCimento);
        txtDosagemCimento.setBounds(110, 30, 110, 21);

        panelAreia.setBackground(new java.awt.Color(204, 204, 204));
        panelAreia.setLayout(null);

        lblIconAreia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconAreia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Areia.png"))); // NOI18N
        panelAreia.add(lblIconAreia);
        lblIconAreia.setBounds(10, 10, 40, 32);

        lblAreia.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        lblAreia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAreia.setText("Areia");
        lblAreia.setToolTipText("");
        lblAreia.setMaximumSize(new java.awt.Dimension(32, 32));
        lblAreia.setMinimumSize(new java.awt.Dimension(32, 32));
        lblAreia.setPreferredSize(new java.awt.Dimension(32, 32));
        panelAreia.add(lblAreia);
        lblAreia.setBounds(5, 40, 50, 16);

        txtMedidaAreia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMedidaAreia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelAreia.add(txtMedidaAreia);
        txtMedidaAreia.setBounds(110, 10, 110, 21);

        txtDosagemAreia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDosagemAreia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelAreia.add(txtDosagemAreia);
        txtDosagemAreia.setBounds(110, 30, 110, 21);

        panelAgua.setBackground(new java.awt.Color(204, 204, 204));
        panelAgua.setLayout(null);

        lblIconAgua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Água.png"))); // NOI18N
        panelAgua.add(lblIconAgua);
        lblIconAgua.setBounds(10, 10, 40, 32);

        lblAgua.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        lblAgua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgua.setText("Água");
        lblAgua.setToolTipText("");
        lblAgua.setMaximumSize(new java.awt.Dimension(32, 32));
        lblAgua.setMinimumSize(new java.awt.Dimension(32, 32));
        lblAgua.setPreferredSize(new java.awt.Dimension(32, 32));
        panelAgua.add(lblAgua);
        lblAgua.setBounds(5, 40, 50, 16);

        txtMedidaAgua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMedidaAgua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelAgua.add(txtMedidaAgua);
        txtMedidaAgua.setBounds(110, 10, 110, 20);

        txtDosagemAgua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDosagemAgua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelAgua.add(txtDosagemAgua);
        txtDosagemAgua.setBounds(110, 30, 110, 21);

        panelCola.setBackground(new java.awt.Color(204, 204, 204));
        panelCola.setLayout(null);

        lblIconAgua1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconAgua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Glue.png"))); // NOI18N
        panelCola.add(lblIconAgua1);
        lblIconAgua1.setBounds(10, 10, 40, 32);

        lblCola.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        lblCola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCola.setText("Água");
        lblCola.setToolTipText("");
        lblCola.setMaximumSize(new java.awt.Dimension(32, 32));
        lblCola.setMinimumSize(new java.awt.Dimension(32, 32));
        lblCola.setPreferredSize(new java.awt.Dimension(32, 32));
        panelCola.add(lblCola);
        lblCola.setBounds(5, 40, 50, 16);

        txtMedidaCola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMedidaCola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCola.add(txtMedidaCola);
        txtMedidaCola.setBounds(110, 10, 110, 21);

        txtDosagemCola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDosagemCola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCola.add(txtDosagemCola);
        txtDosagemCola.setBounds(110, 30, 110, 21);

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        sliderDosagem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sliderDosagem.setMaximum(1);
        sliderDosagem.setValue(0);
        sliderDosagem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderDosagemStateChanged(evt);
            }
        });

        lblLitro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLitro.setText("litro");
        lblLitro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLitroMouseClicked(evt);
            }
        });

        lblMl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMl.setText("ml");
        lblMl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelHalterPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBrita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelAreia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLitro)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelHalterPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliderDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLitro)
                    .addComponent(lblMl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBrita, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCimento, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAreia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCola, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtPesoHalter.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Insira o peso do halter", "Campo de texto vazio", JOptionPane.PLAIN_MESSAGE, iconAlert);
        } else if (cboDosagem.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Escolha uma dosagem", "Dosagem vazia", JOptionPane.PLAIN_MESSAGE, iconAlert);
        } else {
            entradaDados();
            processamentoDados();
            saidaDados();
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void sliderDosagemStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderDosagemStateChanged

    }//GEN-LAST:event_sliderDosagemStateChanged

    private void lblMlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMlMouseClicked
        if (sliderDosagem.getValue() == 0) {
            sliderDosagem.setValue(1);
        } else {
            sliderDosagem.setValue(0);
        }
    }//GEN-LAST:event_lblMlMouseClicked

    private void lblLitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLitroMouseClicked
        if (sliderDosagem.getValue() == 1) {
            sliderDosagem.setValue(0);
        } else {
            sliderDosagem.setValue(1);
        }
    }//GEN-LAST:event_lblLitroMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEWconcreteFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new VIEWconcreteFactory().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    public static javax.swing.JComboBox<String> cboDosagem;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel labelPesoHalter;
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblAreia;
    private javax.swing.JLabel lblBrita;
    private javax.swing.JLabel lblCimento;
    private javax.swing.JLabel lblCola;
    private javax.swing.JLabel lblDosagem;
    private javax.swing.JLabel lblIconAgua;
    private javax.swing.JLabel lblIconAgua1;
    private javax.swing.JLabel lblIconAreia;
    private javax.swing.JLabel lblIconBrita;
    private javax.swing.JLabel lblIconCimento;
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblLitro;
    private javax.swing.JLabel lblMl;
    private javax.swing.JPanel panelAgua;
    private javax.swing.JPanel panelAreia;
    private javax.swing.JPanel panelBrita;
    private javax.swing.JPanel panelCimento;
    private javax.swing.JPanel panelCola;
    private javax.swing.JPanel panelHalterPeso;
    public static javax.swing.JSlider sliderDosagem;
    private javax.swing.JTextField txtDosagemAgua;
    private javax.swing.JTextField txtDosagemAreia;
    private javax.swing.JTextField txtDosagemBrita;
    private javax.swing.JTextField txtDosagemCimento;
    private javax.swing.JTextField txtDosagemCola;
    private javax.swing.JTextField txtMedidaAgua;
    private javax.swing.JTextField txtMedidaAreia;
    private javax.swing.JTextField txtMedidaBrita;
    private javax.swing.JTextField txtMedidaCimento;
    private javax.swing.JTextField txtMedidaCola;
    private javax.swing.JTextField txtPesoHalter;
    // End of variables declaration//GEN-END:variables

    private void initIcons() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(VIEWconcreteFactory.class.getResource("/br/com/image/Halter.png")));
        iconInfo = new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/br/com/image/Info.png")));
        iconAlert = new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("/br/com/image/Alert.png")));
    }

    private void initPanel() {
        roundPanelEdges(panelHalterPeso);
        roundPanelEdges(panelBrita);
        roundPanelEdges(panelCimento);
        roundPanelEdges(panelAreia);
        roundPanelEdges(panelAgua);
        roundPanelEdges(panelCola);
    }

    private void roundPanelEdges(JPanel panel) {
        panel.setBorder(new BordaCantoArredondado());
    }

    private void initTextFieldMedidas() {
        adjustTxtPesoHalter(txtPesoHalter);

        adjustTextField(txtMedidaBrita);
        adjustTextField(txtMedidaCimento);
        adjustTextField(txtMedidaAreia);
        adjustTextField(txtMedidaAgua);
        adjustTextField(txtMedidaCola);
    }

    private void adjustTextField(JTextField textField) {
        textField.setEditable(false);
        textField.setBackground(null);
        textField.setBorder(null);
    }

    private void adjustTxtPesoHalter(JTextField txtPeso) {
        RestrictedTextField valida = new RestrictedTextField(txtPesoHalter);
        valida.setLimit(2);
        valida.setOnlyNums(true);
        txtPeso.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        txtPeso.setBackground(null);
    }

    private void initTextFieldDosagens() {
        adjustTextField(txtDosagemBrita);
        adjustTextField(txtDosagemCimento);
        adjustTextField(txtDosagemAreia);
        adjustTextField(txtDosagemAgua);
        adjustTextField(txtDosagemCola);
    }

    private void entradaDados() {
        medida.setPesoHalter(Float.parseFloat(txtPesoHalter.getText()));
        dose.setDoseRecipiente(Float.parseFloat(cboDosagem.getSelectedItem().toString().replace("ml", "")));
    }

    private void processamentoDados() {
        medida.calculaMedidas();
        dose.calculaDosagem(medida);
        if (sliderDosagem.getValue() == 1) {
            medida.calculaEmLitro();
        }
        if (controller.recomendaDosagem(dose)) {
            JOptionPane.showMessageDialog(this, "Aumente a dosagem", "Recomendação", JOptionPane.PLAIN_MESSAGE, iconInfo);
        }
    }

    private void saidaDados() {
        txtMedidaBrita.setText(String.format("%.0f", medida.getBrita()).concat(controller.sufixoMedidas(medida.getBrita())));
        txtMedidaCimento.setText(String.format("%.0f", medida.getCimento()).concat(controller.sufixoMedidas(medida.getCimento())));
        txtMedidaAreia.setText(String.format("%.0f", medida.getAreia()).concat(controller.sufixoMedidas(medida.getAreia())));
        txtMedidaAgua.setText(String.format("%.1f", medida.getAgua()).concat(controller.sufixoMedidas(medida.getAgua())));
        txtMedidaCola.setText(String.format("%.2f", medida.getCola()).concat(controller.sufixoMedidas(medida.getCola())));

        txtDosagemBrita.setText(String.format("%.0f", dose.getBrita()).concat(controller.sufixoDoses(dose.getBrita())));
        txtDosagemCimento.setText(String.format("%.0f", dose.getCimento()).concat(controller.sufixoDoses(dose.getCimento())));
        txtDosagemAreia.setText(String.format("%.0f", dose.getAreia()).concat(controller.sufixoDoses(dose.getAreia())));
        txtDosagemAgua.setText(String.format("%.1f", dose.getAgua()).concat(controller.sufixoDoses(dose.getAgua())));
        txtDosagemCola.setText(String.format("%.2f", dose.getCola()).concat(controller.sufixoDoses(dose.getCola())));

    }
}
