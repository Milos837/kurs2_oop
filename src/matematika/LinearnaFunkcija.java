package matematika;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;


public class LinearnaFunkcija implements Funkcija{
	
	private double a;
	private double b;
	private double nula;

	
	public void ucitajParametre(BufferedReader parametri) throws IllegalArgumentException{
		try {
			a = Double.parseDouble(parametri.readLine());
			b = Double.parseDouble(parametri.readLine());			
			if(a == 0) {
				throw new IllegalArgumentException("Linearna funkcija: A mora biti razlicito od nule.");
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}

	public double racunajTacku(double x) {	
		return a*x+b;
	}
	
	public boolean realneNule() {
		return true;
	}

	public void ispisiNule(FileWriter nule){
		nula = -b/a;
		try {
			nule.write(new Double(nula).toString());
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}


}
