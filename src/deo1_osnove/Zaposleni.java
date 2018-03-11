package deo1_osnove;

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
		return this.koefRadnogMesta*brojRadnihDana*100;
	}
	
	public void stampajPlatu(int brojRadnihDana) {
		System.out.printf("%s %s ima koeficijent %.2f,",ime,prezime,koefRadnogMesta);
		System.out.printf(" i plata iznosi %.2f dinara.\n",this.racunajPlatu(brojRadnihDana));
	}
	
}
