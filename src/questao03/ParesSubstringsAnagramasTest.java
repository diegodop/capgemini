package questao03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParesSubstringsAnagramasTest {

	@Test
	void testCalcularParesSubstringsAnagramas1() {
		ParesSubstringsAnagramas psa = new ParesSubstringsAnagramas();
		int retorno = psa.calcularParesSubstringsAnagramas("ovo");
		Assertions.assertEquals(2, retorno);
	}
	
	@Test
	void testCalcularParesSubstringsAnagramas2() {
		ParesSubstringsAnagramas psa = new ParesSubstringsAnagramas();
		int retorno = psa.calcularParesSubstringsAnagramas("ifailuhkqq");
		Assertions.assertEquals(3, retorno);
	}

}
