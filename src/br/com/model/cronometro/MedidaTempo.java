package br.com.model.cronometro;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class MedidaTempo {

    private int index;
    private int minutos;
    private int segundos;
    private int milesimos;
    private long totalEmMilisegundos;

    public long getTotalEmMilisegundos() {
        return totalEmMilisegundos;
    }

    public void setTotalEmMilisegundos(long totalEmMilisegundos) {
        this.totalEmMilisegundos = totalEmMilisegundos;
    }

    public MedidaTempo() {
        this.index = 1;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMilesimos() {
        return milesimos;
    }

    public void setMilesimos(int milesimos) {
        this.milesimos = milesimos;
    }
    
    public String formataTempo(){
        this.totalEmMilisegundos = (minutos * 60 * 1000) + (segundos * 1000) + milesimos;
        SimpleDateFormat formato = new SimpleDateFormat("mm:ss.SSS");
        return formato.format(new Date(totalEmMilisegundos));
    }
}
