package deo3_sastavljanje;

public class Institucija {
	
	private String naziv;
	private String adresa;
	private int pib;
	private String delatnost;
	private int brojUcionica;
	private int brojZaposlenih;
	private Ucionica[] u;
	private Zaposleni[] z;
	static int counterU = 0;
	static int counterZ = 0;
	
	public Institucija() {
		this.u = new Ucionica[20];
		this.z = new Zaposleni[20];
	}
	
	public Institucija(String naziv, String adresa, int pib, String delatnost, int brojUcionica, int brojZaposlenih) {
		this.u = new Ucionica[brojUcionica];
		this.z = new Zaposleni[brojZaposlenih];
		setNaziv(naziv);
		setAdresa(adresa);
		setPib(pib);
		setDelatnost(delatnost);
		setBrojUcionica(brojUcionica);
		setBrojZaposlenih(brojZaposlenih);
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getPib() {
		return pib;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	public String getDelatnost() {
		return delatnost;
	}
	public void setDelatnost(String delatnost) {
		this.delatnost = delatnost;
	}

	public int getBrojUcionica() {
		return brojUcionica;
	}

	public void setBrojUcionica(int brojUcionica) {
		this.brojUcionica = brojUcionica;
	}
	
	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}

	public void setBrojZaposlenih(int brojZaposlenih) {
		this.brojZaposlenih = brojZaposlenih;
	}
	
	public void postaviUcionicu(int brojUcionice, int sprat, int brojMesta, int brojRacunara, boolean imaProjektor) {
		if(counterU < getBrojUcionica()) {
			u[counterU] = new Ucionica(brojUcionice, sprat, brojMesta, brojRacunara, imaProjektor);
			counterU++;
		} else {
			System.out.println("Greska: nemoguce dodati novu ucionicu.");
		}
	}

	public Ucionica getU(int i) {
		return u[i];
	}
	
	public void postaviZaposlenog(String ime, String prezime, int starost, String radnoMesto, double koefRadnogMesta) {
		if(counterZ < getBrojZaposlenih()) {
			z[counterZ] = new Zaposleni(ime, prezime, starost, radnoMesto, koefRadnogMesta);
			counterZ++;
		} else {
			System.out.println("Greska: nemoguce dodati novog zaposlenog.");
		}		
	}
	
	public Zaposleni getZ(int i) {
		return z[i];
	}
	
	public void stampajPodatke() {
		System.out.printf("Naziv: %s, adresa: %s, PIB: %d, delatnost: %s, broj ucionica: %d, broj zaposlenih: %d.\n"
				,getNaziv(),getAdresa(),getPib(),getDelatnost(),getBrojUcionica(),getBrojZaposlenih());
	}
	
	public void stampajUcionice() {
		System.out.println("Instituciji pripadaju sledece ucionice:");
		for (int i=0; i<getBrojUcionica(); i++) {
			System.out.printf("%d: ",i+1);
			this.getU(i).stampajPodatke();
		}
	}
	
	public void stampajZaposlene() {
		System.out.println("Instituciji pripadaju sledeci zaposleni:");
		for (int i=0; i<getBrojZaposlenih(); i++) {
			System.out.printf("%d: ",i+1);
			this.getZ(i).stampajPodatke();
		}
	}

}
