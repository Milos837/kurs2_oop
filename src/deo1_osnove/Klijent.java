package deo1_osnove;

public class Klijent {
	
	private String ime;
	private String prezime;
	private String adresa;
	private int jmbg;
	private int brojRacuna;
	private double stanjeRacuna = 0;
	
	public Klijent() {}
	
	public Klijent(String ime, String prezime, String adresa, int jmbg, int brojRacuna) {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.jmbg = jmbg;
		this.brojRacuna = brojRacuna;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getJmbg() {
		return jmbg;
	}
	public void setJmbg(int jmbg) {
		this.jmbg = jmbg;
	}
	public int getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public double getStanjeRacuna() {
		return stanjeRacuna;
	}
	public void setStanjeRacuna(double stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}
	
	public void povecajStanjeRacuna(double stanjeRacuna) {
		this.stanjeRacuna += stanjeRacuna;
	}
	
	public void umanjiStanjeRacuna(double stanjeRacuna) {
		this.stanjeRacuna -= stanjeRacuna;
	}
	
	public void stampajPodatke() {
		System.out.printf("%s %s, %s, JMBG: %d",ime,prezime,adresa,jmbg);
		System.out.printf(", Broj racuna: %d, Stanje racuna: %.2f\n",brojRacuna,stanjeRacuna);
	}

}
