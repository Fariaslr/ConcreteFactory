package br.com.model;

public class Medida extends Materiais {

    private float pesoHalter;

    public float getPesoHalter() {
        return pesoHalter;
    }

    public void setPesoHalter(float pesoHalter) {
        this.pesoHalter = pesoHalter;
    }

    public void calculaMedidas() {
        this.cimento = pesoHalter * 210;
        this.areia = pesoHalter * 210;
        this.brita = pesoHalter * 420;
        this.agua = pesoHalter * 50;
        this.cola = pesoHalter * 13;
    }

    public void calculaEmLitro() {
        this.cimento = cimento / 1000;
        this.areia = areia / 1000;
        this.brita = brita / 1000;
        this.agua = agua / 1000;
        this.cola = cola / 1000;
    }

}
