package br.com.controller;

import br.com.model.Dosagem;
import static br.com.view.VIEWconcreteFactory.sliderDosagem;

/**
 *
 * @author Lucas
 */
public class Controller {

    int contador = 0;

    public String sufixoMedidas(float medida) {
        if (sliderDosagem.getValue() == 0) {
            return " ml";
        } else {
            if (medida <= 2) {
                return " litro";
            } else {
                return " litros";
            }
        }
    }

    public String sufixoDoses(float dose) {
        if (dose <= 2) {
            return " dose";
        } else {
            return " doses";
        }
    }

    public boolean recomendaDosagem(Dosagem dose) {
        contador++;
        return dose.getBrita() >= 20 && contador % 3 == 0;
    }
}
