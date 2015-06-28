package engenharias;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorialTest {

	@Test
	public void calculoFatorialtest() {
		assertEquals(24, Fatorial.calculoFatorial(4));
		assertEquals(120, Fatorial.calculoFatorial(5));
	}
}
