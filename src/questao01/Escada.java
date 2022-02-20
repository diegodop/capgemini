package questao01;

import java.util.Scanner;

/**
 * Classe utilizada para apresentar uma escada de tamanho n utilizando o caractere * e espaços.
 * A base e altura da escada são iguais ao valor de n.
 * A última linha não contém nenhum espaço
 * 
 * @author Diego Oliveira Peixoto
 * @version 1.0
 * 
 */
public class Escada {
	
	/**
	 * Variável utilizada para armazenar o tamanho da base e da altura da escada, que são iguais
	 */
	private int baseAltura;
	
	/**
	 * Método que retorna o tamanho da base/altura da escada
	 * @return tamanho da base/altura da escada
	 */
	public int getBaseAltura() {
		return baseAltura;
	}

	/**
	 * Método para setar o tamanho da base/altura da escada
	 * @param baseAltura = tamanho da base/altura
	 */
	public void setBaseAltura(int baseAltura) {
		this.baseAltura = baseAltura;
	}

	/**
	 * 
	 * Método utilizado para gerar a string da escada de acordo com o tamanho pré-definido
	 * @return string pronta para ser impressa na tela
	 */
	public String gerarEscada() {
		String retorno = "";
		int n = this.getBaseAltura();
		for(int i = 1; i <= n; i++) {
			int asterisco = 1;
			int espaco = n - i;
			for(int t = 0; t < espaco; t++) {
				retorno = retorno + " ";
			}
			while(asterisco <= i) {
				retorno = retorno + "*";
				asterisco++;
			}
			if(espaco != 0) {
				retorno = retorno + "\n";
			}			
		}
		return retorno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Escada escada = new Escada();
		escada.setBaseAltura(scan.nextInt());
		System.out.println(escada.gerarEscada());
		scan.close();
	}

}
