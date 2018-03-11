package deo2_nasledjivanje;

public class Automobil extends Vozilo{
	
	private int brojVrata;
	
	public Automobil () {}
	
	public Automobil(String marka, String tip, int godiste, String registracija,Osoba vlasnik,int brojVrata) {
		super(marka,tip,godiste,registracija,vlasnik);
		setBrojVrata(brojVrata);
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	
	public void stampajPodatke() {
		System.out.printf("Marka: %s, tip: %s, godiste: %d, registracija: %s,",marka,tip,godiste,registracija);
		System.out.printf(" broj vrata: %d.\n",getBrojVrata());
		System.out.printf("Vlasnik: %s %s.\n",vlasnik.getIme(),vlasnik.getPrezime());
	}

}
