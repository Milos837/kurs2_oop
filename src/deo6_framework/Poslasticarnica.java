package deo6_framework;

public class Poslasticarnica extends Prodavnica implements Imenovanje{
	
	private String imeKompanije;
	private String[] stavkaMenija = {
			"Sladoled",
			"Torta",
			"Krofna",
			"Kafa",
			"Caj",
			"Limunada"
	};
	
	public String[] uzmiInventar() {
		return stavkaMenija;
	}
	
	public void kupiInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal" + artikal);
	}
	
	public String pribaviIme() {
		return imeKompanije;
	}
	
	public void postaviIme(String ime) {
		imeKompanije = ime;
	}
	

}
