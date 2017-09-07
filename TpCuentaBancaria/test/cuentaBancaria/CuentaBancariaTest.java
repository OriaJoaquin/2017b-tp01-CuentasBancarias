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
		Assert.assertEquals(100, cb.retirarMonto(),0.01);
	}
}
