package br.lcs.appLocadora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.lcs.appLocadora.modelexception.qtdePortasInvalida;

@SpringBootTest
public class CarroTeste{
	
	@Test
	void testaInstancia() throws qtdePortasInvalida {
		Carro carro = new Carro(2020,"Fiat",100,Boolean.TRUE);
		carro.setQtdePortas(2);
		carro.setMotor("1.0");
		System.out.println(carro.toString());
		
		assertTrue("2020;Fiat;100.0;true;2;1.0".equals(carro.toString()));
	}
	
	@Test
	void calculoValorMoto() throws qtdePortasInvalida {
		Carro carro = new Carro(2020,"Fiat",100,Boolean.TRUE);
		carro.setQtdePortas(2);
		carro.setMotor("1.0");
		
		assertEquals(carro.calcularValorAlocacao(),410);
	}
	
	@Test
	void testaObterValorPorduto() throws qtdePortasInvalida {
		Carro carro = new Carro(2020,"Fiat",100,Boolean.TRUE);
		carro.setQtdePortas(2);
		carro.setMotor("1.0");
		
		System.out.println(carro.obterValorLocacao());
		String resultado = "Fiat;410.0\r";
		
		assertEquals(carro.obterValorLocacao(), resultado);
	}
	
	@Test
	void testaQtdeportasInvalida() {
		try {
			Carro carro = new Carro(2020,"Fiat",100,Boolean.TRUE);
			carro.setQtdePortas(-2);
			carro.setMotor("1.0");
		} catch (qtdePortasInvalida e) {
			assertEquals("Quandidade de portas invalida", e.getMessage());
			System.out.println(e.getMessage());
		}
	}

}
