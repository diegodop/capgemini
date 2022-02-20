package questao02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidadorDeSenhaTest {

	@Test
	public void testValidarSenha() {
		ValidadorDeSenha vds = new ValidadorDeSenha();
		
		int retorno = vds.validarSenha("Ya3");
		
		Assertions.assertEquals(3, retorno);
	}

}
