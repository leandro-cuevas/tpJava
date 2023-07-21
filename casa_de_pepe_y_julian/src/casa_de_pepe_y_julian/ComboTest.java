package casa_de_pepe_y_julian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComboTest {

	private Casa casa;
	private Cuenta cuentaCorriente;
	private Cuenta cuentaConGastos;
	private EstrategiaDeAhorro estrategia;
	
	@BeforeEach
	void setUp() {
		cuentaCorriente = new CuentaCorriente(1000);
		cuentaConGastos = new CuentaConGastos(0, 20);
		estrategia = new Full();
		casa = new Casa(50, 0, cuentaCorriente, estrategia, 5);
	}
	
	@Test
	void laCasa() {
		casa.seRompeUnObjetoPorMonto(1000);
		assertEquals(50, casa.getCantidadDeViveres());
		assertEquals(false, casa.laCasaEstaEnOrden());
	}
	
	@Test
	void cuentaVaciaCon20DeCosto() {
		cuentaConGastos.depositar(1000);
		assertEquals(980, cuentaConGastos.saldo());
	}
	

}
