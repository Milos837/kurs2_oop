package deo3_sastavljanje;

public class Racunar {
	
	private String procesor;
	private int ram;
	private int hdd;
	
	public Racunar() {}
	
	public Racunar(String procesor, int ram, int hdd) {
		setProcesor(procesor);
		setRam(ram);
		setHdd(hdd);
	}
	
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	public void stampajPodatke() {
		System.out.printf("Procesor: %s, ram: %dGB, hdd: %dGB.\n",getProcesor(),getRam(),getHdd());
	}
	

}
