package deo8_arrayList;

public class Osoba {
	
	protected String ime, prezime;
	//protected int starost;
	protected String jmbg;
	
	public Osoba() {}
	
	public Osoba(String ime, String prezime, String jmbg) {
		setIme(ime);
		setPrezime(prezime);
		//setStarost(starost);
		setJmbg(jmbg);
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
	/*
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	*/
	public void predstaviSe() {
		System.out.println(this.getIme() + " " + this.getPrezime());
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	@Override
	public String toString() {
		return (this.getIme() + " " + this.getPrezime() + ", " + this.getJmbg());
	}

}
