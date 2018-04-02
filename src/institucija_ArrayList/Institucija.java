package institucija_ArrayList;

import java.util.ArrayList;

public class Institucija {
	
	private String naziv;
	private String adresa;
	private int pib;
	private String delatnost;
	private int brojUcionica;
	private int brojZaposlenih;
	private ArrayList<Ucionica> u;
	private ArrayList<Zaposleni> z;
	
	public Institucija() {
		u = new ArrayList<Ucionica>();
		z = new ArrayList<Zaposleni>();
	}
	
	public Institucija(String naziv, String adresa, int pib, String delatnost, int brojUcionica, int brojZaposlenih) {
		u = new ArrayList<Ucionica>();
		z = new ArrayList<Zaposleni>();
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
		if(u.size() < getBrojUcionica()) {
			u.add(new Ucionica(brojUcionice, sprat, brojMesta, brojRacunara, imaProjektor));
		} else {
			System.out.println("Greska: nemoguce dodati novu ucionicu.");
		}
	}

	public Ucionica getU(int i) {
		return u.get(i);
	}
	
	public void postaviZaposlenog(String ime, String prezime, int starost, String radnoMesto, double koefRadnogMesta) {
		if(z.size() < getBrojZaposlenih()) {
			z.add(new Zaposleni(ime, prezime, starost, radnoMesto, koefRadnogMesta));
		} else {
			System.out.println("Greska: nemoguce dodati novog zaposlenog.");
		}		
	}
	
	public Zaposleni getZ(int i) {
		return z.get(i);
	}
	
	public void stampajPodatke() {
		System.out.printf("Naziv: %s, adresa: %s, PIB: %d, delatnost: %s, broj ucionica: %d, broj zaposlenih: %d.\n"
				,getNaziv(),getAdresa(),getPib(),getDelatnost(),getBrojUcionica(),getBrojZaposlenih());
	}
	
	public void stampajUcionice() {
		System.out.printf("Instituciji %s pripadaju sledece ucionice:\n",getNaziv());
		for (int i=0; i<u.size(); i++) {
			System.out.printf("%d: ",i+1);
			this.getU(i).stampajPodatke();
		}
	}
	
	public void stampajZaposlene() {
		System.out.printf("Instituciji %s pripadaju sledeci zaposleni:\n",getNaziv());
		for (int i=0; i<z.size(); i++) {
			System.out.printf("%d: ",i+1);
			this.getZ(i).stampajPodatke();
		}
	}

}
