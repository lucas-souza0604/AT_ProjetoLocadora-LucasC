package br.lcs.appLocadora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.lcs.appLocadora.modelexception.TipoNulo;

@SpringBootTest
public class MotoTeste{
	
	@Test
	void testaInstancia() throws TipoNulo {
		Moto moto = new Moto(2011,"Yamaha",100,Boolean.TRUE);
		moto.setMotor("1.0");
		moto.setTipo("esportiva");
		
		assertTrue("2011;Yamaha;100.0;true;1.0;esportiva".equals(moto.toString()));
	}
	
	@Test
	void calculoValorMoto() {
		Moto moto = new Moto(2011,"Yamaha",100,Boolean.TRUE);
		
		assertTrue(moto.calcularValorAlocacao() == 340);
	}
	
	@Test
	void testaObterValorPorduto() throws TipoNulo {
		Moto moto = new Moto(2011,"Yamaha",100,Boolean.TRUE);
		moto.setMotor("1.0");
		moto.setTipo("esportiva");
		
		System.out.println(moto.obterValorLocacao());
		String resultado = "Yamaha;340.0\r";
		
		assertEquals(moto.obterValorLocacao(), resultado);
	}
	
	@Test
	void testaTipoNulo() {
		try {
			Moto moto = new Moto(2011,"Yamaha",100,Boolean.TRUE);
			moto.setMotor("1.0");
			moto.setTipo(null);
		} catch (TipoNulo e) {
			assertEquals("Tipo nao pode ser nulo", e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	
}





