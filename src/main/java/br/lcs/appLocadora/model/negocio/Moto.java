package br.lcs.appLocadora.model.negocio;

import br.lcs.appLocadora.modelexception.TipoNulo;

public class Moto extends Automovel{
	
	private String motor;
	private String tipo;

	public Moto(int ano, String marca, float valor, boolean manutencao) {
		super(ano, marca, valor, manutencao);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getMotor());
		sb.append(";");
		sb.append(this.getTipo());
		
		return sb.toString();
	}

	@Override
	public float calcularValorAlocacao() {
		float valor = 0;
		
		if (this.getAno() < 2010) {
			valor = 20;
		}else if(this.getAno() > 2015){
			valor = 60;
		}else {
			valor = 40;
		}
		
		float valorTotal = 300 + valor;
		
		return valorTotal;
	}
	
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) throws TipoNulo {
		if(tipo == null) {
			throw new TipoNulo("Tipo nao pode ser nulo");
		}
		this.tipo = tipo;
	}
}
