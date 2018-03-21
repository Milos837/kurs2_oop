package deo6_framework;

public class Picerija extends Prodavnica implements Imenovanje{
	
	private String imeKompanije;
	
	private String[] ponudaHrane = {
			"Pica",
			"Pasta",
			"Salata",
			"Kalcona",
			"Sok",
			"Pivo"
	};
	
	public String[] uzmiInventar() {
		return ponudaHrane;
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
