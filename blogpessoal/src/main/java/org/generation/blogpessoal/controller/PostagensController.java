package org.generation.blogpessoal.controller;

import java.util.List;
import org.generation.blogpessoal.repository.PostagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import org.generation.blogpessoal.model.Postagem;

 
@RestController
@RequestMapping ("/postagens")
@CrossOrigin ("*")
public class PostagensController {
 
	@Autowired
	private PostagensRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll (){
		
		return ResponseEntity.ok(repository.findAll());
		
		
	}
 
}
