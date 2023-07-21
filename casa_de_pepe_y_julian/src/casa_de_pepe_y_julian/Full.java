package casa_de_pepe_y_julian;

public class Full extends EstrategiaDeAhorro {

	public void realizarMantenimiento(Casa casaAMantener) {
		if (casaAMantener.laCasaEstaEnOrden()) {
			casaAMantener.comprarViveres(100 - casaAMantener.getCantidadDeViveres());
		} else {
			casaAMantener.comprarViveres(40);
		}
		if (casaAMantener.saldoCuentaAsignada() > casaAMantener.getMontoParaReparaciones() + 1000) {
			casaAMantener.realizarReparaciones();
		}
	}
}
