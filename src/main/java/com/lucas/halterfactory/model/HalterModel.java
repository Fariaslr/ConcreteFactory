package com.lucas.halterfactory.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

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
public class HalterModel extends RepresentationModel<HalterModel> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idHalter;
	
	private float peso;
	
	private int quantidade;
	
	/*@ManyToOne
	@JoinColumn(name="id_relatorio")
	@JsonIgnore
	private RelatorioModel relatorio;*/
	
	
	public float getPeso() {
		return peso;
	}

	public UUID getIdHalter() {
		return idHalter;
	}

	public void setIdHalter(UUID idHalter) {
		this.idHalter = idHalter;
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
	
}
