package deo2_nasledjivanje;

public class Kamion extends Vozilo{
	
	private int brojOsovina;
	
	public Kamion() {}
	
	public Kamion(String marka, String tip, int godiste, String registracija,Osoba vlasnik, int brojOsovina) {
		super(marka,tip,godiste,registracija,vlasnik);
		setBrojOsovina(brojOsovina);
	}

	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}
	
	public void stampajPodatke() {
		System.out.printf("Marka: %s, tip: %s, godiste: %d, registracija: %s,",marka,tip,godiste,registracija);
		System.out.printf(" broj osovina: %d.\n",getBrojOsovina());
		System.out.printf("Vlasnik: %s %s.\n",vlasnik.getIme(),vlasnik.getPrezime());
	}
	
	

}
