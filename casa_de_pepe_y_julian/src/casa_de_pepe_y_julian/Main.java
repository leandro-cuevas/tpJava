package casa_de_pepe_y_julian;

public class Main {
	
	public static void main(String[] args) {
		CuentaCorriente cuenta = new CuentaCorriente(1000);
		Full estrategia = new Full();
		Casa casaDeChiQues = new Casa(50, 100, cuenta, estrategia, 5);
		System.out.println("La casa tiene " + casaDeChiQues.getCantidadDeViveres() + " de viveres");
		casaDeChiQues.mantenerLaCasa();
		System.out.println("La casa tiene " + casaDeChiQues.getCantidadDeViveres() + " de viveres");
		System.out.println("La casa tiene " + casaDeChiQues.getMontoParaReparaciones() + " de reparaciones porque no las hicieron");
		}
}
