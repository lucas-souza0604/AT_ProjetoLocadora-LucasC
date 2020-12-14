package br.lcs.appLocadora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTeste {
	
	@Test
	void testaInstancia() {
		Cliente c = null;
		c = new Cliente("lucas", "12345678911", "lucas@gmail.com", "123456789");
		
		assertNotNull(c);
	}
	
	@Test
	void testaToString() {
		Cliente c = null;
		c = new Cliente("lucas", "12345678911", "lucas@gmail.com", "123456789");
		
		assertTrue("lucas;12345678911;lucas@gmail.com;123456789".equals(c.toString()));
		
	}
}
