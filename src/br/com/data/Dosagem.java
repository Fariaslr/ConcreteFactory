package br.com.data;

public class Dosagem {

	private float doseRecipiente;
	private float cimento;
	private float areia;
	private float brita;
	private float agua;
	private float cola;
	
	public Dosagem() {
		this.doseRecipiente = 200;
	}

	public float getDoseRecipiente() {
		return doseRecipiente;
	}

	public void setDoseRecipiente(float doseRecipiente) {
		this.doseRecipiente = doseRecipiente;
	}

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

	public void calculaDosagem(Medidas m) {
		this.cimento = (float) m.getCimento() / doseRecipiente;
		this.areia = (float) m.getAreia() / doseRecipiente;
		this.brita = (float) m.getBrita() / doseRecipiente;
		this.agua = (float) m.getAgua() / doseRecipiente;
		this.cola = (float) m.getCola() / doseRecipiente;

	}

	@Override
	public String toString() {
		return "Doses [doseRecipiente=" + doseRecipiente + ", cimento=" + cimento + ", areia=" + areia + ", brita="
				+ brita + ", agua=" + agua + ", cola=" + cola + "]";
	}

}
