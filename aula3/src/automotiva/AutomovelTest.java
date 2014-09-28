package automotiva;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AutomovelTest {

	private Automovel automovel = new Automovel();
	
	@Test
	public void testCalculaVelocidadeMedia() {
		assertEquals(100, automovel.calculaVelocidadeMedia(10, 1000),0.001);
	}

}
