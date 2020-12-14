package br.lcs.appLocadora.model.negocio;

public abstract class Automovel {
	private int ano;
	private String marca;
	private float valor;
	private boolean manutencao;

	public Automovel(int ano, String marca, float valor, boolean manutencao) {
		this.ano = ano;
		this.marca = marca;
		this.valor = valor;
		this.manutencao = manutencao;
	}
	
	public abstract float calcularValorAlocacao();
	
	public String obterValorLocacao() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getMarca());
		sb.append(";");
		sb.append(this.calcularValorAlocacao());
		sb.append("\r");
		System.out.println(sb.toString());
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getAno());
		sb.append(";");
		sb.append(this.getMarca());
		sb.append(";");
		sb.append(this.getValor());
		sb.append(";");
		sb.append(this.isManutencao());
		
		return sb.toString();
	}
	 

	public int getAno() {
		return ano;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public float getValor() {
		return valor;
	}
	
	public boolean isManutencao() {
		return manutencao;
	}
}
