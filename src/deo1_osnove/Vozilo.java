package deo1_osnove;

public class Vozilo {
	
	private String marka;
	private String tip;
	private int godiste;
	private String registracija;
	private int maxBrzina;
	private int snaga;
	
	public Vozilo() {}
	
	public Vozilo(String marka, String tip, int godiste, String registracija, int maxBrzina, int snaga) {
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.maxBrzina = maxBrzina;
		this.snaga = snaga;
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

	public int getMaxBrzina() {
		return maxBrzina;
	}

	public void setMaxBrzina(int maxBrzina) {
		this.maxBrzina = maxBrzina;
	}

	public int getSnaga() {
		return snaga;
	}
	
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	
	public double racunajVrednost() {
		return this.maxBrzina*this.snaga/(2017 - this.godiste);
	}
	
	public void stampajPodatke() {
		System.out.printf("Vozilo marke %s, tipa %s i registracije %s",this.marka,this.tip,this.registracija);
		System.out.printf(" ima sledece podatke:\n");
		System.out.printf("Godiste: %d, maksimalna brzina: %d,",this.godiste,this.maxBrzina);
		System.out.printf(" snaga: %d, vrednost: %.2f.\n",this.snaga,this.racunajVrednost());
	}
	
	public void porediVozila(Vozilo v1) {		
		if(this.racunajVrednost() > v1.racunajVrednost()) {
			System.out.println("Prvo vozilo je skuplje.");
		} else if(this.racunajVrednost() < v1.racunajVrednost()) {
			System.out.println("Drugo vozilo je skuplje.");
		} else {
			System.out.println("Vozila imaju jednaku vrednost");
		}
	}
}
