package deo3_sastavljanje;

public class Vozilo {
	
	protected String marka;
	protected String tip;
	protected int godiste;
	protected Motor pogonskiAgregat;
	protected String registracija;
	protected Osoba vlasnik;
	
	public Vozilo() {
		this.pogonskiAgregat = new Motor();
	}
	
	public Vozilo(String marka, String tip, int godiste, boolean radi, String tipMotora, int snaga, int kubikaza, String registracija, Osoba vlasnik) {
		this.pogonskiAgregat = new Motor(radi,tipMotora,snaga,kubikaza);
		setMarka(marka);
		setTip(tip);
		setGodiste(godiste);
		setRegistracija(registracija);
		setVlasnik(vlasnik);
	}
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getGodiste() {
		return godiste;
	}
	
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}
	
	public void prenosVlasnistva(Osoba o) {
		setVlasnik(o);
	}
	
	public void stampajPodatke() {
		System.out.printf("Marka: %s, tip: %s, godiste: %d, registracija: %s.\n",marka,tip,godiste,registracija);
		System.out.printf("Vlasnik: %s %s.\n",vlasnik.getIme(),vlasnik.getPrezime());
		
	}

	public Osoba getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	
}
