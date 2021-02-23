package com.br.farmacia.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.farmacia.farmacia.model.Categoria;
import com.br.farmacia.farmacia.repository.FarmaciaRepository;


@RestController
@RequestMapping("/Remedio")
@CrossOrigin("*")
public class FarmaciaController {
	
	@Autowired
	private FarmaciaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/remedio/{nome}")
	public ResponseEntity<List<Categoria>> GetByNome (@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria Remedio){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Remedio));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put (@RequestBody Categoria Remedio){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Remedio));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}	
}
