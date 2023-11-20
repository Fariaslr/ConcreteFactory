package br.com.controller;

import javax.swing.JSpinner;

/**
 *
 * @author Lucas
 */
public class Controller {

    public boolean validaSpinners(JSpinner spinnerHoras, JSpinner spinnerMinutos, JSpinner spinnerSegundos) {
        return spinnerHoras.getValue().equals(0) && spinnerMinutos.getValue().equals(0) && spinnerSegundos.getValue().equals(0);
    }

}
