package deo4_polimorfizam;

public class NenastavniRadnik extends Zaposleni{
	
	private String radnoMesto;
	private int godineStaza;
	
	public NenastavniRadnik() {}
	
	public NenastavniRadnik(String ime, String prezime, int starost,double koefRadnogMesta,String radnoMesto,int godineStaza) {
		super(ime,prezime,starost,koefRadnogMesta);
		setRadnoMesto(radnoMesto);
		setGodineStaza(godineStaza);
	}
	
	public String getRadnoMesto() {
		return radnoMesto;
	}
	public void setRadnoMesto(String radnoMesto) {
		this.radnoMesto = radnoMesto;
	}
	public int getGodineStaza() {
		return godineStaza;
	}
	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}
	
	public double racunajPlatu() {
		return 30000 + this.godineStaza*500;
	}
	
	public void predstaviSe() {
		System.out.println(this.getIme() + " " + this.getPrezime() 
							+ ", radno mesto: " 
							+ this.getRadnoMesto() 
							+ ", godina staza: " 
							+ this.getGodineStaza());
	}
	
	

}
