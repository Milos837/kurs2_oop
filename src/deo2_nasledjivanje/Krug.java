package deo2_nasledjivanje;

public class Krug extends Oblik{
	
	private double poluprecnik;
	
	public Krug() {}
	
	public Krug(String boja,double poluprecnik) {
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
