package com.lucas.halterfactory.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="relatorios")
@Getter
@Setter
public class Relatorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_relatorio;
	
	private float dosagem;
	
	private Date criado;
	
	private Date editado;

	@OneToMany
	@JoinColumn(name="id_halter")
	private List<Halter> halteres;

	public Long getId_relatorio() {
		return id_relatorio;
	}

	public void setId_relatorio(Long id_relatorio) {
		this.id_relatorio = id_relatorio;
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

	public List<Halter> getHalteres() {
		return halteres;
	}

	public void setHalteres(List<Halter> halteres) {
		this.halteres = halteres;
	}
	
	
}
