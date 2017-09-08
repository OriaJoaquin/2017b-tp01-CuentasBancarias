package cuentaBancaria;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class CuentaBancariaTest {
	CuentaBancaria cb;
	CuentaBancaria cb1;

	@Before
	public void setUp() {
		cb = new CuentaBancaria();
		cb1 = new CuentaBancaria();
	}

	@Test
	public void queIniciaEnCero() {
		Assert.assertEquals(0, cb.getMonto(), 0.01);
	}

	@Test
	public void queRetireCien() {
		cb.depositarMonto(100);
		Assert.assertEquals(100, cb.retirarMonto(100), 0.01);
	}

	@Test
	public void queRetireDosciento() {
		cb.depositarMonto(200);
		Assert.assertEquals(200, cb.retirarMonto(200), 0.01);
	}

	@Test
	public void queRetireTrescientos() {
		cb.depositarMonto(300);
		Assert.assertEquals(300, cb.retirarMonto(300), 0.01);
	}

	@Test
	public void queDepositeDinero() {
		cb.depositarMonto(300);
		Assert.assertEquals(300, cb.getMonto(), 0.01);
	}

	@Test
	public void queResteDineroCuandoRetiro() {
		cb.depositarMonto(500);
		cb.retirarMonto(300);
		Assert.assertEquals(200, cb.getMonto(), 0.01);
	}

	@Test
	public void queSeTrafieraDineroDeCuentaACuenta() {
		cb.depositarMonto(500);
		cb1.depositarMonto(1000);

		cb1.transferirMontoHacia(250, cb);

		Assert.assertEquals(750, cb.getMonto(), 0.01);
		Assert.assertEquals(750, cb1.getMonto(), 0.01);
	}

	@Test(expected = Exception.class)
	public void queInformeSaldoInsuficiente() {
		cb1.depositarMonto(100);
		cb1.retirarMonto(300);
	}
}
