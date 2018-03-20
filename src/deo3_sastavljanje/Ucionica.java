package deo3_sastavljanje;

public class Ucionica {
	
	private int brojUcionice;
	private int sprat;
	private int brojMesta;
	private int brojRacunara;
	private boolean imaProjektor;
	public Racunar[] r;
	
	public Ucionica() {
		this.r = new Racunar[20];
	}
	
	public Ucionica(int brojUcionice, int sprat, int brojMesta, int brojRacunara, boolean imaProjektor) {
		this.r = new Racunar[brojRacunara];
		setBrojUcionice(brojUcionice);
		setSprat(sprat);
		setBrojMesta(brojMesta);
		setBrojRacunara(brojRacunara);
		setImaProjektor(imaProjektor);
	}
	
	public int getBrojUcionice() {
		return brojUcionice;
	}
	public void setBrojUcionice(int brojUcionice) {
		this.brojUcionice = brojUcionice;
	}
	public int getBrojMesta() {
		return brojMesta;
	}
	public void setBrojMesta(int brojMesta) {
		this.brojMesta = brojMesta;
	}
	public int getBrojRacunara() {
		return brojRacunara;
	}
	public void setBrojRacunara(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}
	public int getSprat() {
		return sprat;
	}
	public void setSprat(int sprat) {
		this.sprat = sprat;
	}
	public boolean isImaProjektor() {
		return imaProjektor;
	}
	public void setImaProjektor(boolean imaProjektor) {
		this.imaProjektor = imaProjektor;
	}
	
	public void postaviRacunar(Racunar racunar) {
		if(getBrojRacunara() != 0) {
		for(int i=0; i<getBrojRacunara(); i++) {
			this.r[i] = racunar;
		}
		} else {
			System.out.println("Greska: nemoguce dodati racunar.");
		}
	}
	
	public Racunar getR(int i) {
		return r[i];
	}
	
	public void stampajPodatke() {
		System.out.printf("Ucionica broj %d, sprat %d, broj mesta: %d, broj racunara: %d, ima projektor: %b.\n"
											,getBrojUcionice(),getSprat(),getBrojMesta(),getBrojRacunara(),isImaProjektor());
	}
	
	public void stampajRacunare() {
		System.out.printf("Ucionici broj %d pripadaju sledeci racunari:\n",getBrojUcionice());
		for (int i=0; i<getBrojRacunara(); i++) {
			System.out.printf("%d: ",i+1);
			this.getR(i).stampajPodatke();
		}
	}
	
	
	

}
