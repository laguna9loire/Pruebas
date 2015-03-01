import junit.framework.TestCase;


public class pruebaMcd extends TestCase {
	
	public static void testMcd(){
		Mcd objeto = new Mcd();
		int mcd;
		objeto.setA(72);
		objeto.setB(16);
		mcd=objeto.calculoMcd();
		
		assertEquals(8, mcd);

		assertEquals(4, mcd);
		
	}
}
