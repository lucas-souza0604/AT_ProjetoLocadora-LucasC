package br.lcs.appLocadora.model.leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.lcs.appLocadora.model.negocio.Barco;
import br.lcs.appLocadora.model.negocio.Carro;
import br.lcs.appLocadora.model.negocio.Moto;
import br.lcs.appLocadora.modelexception.TipoNulo;
import br.lcs.appLocadora.modelexception.qtdePessoasInvalido;
import br.lcs.appLocadora.modelexception.qtdePortasInvalida;


public class ArquivoLeitura { 

	public static void main(String[] args) {
			
		String dir = "C:/projetos/workspace/";
		String arq = "locacao.txt";

		try {
			FileReader leitura = new FileReader(dir+arq);			
			BufferedReader in = new BufferedReader(leitura);
				
			FileWriter escrita = new FileWriter(dir+"out_"+arq);			
			BufferedWriter out = new BufferedWriter(escrita);

			String linha = in.readLine();
			
			while(linha != null) {
					
				String[] campos = linha.split(";");
					
				switch (campos[0].toUpperCase()) {
				
				case "C":
					Carro carro = new Carro(Integer.valueOf(campos[1]),campos[2],Float.valueOf(campos[3]),Boolean.valueOf(campos[4]));
					carro.setQtdePortas(Integer.valueOf(campos[5]));
					carro.setMotor(campos[6]);
					
					out.write(carro.obterValorLocacao() + "\r");
					break;
						
				case "M":
					Moto moto = new Moto(Integer.valueOf(campos[1]),campos[2],Float.valueOf(campos[3]),Boolean.valueOf(campos[4]));
					moto.setMotor(campos[5]);
					moto.setTipo(campos[6]);
					
					out.write(moto.obterValorLocacao() + "\r");
					break;
						
				case "B":
					Barco barco = new Barco(Integer.valueOf(campos[1]),campos[2],Float.valueOf(campos[3]),Boolean.valueOf(campos[4]));
					barco.setQtdePessoas(Integer.valueOf(campos[5]));
					barco.setTipo(campos[6]);
					barco.setSeguro(Boolean.valueOf(campos[7]));
				
					out.write(barco.obterValorLocacao() + "\r");
					
					break;

				default:
					break;
				}

				linha = in.readLine();
			}

			in.close();
			leitura.close();
				
			out.close();
			escrita.close();
			
			System.out.println(args.length == 1 ? args[0]: "Pronto!");
			
			} catch (IOException | qtdePortasInvalida | TipoNulo | qtdePessoasInvalido e) {
				System.out.println(e.getMessage());
		}
	}
}
