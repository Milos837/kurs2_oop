package deo1_osnove;

public class Student {

	private String ime;
	private String prezime;
	private int brPoenaTest1;
	private int brPoenaTest2;
	private double prosekPoena;
	
	public Student() {}
	
	public Student(String ime, String prezime, int brPoenaTest1, int brPoenaTest2) {
		this.ime = ime;
		this.prezime = prezime;
		this.brPoenaTest1 = brPoenaTest1;
		this.brPoenaTest2 = brPoenaTest2;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getPrezime() {
		return this.prezime;
	}
	
	public void setPoeneTest1(int brPoenaTest1) {
		this.brPoenaTest1 = brPoenaTest1;
	}
	
	public int getPoeneTest1() {
		return this.brPoenaTest1;
	}
	
	public void setPoeneTest2(int brPoenaTest2) {
		this.brPoenaTest2 = brPoenaTest2;
	}
	
	public int getPoeneTest2() {
		return this.brPoenaTest2;
	}
	
	public double prosekPoena() {
		prosekPoena = (brPoenaTest1 + brPoenaTest2)/2.0;
		return prosekPoena;
	}
	
	public void stampajUspeh() {
		System.out.println("Prosecan broj poena ostvaren na testovima iznosi " + this.prosekPoena());
	}
}
