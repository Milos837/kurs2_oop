package matematika;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class KvadratnaFunkcija implements Funkcija{
	
	private double a;
	private double b;
	private double c;
	private double x1 = 0;
	private double x2 = 0;


	public void ucitajParametre(BufferedReader parametri) throws IllegalArgumentException{
		try {
			a = Double.parseDouble(parametri.readLine());
			b = Double.parseDouble(parametri.readLine());
			c = Double.parseDouble(parametri.readLine());
			if(a == 0) {
				throw new IllegalArgumentException("Kvadratna funkcija: A mora biti razlicito od nule.");
			}	
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public double racunajTacku(double x) {
		return a*x*x+b*x+c;
	}

	public boolean realneNule() {
		double d = b*b - 4*a*c;
		if(d >= 0) {
			return true;
		} else {
		return false;
		}
	}


	public void ispisiNule(FileWriter nule) {
		if(realneNule()) {
			x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        	x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        	try {
        		nule.write(new Double(x1).toString());
        		nule.write("\r\n");							//nova linija (za linux ide samo \n )
        		nule.write(new Double(x2).toString());
        	}
        	catch(IOException e) {
        		System.out.println(e.getMessage());
        	}
		} else {
			try {
				nule.write("Funkcija nema realne nule!");
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}


}
