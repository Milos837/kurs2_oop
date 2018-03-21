package deo5_interfejsi;

public class Krug extends Oblik implements Figura{
	
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
	
	public double racunajPovrsinu() {
		return povrsina = Math.PI*poluprecnik*poluprecnik;
	}
	
	public double racunajObim() {
		return 2*this.poluprecnik*Math.PI;
	}

}
