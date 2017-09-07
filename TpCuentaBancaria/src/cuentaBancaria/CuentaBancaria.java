package cuentaBancaria;

public class CuentaBancaria {
	private double monto;
	
	public CuentaBancaria() {
		this.monto=0;
	}

	public double getMonto() {
		return monto;
	}
	
	public double retirarMonto(double montoRetirar) {
		return montoRetirar;
	}
	
	public void depositarMonto(double montoDeposito) {
		this.monto=montoDeposito;
	}
}
