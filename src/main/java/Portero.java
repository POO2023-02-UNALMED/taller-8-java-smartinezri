package futbol;

public class Portero extends Futbolista {

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	@Override
	public int compareTo(Object k) {
		return 0;
	}
	
	@Override
	public int compareTo(Futbolista t) {
		Portero p = (Portero) t;
		return Math.abs(this.golesRecibidos - p.golesRecibidos);
	}
	
}
