package deo4_polimorfizam;

public class Asistent extends Zaposleni{
	
	private String mentor;
	private int godinaDoktorskihStudija;
	
	public Asistent() {}
	
	public Asistent(String ime, String prezime, int starost,double koefRadnogMesta,String mentor,int godinaDoktorskihStudija) {
		super(ime,prezime,starost,koefRadnogMesta);
		setMentor(mentor);
		setGodinaDoktorskihStudija(godinaDoktorskihStudija);
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public int getGodinaDoktorskihStudija() {
		return godinaDoktorskihStudija;
	}

	public void setGodinaDoktorskihStudija(int godinaDoktorskihStudija) {
		this.godinaDoktorskihStudija = godinaDoktorskihStudija;
	}
	
	public double racunajPlatu() {
		return 40000 + this.godinaDoktorskihStudija*2000;
	}
	
	public void predstaviSe() {
		System.out.println(this.getIme() + " " + this.getPrezime() 
						+ ", mentor: " + this.getMentor() 
						+ ", godina doktorskih studija " 
						+ this.getGodinaDoktorskihStudija());
	}
	

}
