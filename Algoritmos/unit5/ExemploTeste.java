package unit5;

import org.junit.Test;

public class ExemploTeste {
		
	int i = 10;

    @Test
    public void teste1() {
        i++;
        System.out.println("Teste 1: " + i);
    }

    @Test
    public void teste2() {
        i++;
        System.out.println("Teste 2: " + i);
    }

}
