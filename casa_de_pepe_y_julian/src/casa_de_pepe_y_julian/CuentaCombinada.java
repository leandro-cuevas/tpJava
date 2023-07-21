package casa_de_pepe_y_julian;

public class CuentaCombinada {
	
	private Cuenta cuentaPrimaria;
	
	private Cuenta cuentaSecundaria;

	public CuentaCombinada(Cuenta cuentaPrimaria,
						   Cuenta cuentaSecundaria) {
		this.cuentaPrimaria   = cuentaPrimaria;
		this.cuentaSecundaria = cuentaSecundaria;
	}


	public void setCuentaPrimaria(Cuenta cuentaPrimaria) {
		this.cuentaPrimaria = cuentaPrimaria;
	}

	public void setCuentaSecundaria(Cuenta cuentaSecundaria) {
		this.cuentaSecundaria = cuentaSecundaria;
	}
	
	protected int saldo() {
		return cuentaPrimaria.saldo() + cuentaSecundaria.saldo();
	}
	
	protected void extraer(int monto) {
		if (cuentaPrimaria.saldo() >= monto) {
			cuentaPrimaria.extraer(monto);
		} else {
			cuentaSecundaria.extraer(monto);
		}
	}
	
	protected void depositar(int monto) {
		cuentaPrimaria.depositar(monto);
	}
	
}
