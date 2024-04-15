package br.com.model;

public class Dosagem extends Materiais {

	private float doseRecipiente;

	public float getDoseRecipiente() {
		return doseRecipiente;
	}

	public void setDoseRecipiente(float doseRecipiente) {
		this.doseRecipiente = doseRecipiente;
	}

	public void calculaDosagem(Medida m) {
		this.cimento = m.getCimento() / doseRecipiente;
		this.areia =  m.getAreia() / doseRecipiente;
		this.brita = m.getBrita() / doseRecipiente;
		this.agua = m.getAgua() / doseRecipiente;
		this.cola = m.getCola() / doseRecipiente;

	}

}
