package questao02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe utilizada para validar se uma determinada senha satisfaz os critérios para ser considerada segura.
 * Os critérios são os seguintes:
 * - Possui no mínimo 6 caracteres.
 * - Contém no mínimo 1 digito.
 * - Contém no mínimo 1 letra em minúsculo.
 * - Contém no mínimo 1 letra em maiúsculo.
 * - Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
 * 
 * Dada uma determinada string, será informado o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
 * 
 * @author Diego Oliveira Peixoto
 * @version 1.0
 * 
 */
public class ValidadorDeSenha {
	
	private static final String REGEX_DIGITO = "^(?=.*[0-9]).*";
	private static final String REGEX_MINUSCULO = "^(?=.*[a-z]).*";
	private static final String REGEX_MAIUSCULO = "^(?=.*[A-Z]).*";
	private static final String REGEX_CARAC_ESPECIAL = "^(?=.*[!@#$%^&*()-+]).*";
	private static final int tamanhoMinimo = 6;
	
	public static int getTamanhominimo() {
		return tamanhoMinimo;
	}
	
	/**
	 * Método que verifica se uma string recebida contém digitos
	 * @param senha = string que será analisada
	 * @return booleano onde TRUE é quando a string contém dígitos e FALSE é quando não contém
	 */
	public boolean contemDigito(String senha) {
		Pattern pattern = Pattern.compile(REGEX_DIGITO);
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
	}
	
	/**
	 * Método que verifica se uma string recebida contém letra minúscula
	 * @param senha = string que será analisada
	 * @return booleano onde TRUE é quando a string contém letra minúscula e FALSE é quando não contém
	 */
	public boolean contemMinusculo(String senha) {
		Pattern pattern = Pattern.compile(REGEX_MINUSCULO);
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
	}
	
	/**
	 * Método que verifica se uma string recebida contém letra maiúscula
	 * @param senha = string que será analisada
	 * @return booleano onde TRUE é quando a string contém letra maiúscula e FALSE é quando não contém
	 */
	public boolean contemMaiusculo(String senha) {
		Pattern pattern = Pattern.compile(REGEX_MAIUSCULO);
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
	}
	
	/**
	 * Método que verifica se uma string recebida contém caractere especial
	 * @param senha = string que será analisada
	 * @return booleano onde TRUE é quando a string contém caractere especial e FALSE é quando não contém
	 */
	public boolean contemCaracEspecial(String senha) {
		Pattern pattern = Pattern.compile(REGEX_CARAC_ESPECIAL);
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
	}
	
	
	
	/**
	 * Método utilizado para validar a senha recebida e informar quantos caracteres devem ser adicionados para tornar a senha segura
	 * @param senha = string que será analisada
	 * @return quantidade de caracteres que devem ser adicionados para tornar a senha segura
	 */
	public int validarSenha(String senha) {
		
		int qtdAdicionar = 0;
		
		if(this.contemDigito(senha)) {
			qtdAdicionar++;
		}
		
		if(this.contemMinusculo(senha)) {
			qtdAdicionar++;
		}
		
		if(this.contemMaiusculo(senha)) {
			qtdAdicionar++;
		}
		
		if(this.contemCaracEspecial(senha)) {
			qtdAdicionar++;
		}
		
		while((senha.length() + qtdAdicionar) < ValidadorDeSenha.getTamanhominimo()) {
			qtdAdicionar++;
		}
		
		return qtdAdicionar;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String senha = scan.next();
		scan.close();
		
		ValidadorDeSenha vds = new ValidadorDeSenha();
		
		System.out.println(vds.validarSenha(senha));
		
	}

}
