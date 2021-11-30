import static org.junit.Assert.*;
import org.junit.Test;

public class TesteCompra{

	@Test
    public void compraAVista() {
		Compra c = new Compra(500);
        assertEquals(500, c.getValorTotal());
        assertEquals(1, c.getNumeroParcelas());
    }
	
	@Test
	public void compraParcelada() {
		Compra c = new Compra(2, 500);
		assertEquals(1000, c.getValorTotal());
		assertEquals(500, c.getValorParcela());
		assertEquals(2, c.getNumeroParcelas());
	}

}