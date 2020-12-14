package br.lcs.appLocadora.model.negocio;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private String cnh;
	

	public Cliente(String nome, String cpf, String email, String cnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.cnh = cnh;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getCpf());
		sb.append(";");
		sb.append(this.getEmail());
		sb.append(";");
		sb.append(this.getCnh());
		
		return sb.toString();
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCnh() {
		return cnh;
	}


}
