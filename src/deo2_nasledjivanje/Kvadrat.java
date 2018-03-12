package deo2_nasledjivanje;

public class Kvadrat extends Oblik{
	
	private double duzinaStranice;
	
	public Kvadrat() {}
	
	public Kvadrat(String boja,double duzinaStranice) {
		super(boja,"Kvadrat",4);
		setDuzinaStranice(duzinaStranice);
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
	
	public void racunajPovrsinu() {
		setPovrsina(duzinaStranice*duzinaStranice);
	}

}
