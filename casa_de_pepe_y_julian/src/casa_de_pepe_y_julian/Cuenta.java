package casa_de_pepe_y_julian;

public class Cuenta {
	
	protected int saldo;	
	
	public Cuenta(int saldo) {
		this.saldo = saldo;
	}

	protected int saldo() {
		return saldo;
	}

	protected void extraer(int monto) {
		saldo -= monto;		
	}
	
	protected void depositar(int monto) {
		saldo += monto;
	}

}
