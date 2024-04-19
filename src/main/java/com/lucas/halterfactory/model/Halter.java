package com.lucas.halterfactory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="halteres")
@Getter
@Setter
@Data
public class Halter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_halter;
	
	private float peso;
	
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name="id_relatorio")
	@JsonIgnore
	private Relatorio relatorio;

	public Long getId_halter() {
		return id_halter;
	}

	public void setId_halter(Long id_halter) {
		this.id_halter = id_halter;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Relatorio getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}
	
}
