package deo4_polimorfizam;

public class Nastavnik extends Zaposleni{
	
	private String zvanje;
	private int brojSCIRadova;
	
	public Nastavnik() {}
	
	public Nastavnik(String ime, String prezime, int starost,String zvanje, int brojSCIRadova, double koefRadnogMesta) {
		super(ime,prezime,starost,koefRadnogMesta);
		setZvanje(zvanje);
		setBrojSCIRadova(brojSCIRadova);
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public int getBrojSCIRadova() {
		return brojSCIRadova;
	}

	public void setBrojSCIRadova(int brojSCIRadova) {
		this.brojSCIRadova = brojSCIRadova;
	}
	
	public double racunajPlatu() {
		return 60000 + this.brojSCIRadova*3000;
	}
	
	public void predstaviSe() {
		System.out.println(this.getIme() + " " + this.getPrezime() 
							+ ", zvanje: " + this.getZvanje() 
							+ ", broj naucnih radova: " 
							+ this.getBrojSCIRadova());
	}

}
