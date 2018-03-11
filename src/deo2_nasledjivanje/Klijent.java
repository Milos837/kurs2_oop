package deo2_nasledjivanje;

public class Klijent extends Osoba{
	
	private String adresa;
	private String jmbg;
	private int brojRacuna;
	private double stanjeRacuna = 0;
	
	public Klijent() {}
	
	public Klijent(String ime, String prezime,int starost, String adresa, String jmbg, int brojRacuna) {
		super(ime,prezime,starost);
		this.adresa = adresa;
		this.jmbg = jmbg;
		this.brojRacuna = brojRacuna;
	}
	
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
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
	
	public void transferStanja(Klijent k, int kolicina) {
		if(k.getStanjeRacuna() > kolicina) {
			this.povecajStanjeRacuna(kolicina);
			k.umanjiStanjeRacuna(kolicina);
			System.out.println("Transakcija uspesna.");
		} else {
			System.out.println("Transakcija neuspesna, nedovoljno novca.");
		}
	}
	
	public void stampajPodatke() {
		System.out.printf("%s %s, %s, JMBG: %s",getIme(),getPrezime(),getAdresa(),getJmbg());
		System.out.printf(", Broj racuna: %d, Stanje racuna: %.2f\n",getBrojRacuna(),getStanjeRacuna());
	}

}
