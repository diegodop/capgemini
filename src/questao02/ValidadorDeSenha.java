package questao02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe utilizada para validar se uma determinada senha satisfaz os crit�rios para ser considerada segura.
 * Os crit�rios s�o os seguintes:
 * - Possui no m�nimo 6 caracteres.
 * - Cont�m no m�nimo 1 digito.
 * - Cont�m no m�nimo 1 letra em min�sculo.
 * - Cont�m no m�nimo 1 letra em mai�sculo.
 * - Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
 * 
 * Dada uma determinada string, ser� informado o n�mero m�nimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
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
	 * M�todo que verifica se uma string recebida cont�m digitos
	 * @param senha = string que ser� analisada
	 * @return booleano onde TRUE � quando a string cont�m d�gitos e FALSE � quando n�o cont�m
	 */
	public boolean contemDigito(String senha) {
		Pattern pattern = Pattern.compile(REGEX_DIGITO);
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
	}
	
	/**
	 * M�todo que verifica se uma string recebida cont�m letra min�scula
	 * @param senha = string que ser� analisada
	 * @return booleano onde TRUE � quando a string cont�m letra min�scula e FALSE � quando n�o cont�m
	 */
	public boolean contemMinusculo(String senha) {
		Pattern pattern = Pattern.compile(REGEX_MINUSCULO);
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
	}
	
	/**
	 * M�todo que verifica se uma string recebida cont�m letra mai�scula
	 * @param senha = string que ser� analisada
	 * @return booleano onde TRUE � quando a string cont�m letra mai�scula e FALSE � quando n�o cont�m
	 */
	public boolean contemMaiusculo(String senha) {
		Pattern pattern = Pattern.compile(REGEX_MAIUSCULO);
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
	}
	
	/**
	 * M�todo que verifica se uma string recebida cont�m caractere especial
	 * @param senha = string que ser� analisada
	 * @return booleano onde TRUE � quando a string cont�m caractere especial e FALSE � quando n�o cont�m
	 */
	public boolean contemCaracEspecial(String senha) {
		Pattern pattern = Pattern.compile(REGEX_CARAC_ESPECIAL);
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
	}
	
	
	
	/**
	 * M�todo utilizado para validar a senha recebida e informar quantos caracteres devem ser adicionados para tornar a senha segura
	 * @param senha = string que ser� analisada
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
