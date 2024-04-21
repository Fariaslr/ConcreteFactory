package com.lucas.halterfactory.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lucas.halterfactory.model.HalterModel;
import com.lucas.halterfactory.record.HalterRecordDto;
import com.lucas.halterfactory.repository.HalterRepository;
import jakarta.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;;


@RestController
public class HalterController {
	
	@Autowired
	HalterRepository halterRepository;
	
	@PostMapping("/halteres")
	public ResponseEntity<HalterModel> saveHalteres (@RequestBody @Valid HalterRecordDto halterRecordDto){
		var halterModel = new HalterModel();
		BeanUtils.copyProperties(halterRecordDto, halterModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(halterRepository.save(halterModel));
	}
	
	@GetMapping("/halteres")
	public ResponseEntity<List<HalterModel>> getAllHalteres (){
		List<HalterModel> halteresList = halterRepository.findAll();
		if(!halteresList.isEmpty()) {
			for(HalterModel halter : halteresList) {
				UUID id = halter.getIdHalter();
				halter.add(linkTo(methodOn(HalterController.class).getOneHalter(id)).withSelfRel());
			}
		}
		return ResponseEntity.status(HttpStatus.OK).body(halteresList);
	}
	
	@GetMapping("/halteres/{id}")
	public ResponseEntity<Object> getOneHalter (@PathVariable(value="id")UUID id){
		Optional<HalterModel> halter0 = halterRepository.findById(id);
		if(halter0.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Halter not found");
		}
		halter0.get().add(linkTo(methodOn(HalterController.class).getAllHalteres()).withRel("Todos Halteres"));
		return ResponseEntity.status(HttpStatus.OK).body(halter0.get());
	}
	
	@PutMapping("/halteres/{id}")
	public ResponseEntity<Object> updateHalter (@PathVariable(value="id") UUID id, @RequestBody @Valid HalterRecordDto halterRecordDto){
		Optional<HalterModel> halter0 = halterRepository.findById(id);
		if(halter0.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Halter not found");
		}
		var halterModel = halter0.get();
		BeanUtils.copyProperties(halterRecordDto, halterModel);
		return ResponseEntity.status(HttpStatus.OK).body(halterRepository.save(halterModel));
	}
	
	@DeleteMapping("/halteres/{id}")
	public ResponseEntity<Object> deleteHalter (@PathVariable(value="id") UUID id){
		Optional<HalterModel> halter0 = halterRepository.findById(id);
		if(halter0.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Halter not found");
		}
		halterRepository.delete(halter0.get());
		return ResponseEntity.status(HttpStatus.OK).body("Halter deleted sucessfully");
	}
	
}
