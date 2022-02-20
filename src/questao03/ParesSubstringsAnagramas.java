package questao03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe utilizada para, dada uma string, encontrar o número de pares de substrings que são anagramas
 * 
 * @author Diego Oliveira Peixoto
 * @version 1.0
 * 
 */
public class ParesSubstringsAnagramas {
	
	/**
	 * Método utilizado para calcular, a partir da string de entrada, a quantidade de pares de substrings que são anagramas
	 * @param entrada = string qualquer que será analisada
	 * @return quantidade de pares de substrings que são anagramas
	 */
	public int calcularParesSubstringsAnagramas(String entrada) {
		int contador = 0;
		String subStr1 = null, subStr2 = null;
		char[] arr1 = null, arr2 = null;
		
		
		if(entrada.length() >= 2) {
			for(int tamanhoSubstring = 1; tamanhoSubstring < entrada.length();tamanhoSubstring++) {
				for(int inicio = 0; inicio < entrada.length()-1; inicio++) {
					int posicao = inicio+1;
					while(posicao + tamanhoSubstring <= entrada.length()) {
						subStr1 = entrada.substring(inicio, inicio+tamanhoSubstring);
						subStr2 = entrada.substring(posicao, posicao+tamanhoSubstring);
						arr1 = subStr1.toLowerCase().toCharArray();
					    Arrays.sort(arr1);
					    arr2 = subStr2.toLowerCase().toCharArray();
					    Arrays.sort(arr2);
					    if(Arrays.equals(arr1, arr2)) {
					    	contador++;
					    }
						posicao++;
						
					}
				}
			}
		}
		
		return contador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String entrada = scan.next();
		scan.close();
		
		ParesSubstringsAnagramas psa = new ParesSubstringsAnagramas();

		System.out.println(psa.calcularParesSubstringsAnagramas(entrada));

	}

}
