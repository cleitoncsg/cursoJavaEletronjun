package engenharias;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroPrimoTest {

	@Test
	public void detectaNumeroPrimotest() {
		assertTrue(NumeroPrimo.calculoNumeroPrimo(3));
		assertTrue(NumeroPrimo.calculoNumeroPrimo(5));
	}

}
