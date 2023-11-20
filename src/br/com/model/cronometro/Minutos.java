package br.com.model.cronometro;

import br.com.view.VIEWtemporizador;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Minutos implements Runnable {

    private boolean estaSuspensa;
    private boolean foiTerminada;

    public boolean isEstaSuspensa() {
        return estaSuspensa;
    }

    public void setEstaSuspensa(boolean estaSuspensa) {
        this.estaSuspensa = estaSuspensa;
    }

    public Minutos() {
        this.estaSuspensa = false;
        this.foiTerminada = false;
    }

    @Override
    public void run() {
        try {
            int i = Integer.parseInt(VIEWtemporizador.txtMinutos.getText());
            for (;;) {
                VIEWtemporizador.txtMinutos.setText(i + "");
                i++;
                if (i == 59) {
                    i = 0;
                }
                Thread.sleep(60000);
                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (this.foiTerminada) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }

    public void suspend() {
        this.estaSuspensa = true;
    }

    public synchronized void resume() {
        this.estaSuspensa = false;
        notify();
    }

    public synchronized void stop() {
        this.foiTerminada = true;
        notify();
    }
}
