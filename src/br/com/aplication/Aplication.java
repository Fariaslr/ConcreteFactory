package br.com.aplication;

import br.com.view.VIEWConcreteFactory;
import br.com.view.VIEWFactoryHalter;


public class Aplication {

    public static void main(String[] args) {
        new VIEWFactoryHalter().setVisible(true);
    }
    
}
