package br.lcs.appLocadora.model.negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Locacao {

	private LocalDateTime data;
	private boolean web;
	private Cliente cliente;

	public Locacao() {
		this.data = LocalDateTime.now();
		this.web = Boolean.TRUE;
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s",
				this.getData().format(formatter),
				this.isWeb(),
				this.cliente.toString());
	}
	
	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}
}
