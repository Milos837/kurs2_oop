package deo6_framework;

public abstract class Prodavnica {
	
	private SpisakKlijenata spisakKlijenata;
	
	public void izracunajPDV() {
		System.out.println("Stopa PDV-a je 20%");
	}
	
	abstract public String[] uzmiInventar();
	
	abstract public void kupiInventar(String artikal);

}
