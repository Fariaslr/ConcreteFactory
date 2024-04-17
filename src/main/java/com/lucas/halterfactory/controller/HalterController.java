package com.lucas.halterfactory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.halterfactory.model.Halter;
import com.lucas.halterfactory.repository.HalterRepository;

@RestController
@RequestMapping(value="/halter")
public class HalterController {
	@Autowired
	HalterRepository halterRepository;
	
	@GetMapping
	public List<Halter> getAll (){
		return halterRepository.findAll();
	}
}
