package deo1_osnove;

public class Racunar {
	
	private String procesor;
	private double radniTakt;
	private int kapacitetMemorije;
	
	public Racunar() {}
	
	public Racunar(String procesor, double radniTakt, int kapacitetMemorije) {
		this.procesor = procesor;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
	}
	
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	
	public String getProcesor() {
		return this.procesor;
	}
	
	public void setRadniTakt(double radniTakt) {
		this.radniTakt = radniTakt;
	}
	
	public double getRadniTakt() {
		return this.radniTakt;
	}
	
	public void setMemorija(int kapacitetMemorije) {
		this.kapacitetMemorije = kapacitetMemorije;
	}
	
	public int getMemorija() {
		return this.kapacitetMemorije;
	}
	
	public double racunajPerformanse() {
		return (10 * this.radniTakt + this.kapacitetMemorije);
	}
	
	public void stampajPerformanse() {
		System.out.printf("Racunar sa procesorom %s, radnog takta %.2f GHz",this.procesor,this.radniTakt);
		System.out.printf(" i kapacitetom memorije od %d GB",this.kapacitetMemorije);
		System.out.printf(", ima index performansi %.2f.\n",this.racunajPerformanse());
	}
	
}
