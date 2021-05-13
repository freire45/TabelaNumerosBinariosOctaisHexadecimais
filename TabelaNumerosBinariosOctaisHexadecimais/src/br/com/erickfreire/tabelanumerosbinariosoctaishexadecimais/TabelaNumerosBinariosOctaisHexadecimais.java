package br.com.erickfreire.tabelanumerosbinariosoctaishexadecimais;

/**
 * Programa em Java que mostra uma tabela de números binários octais e hexadecimais dos númeors de 1 a 256
 * @author FREIR
 *
 */

public class TabelaNumerosBinariosOctaisHexadecimais {

	public static void main(String[] args) {
		
		System.out.println("Tabela com valores Binários Octais, Hexadecimais \n\n");
		System.out.printf("Binário\tOctal\tHexadecimal\n");
		
		mostraTabela();

	}
	
	public static void mostraTabela() {
		
		for(int i = 1; i <= 256; i++) {
			String binario;
			String octal;
			String hexadecimal;
			
			binario = Integer.toBinaryString(i);
			octal = Integer.toOctalString(i);
			hexadecimal = Integer.toHexString(i);
			

			System.out.printf("%s\t%s\t%s%n", binario, octal, hexadecimal);
			
		}
		
	}

}
