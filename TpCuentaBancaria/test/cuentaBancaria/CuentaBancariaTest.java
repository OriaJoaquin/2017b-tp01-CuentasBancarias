package cuentaBancaria;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class CuentaBancariaTest {
	CuentaBancaria cb;

	@Before
	public void setUp() {
		cb = new CuentaBancaria();
	}

	@Test
	public void queIniciaEnCero() {
		Assert.assertEquals(0, cb.getMonto(),0.01);
	}
	
	@Test
	public void queRetireCien() {
		Assert.assertEquals(100, cb.retirarMonto(100),0.01);
	}
	
	@Test
	public void queRetireDosciento() {
		Assert.assertEquals(200, cb.retirarMonto(200),0.01);
	}
	
	@Test
	public void queRetireTrescientos() {
		Assert.assertEquals(300, cb.retirarMonto(300),0.01);
	}
}
