package cuentaBancaria;

public class CuentaBancaria {
	private double monto;

	public CuentaBancaria() {
		this.monto = 0;
	}

	public double getMonto() {
		return monto;
	}

	public double retirarMonto(double montoRetirar) throws RuntimeException {
		if(montoRetirar>this.monto)
			throw new RuntimeException("Saldo insuficiente.");
		this.monto -= montoRetirar;
		return montoRetirar;
	}

	public void depositarMonto(double montoDeposito) {
		this.monto = montoDeposito;
	}
	
	public void transferirMontoHacia(double montoTransferir, CuentaBancaria destino) {
		this.monto -= montoTransferir;
		destino.monto+=montoTransferir;
	}
}
