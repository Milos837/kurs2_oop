package matematika;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Funkcija f1 = new LinearnaFunkcija();
		Funkcija f2 = new KvadratnaFunkcija();
		
		FileReader ulaz1 = null;
		BufferedReader bufUlaz1 = null;
		FileWriter izlaz1 = null;
		//BufferedWriter bufIzlaz1 = null;
		
		FileReader ulaz2 = null;
		BufferedReader bufUlaz2 = null;
		FileWriter izlaz2 = null;
		//BufferedWriter bufIzlaz2 = null;
		
		try {
			ulaz1 = new FileReader("funkcija1.txt");
			bufUlaz1 = new BufferedReader(ulaz1);
			izlaz1 = new FileWriter("nule1.txt");
			//bufIzlaz1 = new BufferedWriter(izlaz1);
			
			ulaz2 = new FileReader("funkcija2.txt");
			bufUlaz2 = new BufferedReader(ulaz2);
			izlaz2 = new FileWriter("nule2.txt");
			//bufIzlaz2 = new BufferedWriter(izlaz2);
			
			f1.ucitajParametre(bufUlaz1);
			f2.ucitajParametre(bufUlaz2);
			
			f1.ispisiNule(izlaz1);
			f2.ispisiNule(izlaz2);
			
			System.out.println("Program je gotov.");
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(ulaz1 != null) {
				ulaz1.close();
			}
			if(ulaz2 != null) {
				ulaz2.close();
			}
			if(bufUlaz1 != null) {
				bufUlaz1.close();
			}
			if(bufUlaz2 != null) {
				bufUlaz2.close();
			}
			if(izlaz1 != null) {
				izlaz1.close();
			}
			if(izlaz2 != null) {
				izlaz2.close();
			}/*
			if(bufIzlaz1 != null) {
				bufIzlaz1.close();
			}
			if(bufIzlaz2 != null) {
				bufIzlaz2.close();
			}*/
		}

	}

}
