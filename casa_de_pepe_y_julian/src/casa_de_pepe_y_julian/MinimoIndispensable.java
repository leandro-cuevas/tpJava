package casa_de_pepe_y_julian;

public class MinimoIndispensable extends EstrategiaDeAhorro {

	private int viveresMinimos;
	
	public void realizarMantenimiento(Casa casaAMantener) {
		if (!casaAMantener.hayViveresSuficientes()) {
			casaAMantener.comprarViveres(viveresMinimos - casaAMantener.getCantidadDeViveres());
		}
	}

	public void setViveresMinimos(int viveresMinimos) {
		this.viveresMinimos = viveresMinimos;
	}

}
