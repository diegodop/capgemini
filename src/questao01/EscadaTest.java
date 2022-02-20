package questao01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EscadaTest {

	@Test
	void testGerarEscada() {
		Escada escada = new Escada();
		escada.setBaseAltura(2);
		String retorno = escada.gerarEscada();
		Assertions.assertEquals(" *\n**", retorno);
	}

}
