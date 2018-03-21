package deo5_interfejsi;

public class Kvadrat extends Oblik implements Figura{
	
	private double duzinaStranice;
	
	public Kvadrat() {}
	
	public Kvadrat(String boja,double duzinaStranice) {
		//Tip i broj strana sam direktno prosledio konstruktoru nadklase
		//posto nema potrebe da se unosi pri kreiranju objekta
		super(boja,"Kvadrat",4);			
		setDuzinaStranice(duzinaStranice);
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
	
	public double racunajPovrsinu() {
		return povrsina = duzinaStranice*duzinaStranice;
	}
	
	public double racunajObim() {
		return 4*this.duzinaStranice;
	}

}
