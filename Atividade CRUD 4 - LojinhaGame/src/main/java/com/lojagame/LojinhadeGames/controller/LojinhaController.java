package com.lojagame.LojinhadeGames.controller;

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

import com.lojagame.LojinhadeGames.repository.LojinhaRepository;
import com.lojagame.LojinhadeGames.model.*;

@RestController
@RequestMapping("/Lojinha")
@CrossOrigin("*")
public class LojinhaController {
	
	@Autowired
	private LojinhaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/lojinha/{estilo}")
	public ResponseEntity<List<Categoria>> GetByEstilo (@PathVariable String estilo){
		return ResponseEntity.ok(repository.findAllByEstiloContainingIgnoreCase(estilo));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria estilo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(estilo));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put (@RequestBody Categoria estilo){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(estilo));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}	
}
