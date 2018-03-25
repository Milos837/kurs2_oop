package zaposleni;

public abstract class Radnik {
	
	protected String ime;
	protected String prezime;
	protected String JMBG;
	protected String brojRacuna;
	protected double koefStrucneSpreme;
	
	
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
	public String getJMBG() {
		return JMBG;
	}
	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}
	public String getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public double getKoefStrucneSpreme() {
		return koefStrucneSpreme;
	}
	public void setKoefStrucneSpreme(double koefStrucneSpreme) {
		this.koefStrucneSpreme = koefStrucneSpreme;
	}
	
	

}
