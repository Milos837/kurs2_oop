package deo2_nasledjivanje;

public class Motocikl extends Vozilo{
	
	private boolean registrovan;
	
	public Motocikl () {}
	
	public Motocikl(String marka, String tip, int godiste, String registracija,Osoba vlasnik,boolean registrovan) {
		super(marka,tip,godiste,registracija,vlasnik);
		setRegistrovan(registrovan);
	}

	public boolean isRegistrovan() {
		return registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}
	
	public void stampajPodatke() {
		System.out.printf("Marka: %s, tip: %s, godiste: %d, registracija: %s,",marka,tip,godiste,registracija);
		System.out.printf(" registrovan: %b.\n",isRegistrovan());
		System.out.printf("Vlasnik: %s %s.\n",vlasnik.getIme(),vlasnik.getPrezime());
	}
	

}
