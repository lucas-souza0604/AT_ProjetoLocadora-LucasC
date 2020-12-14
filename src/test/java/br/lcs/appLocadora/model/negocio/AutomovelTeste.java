package br.lcs.appLocadora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AutomovelTeste {
	
	@Test
	void testaCarro() {
		Carro carro = new Carro(2009,"Fiat",200,Boolean.TRUE);
		assertNotNull(carro);
	}
	
	
	@Test
	void testaMoto() {
		Moto moto = null;
		moto = new Moto(2011,"Yamaha",100,Boolean.TRUE);
		
		assertNotNull(moto);
	}
	
	@Test
	void testaBarco() {
		Barco barco = null;
		barco = new Barco(2016,"Ok",100,Boolean.TRUE);
		
		assertNotNull(barco);
	}
}
