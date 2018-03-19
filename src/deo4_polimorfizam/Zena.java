package deo4_polimorfizam;

public class Zena extends Osoba{
	
	private String devojackoPrezime;
	
	public Zena() {}
	
	public Zena(String ime, String prezime, int starost, String devojackoPrezime) {
		super(ime,prezime,starost);
		setDevojackoPrezime(devojackoPrezime);
	}

	public String getDevojackoPrezime() {
		return devojackoPrezime;
	}

	public void setDevojackoPrezime(String devojackoPrezime) {
		this.devojackoPrezime = devojackoPrezime;
	}
	
	public void predstaviSe() {
		System.out.println(this.getIme() + " " + this.getPrezime() + ", " + this.getDevojackoPrezime());
	}
	
}
