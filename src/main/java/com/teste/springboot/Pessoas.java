package com.teste.springboot;

public class Pessoas {
	private String nome;
	private String endereco;
	private String dn;
	
	public Pessoas(String nome, String endereco, String dn) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dn = dn;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
}
