package deo1_osnove;

public class Valjak {
	
	float r;
	float H;
	
	Valjak() {}
	
	Valjak(float r, float H) {
		this.r = r;
		this.H = H;
	}
	
	void stampajPodatke() {
		System.out.println("Poluprecnik je " + r + " a visina " + H);
	}
	
	void unesiPoluprecnik(float r1) {
		r = r1;
	}
	
	void unesiVisinu(float H1) {
		H = H1;
	}
	
	float vratiPoluprecnik() {
		return r;
	}
	
	float vratiVisinu() {
		return H;
	}

}
