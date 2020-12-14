package br.lcs.appLocadora.model.negocio;

import br.lcs.appLocadora.modelexception.qtdePortasInvalida;

public class Carro extends Automovel{
	private int qtdePortas;
	private String motor;

	public Carro(int ano, String marca, float valor, boolean manutencao) {
		super(ano, marca, valor , manutencao);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getQtdePortas());
		sb.append(";");
		sb.append(this.getMotor());
		System.out.println(sb.toString());
		return sb.toString();
	}

	@Override
	public float calcularValorAlocacao() {
		float valor = 0;
		
		if (this.getAno() < 2010) {
			valor = 40;
		}else if(this.getAno() > 2015){
			valor = 80;
		}else {
			valor = 60;
		}
		
		int valorPortas = this.getQtdePortas() == 4 ? 60 : 30;
		
		float valorTotal = 300 + valor + valorPortas;
	
		return valorTotal;
	}
	
	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) throws qtdePortasInvalida {
		
		if (qtdePortas <= 0) {
			throw new qtdePortasInvalida("Quandidade de portas invalida");
		}
		
		this.qtdePortas = qtdePortas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

}
