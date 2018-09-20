import org.junit.Test;
import org.junit.Assert;

public class MatematicaTest {

	@Test
	public void testaFatorialZero() {
		Matematica matematica = new Matematica();
		int resposta = matematica.fatorial(0);

		Assert.assertEquals(resposta, 1);
	}
	
	@Test
	public void testaFatorialMenorZero() {
		Matematica matematica = new Matematica();
		int resposta = matematica.fatorial(-5);

		Assert.assertEquals(resposta, 1);
	}
}
