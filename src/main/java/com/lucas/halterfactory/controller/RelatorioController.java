package com.lucas.halterfactory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.halterfactory.model.RelatorioModel;
import com.lucas.halterfactory.repository.RelatorioRepository;

@RestController
@RequestMapping(value = "/relatorio")
public class RelatorioController {
	@Autowired
	RelatorioRepository relatorioRepository;
	
	@GetMapping
	public List<RelatorioModel> getAll(){
		return relatorioRepository.findAll();
	}
}
