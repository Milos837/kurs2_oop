package deo4_polimorfizam;

public class Zaposleni extends Osoba{

	
	private double koefRadnogMesta;
	//private double plata;
	
	public Zaposleni() {}
	
	public Zaposleni(String ime, String prezime,int starost, double koefRadnogMesta) {
		super(ime,prezime,starost);
		this.koefRadnogMesta = koefRadnogMesta;
	}
	
	
	public void setKoeficijent(double koefRadnogMesta) {
		this.koefRadnogMesta = koefRadnogMesta;
	}
	
	
	public double getKoeficijent() {
		return this.koefRadnogMesta;
	}
	
	public double racunajPlatu(int brojRadnihDana) {
		return getKoeficijent()*brojRadnihDana*100;
	}
	
	public void stampajPlatu(int brojRadnihDana) {
		System.out.printf("%s %s ima koeficijent %.2f,",getIme(),getPrezime(),getKoeficijent());
		System.out.printf(" i plata iznosi %.2f dinara.\n",racunajPlatu(brojRadnihDana));
	}
	
}
