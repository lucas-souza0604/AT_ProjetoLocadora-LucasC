package br.lcs.appLocadora.model.leitura;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArquivoLeituraTeste {

	@Test
	void testaArquivoLeitura() {
		ArquivoLeitura.main(new String[] {"Tranferencia de dados realizada com sucesso!"});
	}
}
