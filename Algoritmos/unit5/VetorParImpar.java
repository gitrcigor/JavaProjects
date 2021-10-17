package unit5;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class VetorParImpar {

	public static void main(String[] args) {
		
		
		int i;
		int valorVetor;
		Scanner in = new Scanner(System.in);
		
		
		int vetorParImpar[] = new int[6];
		
		for (i = 0; i <= 6 ; i++) {
			
			System.out.print("\nInforme um valor para o vetor: ");
			
			vetorParImpar[i] = in.nextInt();
			
		}
		
		int numerosPares;
		
		if (vetorParImpar[i] % 2 == 0) {
			
			System.out.print("\n");
			
		}
		
		
		in.close();
	}

}
