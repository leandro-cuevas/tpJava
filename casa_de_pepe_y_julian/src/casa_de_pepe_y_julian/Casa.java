package casa_de_pepe_y_julian;

public class Casa {
	
	private int cantidadDeViveres;
	
	public int getCantidadDeViveres() {
		return cantidadDeViveres;
	}

	private int montoParaReparaciones;
	
	public int getMontoParaReparaciones() {
		return montoParaReparaciones;
	}

	private Cuenta cuentaAsignada;
	
	public Cuenta getCuentaAsignada() {
		return cuentaAsignada;
	}

	public void setCuentaAsignada(Cuenta cuentaAsignada) {
		this.cuentaAsignada = cuentaAsignada;
	}

	public EstrategiaDeAhorro getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(EstrategiaDeAhorro estrategia) {
		this.estrategia = estrategia;
	}

	private EstrategiaDeAhorro estrategia;
	
	private int calidadDeProductos;
	
	public Casa (int cantidadDeViveres,
				 int montoParaReparaciones,
				 Cuenta cuentaAsignada,
				 EstrategiaDeAhorro estrategia,
				 int calidadDeProductos) {
		
		this.cantidadDeViveres = cantidadDeViveres;
		this.montoParaReparaciones = montoParaReparaciones;
		this.cuentaAsignada = cuentaAsignada;
		this.estrategia =  estrategia;
		this.calidadDeProductos = calidadDeProductos;
	}
	
	public boolean hayViveresSuficientes() {
		return cantidadDeViveres >= 40;
	}
	
	public boolean hayQueHacerReparaciones() {
		return montoParaReparaciones > 0;
	}
	
	public boolean laCasaEstaEnOrden() {
		return hayViveresSuficientes() && !(hayQueHacerReparaciones());
	}
	
	public void seRompeUnObjetoPorMonto (int monto) {
		montoParaReparaciones += monto;
	}
	
	public int saldoCuentaAsignada() {
		return cuentaAsignada.saldo();
	}
	
	public void realizarReparaciones() {
		cuentaAsignada.extraer(montoParaReparaciones);
		montoParaReparaciones = 0;
	}
	
	public void comprarViveres(int cantidad) {
		cuentaAsignada.extraer(cantidad * calidadDeProductos);
		cantidadDeViveres += cantidad;
	}
	
	public void mantenerLaCasa() {
		estrategia.realizarMantenimiento(this);
	}
	
}
