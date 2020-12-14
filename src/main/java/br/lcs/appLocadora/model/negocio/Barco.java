package br.lcs.appLocadora.model.negocio;

import br.lcs.appLocadora.modelexception.qtdePessoasInvalido;

public class Barco extends Automovel{
	private int qtdePessoas;
	private String tipo;
	private boolean seguro;

	public Barco(int ano, String marca, float valor, boolean manutencao) {
		super(ano, marca, valor, manutencao);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getQtdePessoas());
		sb.append(";");
		sb.append(this.getTipo());
		sb.append(";");
		sb.append(this.isManutencao());
		
		return sb.toString();
	}

	@Override
	public float calcularValorAlocacao() {
		float valor = 0;
		
		if (this.getAno() < 2012) {
			valor = 50;
		}else if(this.getAno() > 2018){
			valor = 100;
		}else {
			valor = 70;
		}
		
		int valorPortas = this.getQtdePessoas() > 5 ? 100 : 50;
		
		int manutencaoSim = this.isManutencao() ? 20 : 40;
		
		float valorTotal = 400 + valor + valorPortas + manutencaoSim;
	
		return valorTotal;
	}

	public int getQtdePessoas() {
		return qtdePessoas;
	}

	public void setQtdePessoas(int qtdePessoas) throws qtdePessoasInvalido {
		if (qtdePessoas <= 0 || qtdePessoas >= 100) {
			throw new qtdePessoasInvalido("O numero de pessoas nao pode ser maior que 100 e nem menor que 0");
		}
		this.qtdePessoas = qtdePessoas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean manutencao) {
		this.seguro = manutencao;
	}

	
	
}
