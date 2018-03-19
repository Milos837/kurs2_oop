package deo3_sastavljanje;

public class Motor {
	
	private boolean radi;
	private String tip;
	private int snaga;
	private int kubikaza;
	
	public Motor() {}
	
	public Motor(boolean radi, String tip, int snaga, int kubikaza) {
		setRadi(radi);
		setTip(tip);
		setSnaga(snaga);
		setKubikaza(kubikaza);
	}

	public boolean isRadi() {
		return radi;
	}

	public void setRadi(boolean radi) {
		this.radi = radi;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	
	public void ukljuci() {
		setRadi(true);
	}
	
	public void iskljuci() {
		setRadi(false);
	}
 
}
