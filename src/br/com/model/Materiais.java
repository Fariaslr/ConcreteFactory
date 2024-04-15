package br.com.model;

public abstract class Materiais {

	protected float cimento;
	protected float areia;
	protected float brita;
	protected float agua;
	protected float cola;

	public float getCimento() {
		return cimento;
	}

	public void setCimento(float cimento) {
		this.cimento = cimento;
	}

	public float getAreia() {
		return areia;
	}

	public void setAreia(float areia) {
		this.areia = areia;
	}

	public float getBrita() {
		return brita;
	}

	public void setBrita(float brita) {
		this.brita = brita;
	}

	public float getAgua() {
		return agua;
	}

	public void setAgua(float agua) {
		this.agua = agua;
	}

	public float getCola() {
		return cola;
	}

	public void setCola(float cola) {
		this.cola = cola;
	}

}
