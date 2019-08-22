package validarCNPJ;
import java.util.Scanner;

import validarCNPJ.ValidaCNPJ;

public class TestValidador {

	public static void main(String[] args) {
		
		
		    Scanner ler = new Scanner(System.in);
		 
		    String CNPJ;
		 
		    System.out.printf("Informe um CNPJ: ");
		    CNPJ = ler.next();
		 
		    System.out.printf("\nResultado: ");
		// usando os m�todos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
		    if (ValidaCNPJ.isCNPJ(CNPJ) == true)
		       System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
		    else System.out.printf("Erro, CNPJ inv�lido !!!\n");
		  }
		

	}



