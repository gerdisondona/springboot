package com.teste.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-pessoa")//caminho
public class Test {
	
	//get, post, 
	//@GetMapping("")
	//public String textHelloWorld() {
	//	return "Hello World";
	//}
	
	//@GetMapping("/soma")
	//public int soma(@RequestParam int n1,@RequestParam int n2) {
	/*
	@GetMapping("/soma/{msg}")
	public String soma(@PathVariable String msg) {
		return msg;
	}
	*/
	@GetMapping("")
	public ResponseEntity<Pessoas> listaPessoas(){
		Pessoas p = new Pessoas("Andre", "São Paulo", "25/12/1995");
		return new ResponseEntity<>(p, HttpStatus.OK);
	}
	
	

}
