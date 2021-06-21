import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Questao3Test {

	@Test
	public void test1() {
		 int k = 3;
	     String s = "ashley", t = "ash";
	     
	     String retornoEsperado = "Sim";
	     String retornoRecebido = Questao3.concatERemove(s, t, k);
	     
	     assertEquals(retornoEsperado, retornoRecebido);
	}
	
	@Test
	public void test2() {
		 int k = 4;
	     String s = "jose", t = "radek";
	     
	     String retornoEsperado = "Não";
	     String retornoRecebido = Questao3.concatERemove(s, t, k);
	     
	     assertEquals(retornoEsperado, retornoRecebido);
	}
	
	@Test
	public void test3() {
		 int k = 13;
	     String s = "radek", t = "jose";
	     
	     String retornoEsperado = "Sim";
	     String retornoRecebido = Questao3.concatERemove(s, t, k);
	     
	     assertEquals(retornoEsperado, retornoRecebido);
	}

}
