package deo2_nasledjivanje;

public class Krug extends Oblik{
	
	private double poluprecnik;
	
	public Krug() {}
	
	public Krug(String boja,double poluprecnik) {
		//Tip i broj strana sam direktno prosledio konstruktoru nadklase
		//posto nema potrebe da se unosi pri kreiranju objekta
		super(boja,"Krug",0);
		setPoluprecnik(poluprecnik);
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
	
	public void racunajPovrsinu() {
		setPovrsina(Math.PI*poluprecnik*poluprecnik);
	}

}
