package br.lcs.appLocadora;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppLocadoraApplicationTests {

	@Test
	void testeIniciarApp() {
		AppLocadoraApplication.main(new String[] {"lucas"});
	}


}
