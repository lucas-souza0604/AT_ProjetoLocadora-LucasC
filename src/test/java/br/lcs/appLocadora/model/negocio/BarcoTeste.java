package br.lcs.appLocadora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.lcs.appLocadora.modelexception.qtdePessoasInvalido;

@SpringBootTest
public class BarcoTeste{

	@Test
	void testaInstancia() throws qtdePessoasInvalido {
		Barco barco = new Barco(2016,"Ok",100,Boolean.TRUE);
		barco.setQtdePessoas(10);
		barco.setTipo("Lancha");
		barco.setSeguro(Boolean.TRUE);
		System.out.println(barco.toString());
		
		assertTrue("2016;Ok;100.0;true;10;Lancha;true".equals(barco.toString()));
	}
	
	@Test
	void calculoValorBarco() throws qtdePessoasInvalido {
		Barco barco = new Barco(2016,"Ok",100,Boolean.TRUE);
		barco.setQtdePessoas(10);
		barco.setTipo("Lancha");
		barco.setSeguro(Boolean.TRUE);
		
		assertEquals(barco.calcularValorAlocacao(),590);
	}
	
	@Test
	void testaQtdePessoasInvalida() {
		Barco barco = new Barco(2016,"Ok",100,Boolean.TRUE);
		try {
			barco.setQtdePessoas(101);
			barco.setTipo("Lancha");
			barco.setSeguro(Boolean.TRUE);
		} catch (qtdePessoasInvalido e) {
			assertEquals("O numero de pessoas nao pode ser maior que 100 e nem menor que 0", e.getMessage());
		}
	}
	
	@Test
	void testaObterValorPorduto() throws qtdePessoasInvalido {
		Barco barco = new Barco(2016,"Ok",100,Boolean.TRUE);
		barco.setQtdePessoas(10);
		barco.setTipo("Lancha");
		barco.setSeguro(Boolean.TRUE);
		
		String resultado = "Ok;590.0\r";
		
		assertEquals(barco.obterValorLocacao(), resultado);
	}
}
