package casa_de_pepe_y_julian;

public class CuentaConGastos extends Cuenta {

	private int costosPorOperacion;
	
	public CuentaConGastos(int saldo, int costosPorOperacion) {
		super(saldo);
		this.costosPorOperacion = costosPorOperacion;
	}
	
	protected void depositar (int monto) {
		saldo += monto - costosPorOperacion;
	}
}
