package br.com.erickfreire.tabelanumerosbinariosoctaishexadecimais;

/**
 * Programa em Java que mostra uma tabela de n�meros bin�rios octais e hexadecimais dos n�meors de 1 a 256
 * @author FREIR
 *
 */

public class TabelaNumerosBinariosOctaisHexadecimais {

	public static void main(String[] args) {
		
		System.out.println("Tabela com valores Bin�rios Octais, Hexadecimais \n\n");
		System.out.printf("Bin�rio\tOctal\tHexadecimal\n");
		
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
