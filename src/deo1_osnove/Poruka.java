package deo1_osnove;

public class Poruka {
	
	private String tekst;
	
	public void postaviPoruku(String tekst) {
		this.tekst = tekst;
	}
	
	public void prikaziPoruku() {
		System.out.println(this.tekst);
	}

}
