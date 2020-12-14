package br.lcs.appLocadora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LocacaoTeste {
	
	@Test
	void TestaAssociacao() {
		Cliente c = new Cliente("lucas", "12345678911", "lucas@gmail.com", "123456789");
		Locacao l = new Locacao();
		l.setCliente(c);
		
		assertTrue(c.equals(l.getCliente()));
		
	}
	
	@Test
	void testaWeb() {
		Cliente c = new Cliente("lucas", "12345678911", "lucas@gmail.com", "123456789");
		Locacao l = new Locacao();
		l.setCliente(c);
		System.out.println("Locacao via WEB: " + l);
		assertTrue(l.isWeb());
		
	}
	
	@Test
	void testaPresencial() {
		Cliente c = new Cliente("lucas", "12345678911", "lucas@gmail.com", "123456789");
		Locacao l = new Locacao();
		l.setWeb(Boolean.FALSE);
		l.setCliente(c);
		
		
		System.out.println("Locacao via PRESENCIAL: " + l);
		assertFalse(l.isWeb());
	}
	
	@Test
	void testaToString() {
		DateTimeFormatter formatoHoje = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime hoje = LocalDateTime.now();
		
		Cliente c = new Cliente("lucas", "12345678911", "lucas@gmail.com", "123456789");
		Locacao l = new Locacao();
		l.setWeb(Boolean.FALSE);
		l.setCliente(c);
		
		String textoLocacao = hoje.format(formatoHoje)+";false;lucas;12345678911;lucas@gmail.com;123456789";
		System.out.println(l);
		System.out.println(textoLocacao);
		assertTrue(textoLocacao.equals(l.toString()));
	}

}
