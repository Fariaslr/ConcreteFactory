package br.com.view;

import br.com.controller.Controller;
import br.com.model.temporizador.Temporizador;
import br.com.model.cronometro.MedidaTempo;
import br.com.model.cronometro.Milesimos;
import br.com.model.cronometro.Minutos;
import br.com.model.cronometro.Segundos;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DefaultFormatter;

/**
 *
 * @author aluno
 */
public class VIEWtemporizador extends javax.swing.JFrame {

    Segundos segundo;
    Minutos minuto;
    Milesimos milesimo;
    Thread tMin, tSeg, tMil, tTempo;
    Temporizador temporizador;
    MedidaTempo tempo;
    Controller controller;
    Font DsDigital = null;

    public VIEWtemporizador() throws Exception {
        initComponents();
        initFont();
        setFonts();
        formattedSpinner(spinnerHoras);
        formattedSpinner(spinnerMinutos);
        formattedSpinner(spinnerSegundos);

        controller = new Controller();

        minuto = new Minutos();
        tMin = new Thread(minuto);

        segundo = new Segundos();
        tSeg = new Thread(segundo);

        milesimo = new Milesimos();
        tMil = new Thread(milesimo);

        tempo = new MedidaTempo();

        temporizador = new Temporizador();
        tTempo = new Thread(temporizador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedTemporizador = new javax.swing.JTabbedPane();
        panelTemporizador = new javax.swing.JPanel();
        spinnerHoras = new javax.swing.JSpinner();
        spinnerMinutos = new javax.swing.JSpinner();
        spinnerSegundos = new javax.swing.JSpinner();
        btnIniciarTemporizador = new javax.swing.JButton();
        lblHora = new javax.swing.JLabel();
        lblMinuto = new javax.swing.JLabel();
        lblSegundo = new javax.swing.JLabel();
        panelCronometro = new javax.swing.JPanel();
        txtMinutos = new javax.swing.JTextField();
        txtSegundos = new javax.swing.JTextField();
        txtMilisegundos = new javax.swing.JTextField();
        btnRedefinir = new javax.swing.JButton();
        btnIniciarCronometro = new javax.swing.JButton();
        btnVolta = new javax.swing.JButton();
        ScrollTable = new javax.swing.JScrollPane();
        tableCronometro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        spinnerHoras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spinnerHoras.setBorder(null);

        spinnerMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spinnerMinutos.setBorder(null);

        spinnerSegundos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spinnerSegundos.setToolTipText("");
        spinnerSegundos.setBorder(null);

        btnIniciarTemporizador.setText("INICIAR");
        btnIniciarTemporizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarTemporizadorMouseClicked(evt);
            }
        });
        btnIniciarTemporizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarTemporizadorActionPerformed(evt);
            }
        });

        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Horas");

        lblMinuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinuto.setText("Minutos");

        lblSegundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSegundo.setText("Segundos");

        javax.swing.GroupLayout panelTemporizadorLayout = new javax.swing.GroupLayout(panelTemporizador);
        panelTemporizador.setLayout(panelTemporizadorLayout);
        panelTemporizadorLayout.setHorizontalGroup(
            panelTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTemporizadorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIniciarTemporizador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMinuto, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(spinnerMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        panelTemporizadorLayout.setVerticalGroup(
            panelTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTemporizadorLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(panelTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(lblMinuto)
                    .addComponent(lblSegundo))
                .addGap(47, 47, 47)
                .addComponent(btnIniciarTemporizador)
                .addGap(39, 39, 39))
        );

        tabbedTemporizador.addTab("Temporizador", panelTemporizador);

        txtMinutos.setEditable(false);
        txtMinutos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtMinutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinutos.setText("0");
        txtMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutosActionPerformed(evt);
            }
        });

        txtSegundos.setEditable(false);
        txtSegundos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSegundos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSegundos.setText("0");

        txtMilisegundos.setEditable(false);
        txtMilisegundos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtMilisegundos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMilisegundos.setText("0");

        btnRedefinir.setText("Redefinir");
        btnRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedefinirActionPerformed(evt);
            }
        });

        btnIniciarCronometro.setText("Iniciar");
        btnIniciarCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarCronometroActionPerformed(evt);
            }
        });

        btnVolta.setText("Volta");
        btnVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaActionPerformed(evt);
            }
        });

        tableCronometro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Volta", "Tempo", "Duração Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollTable.setViewportView(tableCronometro);

        javax.swing.GroupLayout panelCronometroLayout = new javax.swing.GroupLayout(panelCronometro);
        panelCronometro.setLayout(panelCronometroLayout);
        panelCronometroLayout.setHorizontalGroup(
            panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCronometroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCronometroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCronometroLayout.createSequentialGroup()
                        .addComponent(btnRedefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciarCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCronometroLayout.createSequentialGroup()
                        .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMilisegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        panelCronometroLayout.setVerticalGroup(
            panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCronometroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMilisegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRedefinir)
                    .addComponent(btnIniciarCronometro)
                    .addComponent(btnVolta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedTemporizador.addTab("Cronometro", panelCronometro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedTemporizador, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedTemporizador)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarTemporizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarTemporizadorMouseClicked

    }//GEN-LAST:event_btnIniciarTemporizadorMouseClicked

    private void txtMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutosActionPerformed

    private void btnIniciarCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarCronometroActionPerformed
        if (!tMin.isAlive()) {
            tMin.start();
        } else {
            minuto.resume();
        }
        if (!tSeg.isAlive()) {
            tSeg.start();
        } else {
            segundo.resume();
        }
        if (!tMil.isAlive()) {
            tMil.start();
        } else {
            milesimo.resume();
        }
    }//GEN-LAST:event_btnIniciarCronometroActionPerformed

    private void btnVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) tableCronometro.getModel();
        tableCronometro.setRowSorter(new TableRowSorter(tabela));

        tempo.setMinutos(Integer.parseInt(txtMinutos.getText()));
        tempo.setSegundos(Integer.parseInt(txtSegundos.getText()));
        tempo.setMilesimos(Integer.parseInt(txtMilisegundos.getText()));

        if (tempo.getIndex() == 1) {
            tabela.setNumRows(0);
            tabela.addRow(new Object[]{
                tempo.getIndex(),
                tempo.formataTempo(),
                tempo.formataTempo()
            });
        } else {
            try {
                tabela.addRow(new Object[]{
                    tempo.getIndex(),
                    verificarTempoVolta((String) tabela.getValueAt(tabela.getRowCount() - 1, 2), tempo),
                    tempo.formataTempo()
                });
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(VIEWtemporizador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tempo.setIndex(tempo.getIndex() + 1);
    }//GEN-LAST:event_btnVoltaActionPerformed

    private void btnRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedefinirActionPerformed
        try {
            minuto.suspend();
            segundo.suspend();
            milesimo.suspend();
            txtMilisegundos.setText("0");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro " + e);
        }
    }//GEN-LAST:event_btnRedefinirActionPerformed

    private void btnIniciarTemporizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarTemporizadorActionPerformed
        if (controller.validaSpinners(spinnerHoras, spinnerMinutos, spinnerSegundos)) {
            JOptionPane.showMessageDialog(this, "Temporizador vazio", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            temporizador.setHoras(Integer.parseInt(spinnerHoras.getValue().toString()));
            temporizador.setMinutos(Integer.parseInt(spinnerMinutos.getValue().toString()));
            temporizador.setSegundos(Integer.parseInt(spinnerSegundos.getValue().toString()));
            temporizador.calcularSegundosTotais();
            if (!tTempo.isAlive()) {
                tTempo.start();
            } else {
            }
        }


    }//GEN-LAST:event_btnIniciarTemporizadorActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEWtemporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new VIEWtemporizador().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(VIEWtemporizador.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollTable;
    private javax.swing.JButton btnIniciarCronometro;
    private javax.swing.JButton btnIniciarTemporizador;
    private javax.swing.JButton btnRedefinir;
    private javax.swing.JButton btnVolta;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMinuto;
    private javax.swing.JLabel lblSegundo;
    private javax.swing.JPanel panelCronometro;
    private javax.swing.JPanel panelTemporizador;
    public static javax.swing.JSpinner spinnerHoras;
    public static javax.swing.JSpinner spinnerMinutos;
    public static javax.swing.JSpinner spinnerSegundos;
    private javax.swing.JTabbedPane tabbedTemporizador;
    private javax.swing.JTable tableCronometro;
    public static javax.swing.JTextField txtMilisegundos;
    public static javax.swing.JTextField txtMinutos;
    public static javax.swing.JTextField txtSegundos;
    // End of variables declaration//GEN-END:variables

    private void formattedSpinner(JSpinner spinner) {
        JSpinner.DefaultEditor editor = (JSpinner.NumberEditor) spinner.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) editor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);
    }

    private Object verificarTempoVolta(String voltaAnterior, MedidaTempo tempo) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("mm:ss.SSS");
        Date DataVoltaAtual = formato.parse(tempo.formataTempo());
        Date DataVoltaAnterior = formato.parse(voltaAnterior);

        return formato.format(DataVoltaAtual.getTime() - DataVoltaAnterior.getTime());
    }

    private void initFont() throws Exception {
        String fontFileName = "/br/com/font/dsdigit.ttf";
        InputStream is = this.getClass().getResourceAsStream(fontFileName);
        
        Font ttfBase = Font.createFont(Font.TRUETYPE_FONT, is);
        DsDigital = ttfBase.deriveFont(Font.PLAIN, 24);
    }

    private void setFonts() {
        fontJTextField(txtMilisegundos);
        fontJTextField(txtMinutos);
        fontJTextField(txtSegundos);        
    }
    
    private void fontJTextField(JTextField textField){
        textField.setFont(DsDigital);
    }
}
