package deo7_fajlovi;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vezba {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileReader ulaz = null;
		
		try {
			ulaz = new FileReader("spisak.txt");
			
			Scanner s = new Scanner(ulaz);
			while (s.hasNextLine()) {
			System.out.println(s.nextLine());
			}
			s.close();
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(ulaz != null) {
				ulaz.close();
			}
		}

	}

}
