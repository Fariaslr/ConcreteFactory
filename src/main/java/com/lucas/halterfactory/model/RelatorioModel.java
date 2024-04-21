package com.lucas.halterfactory.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="relatorios")
@Getter
@Setter
@Data
public class RelatorioModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idRelatorio;
	
	private float dosagem;
	
	private Date criado;
	
	private Date editado;
	
	/*@OneToMany
	@JoinColumn(name="id_halter")
	private List<HalterModel> halteres;*/

	public UUID getIdRelatorio() {
		return idRelatorio;
	}

	public void setIdRelatorio(UUID idRelatorio) {
		this.idRelatorio = idRelatorio;
	}

	public float getDosagem() {
		return dosagem;
	}

	public void setDosagem(float dosagem) {
		this.dosagem = dosagem;
	}

	public Date getCriado() {
		return criado;
	}

	public void setCriado(Date criado) {
		this.criado = criado;
	}

	public Date getEditado() {
		return editado;
	}

	public void setEditado(Date editado) {
		this.editado = editado;
	}
	
}
