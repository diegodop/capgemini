package questao01;

import java.util.Scanner;

/**
 * Classe utilizada para apresentar uma escada de tamanho n utilizando o caractere * e espa�os.
 * A base e altura da escada s�o iguais ao valor de n.
 * A �ltima linha n�o cont�m nenhum espa�o
 * 
 * @author Diego Oliveira Peixoto
 * @version 1.0
 * 
 */
public class Escada {
	
	/**
	 * Vari�vel utilizada para armazenar o tamanho da base e da altura da escada, que s�o iguais
	 */
	private int baseAltura;
	
	/**
	 * M�todo que retorna o tamanho da base/altura da escada
	 * @return tamanho da base/altura da escada
	 */
	public int getBaseAltura() {
		return baseAltura;
	}

	/**
	 * M�todo para setar o tamanho da base/altura da escada
	 * @param baseAltura = tamanho da base/altura
	 */
	public void setBaseAltura(int baseAltura) {
		this.baseAltura = baseAltura;
	}

	/**
	 * 
	 * M�todo utilizado para gerar a string da escada de acordo com o tamanho pr�-definido
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
