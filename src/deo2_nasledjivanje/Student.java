package deo2_nasledjivanje;

public class Student extends Osoba{
	
	private int brojIndeksa;
	private double test1;
	private double test2;
	
	public Student() {}
	
	public Student(String ime,String prezime,int starost,int brojIndeksa,double test1,double test2) {
		super(ime,prezime,starost);
		setBrojIndeksa(brojIndeksa);
		setTest1(test1);
		setTest2(test2);
	}
	
	public int getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public double getTest1() {
		return test1;
	}
	public void setTest1(double test1) {
		this.test1 = test1;
	}
	public double getTest2() {
		return test2;
	}
	public void setTest2(double test2) {
		this.test2 = test2;
	}
	
	public double racunajPoene() {
		return (getTest1()+getTest2())/2.0;
	}
	
	public void stampajPoene() {
		System.out.printf("%s %s na testovima ima prosek %.2f poena.\n",getIme(),getPrezime(),racunajPoene());
	}

}
