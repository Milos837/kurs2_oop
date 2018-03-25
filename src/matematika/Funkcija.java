package matematika;

import java.io.BufferedReader;
import java.io.FileWriter;

public interface Funkcija {
	
	void ucitajParametre(BufferedReader parametri);
	
	double racunajTacku(double x);
	
	boolean realneNule();
	
	void ispisiNule(FileWriter nule);


}
