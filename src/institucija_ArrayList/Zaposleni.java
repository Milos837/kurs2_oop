package institucija_ArrayList;

public class Zaposleni extends Osoba{
	
	private String radnoMesto;
	private double koefRadnogMesta;
	
	public Zaposleni() {}
	
	public Zaposleni(String ime, String prezime, int starost, String radnoMesto, double koefRadnogMesta) {
		super(ime,prezime,starost);
		setRadnoMesto(radnoMesto);
		setKoefRadnogMesta(koefRadnogMesta);
	}
	
	public String getRadnoMesto() {
		return radnoMesto;
	}
	public void setRadnoMesto(String radnoMesto) {
		this.radnoMesto = radnoMesto;
	}
	public double getKoefRadnogMesta() {
		return koefRadnogMesta;
	}
	public void setKoefRadnogMesta(double koefRadnogMesta) {
		this.koefRadnogMesta = koefRadnogMesta;
	}
	
	public void stampajPodatke() {
		System.out.printf("Ime i prezime: %s %s, radno mesto: %s.\n",getIme(),getPrezime(),getRadnoMesto());
	}
	
	

}
