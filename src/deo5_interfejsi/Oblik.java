package deo5_interfejsi;

public abstract class Oblik implements Figura{
	
	protected String boja;
	protected String tip;
	protected int brojStrana;
	protected double povrsina;
	
	public Oblik() {}
	
	public Oblik(String boja,String tip,int brojStrana) {
		setBoja(boja);
		setTip(tip);
		setBrojStrana(brojStrana);
		setPovrsina(0);
	}
	
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public int getBrojStrana() {
		return brojStrana;
	}
	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}
	public double getPovrsina() {
		return povrsina;
	}
	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
	
	//public abstract double racunajPovrsinu();
	
	//public abstract double racunajObim();
	
	public void stampajPodatke() {
		System.out.printf("Oblik: %s, boja: %s, broj strana: %s",getTip(),getBoja(),getBrojStrana());
		System.out.printf(", povrsina: %.2f, obim: %.2f.\n",racunajPovrsinu(),racunajObim());
	}
	

}
