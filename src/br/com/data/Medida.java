package br.com.data;

public class Medida {

	private int pesoHalter;
	private int cimento;
	private int areia;
	private int brita;
	private int agua;
	private int cola;

	public int getPesoHalter() {
		return pesoHalter;
	}

	public void setPesoHalter(int pesoHalter) {
		this.pesoHalter = pesoHalter;
	}

	public int getCimento() {
		return cimento;
	}

	public void setCimento(int cimento) {
		this.cimento = cimento;
	}

	public int getAreia() {
		return areia;
	}

	public void setAreia(int areia) {
		this.areia = areia;
	}

	public int getBrita() {
		return brita;
	}

	public void setBrita(int brita) {
		this.brita = brita;
	}

	public int getAgua() {
		return agua;
	}

	public void setAgua(int agua) {
		this.agua = agua;
	}

	public int getCola() {
		return cola;
	}

	public void setCola(int cola) {
		this.cola = cola;
	}

	public void calculaMedidas() {
		this.cimento = pesoHalter * 210;
		this.areia = pesoHalter * 210;
		this.brita = pesoHalter * 420;
		this.agua = pesoHalter * 50;
		this.cola = pesoHalter * 13;
	}      
        
}
