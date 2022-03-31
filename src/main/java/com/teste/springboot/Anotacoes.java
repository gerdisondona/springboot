package com.teste.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.springboot.config.SecurityConfig;

/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
*/
/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
*/

//#@RestController
//@RequestMapping("/anotacoes")
/*
@Entity
@Table(name = "tb_anotacoes")
*/
@Service
public class Anotacoes {
	
	@Autowired
	private SecurityConfig security;
//	@JoinColumn
/*	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
*/
	/*
	@Column(name = "ID")
	private Long id;
	*/
/*
	@GetMapping("")
	public String listaAnotacoes() {
		return "Ola";
	}
	
	@PostMapping("")
	public String listaAnotacoes2() {
		return "Ola";
	}
*/
	
}
