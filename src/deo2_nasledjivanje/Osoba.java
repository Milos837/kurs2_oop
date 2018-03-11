package deo2_nasledjivanje;

public class Osoba {
	
	protected String ime, prezime;
	protected int starost;
	
	public Osoba() {}
	
	public Osoba(String ime, String prezime, int starost) {
		setIme(ime);
		setPrezime(prezime);
		setStarost(starost);
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
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	

}
