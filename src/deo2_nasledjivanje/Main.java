package deo2_nasledjivanje;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Zaposleni z1 = new Zaposleni("Milos","Tepic",26,50);
		z1.stampajPlatu(22);
		*/
		/*
		Student s1 = new Student("Milos","Tepic",26,137,85,95);
		s1.stampajPoene();
		*/
		/*
		Klijent k1 = new Klijent("Milos","Tepic",26,"Ulica","019230913",821309);
		Klijent k2 = new Klijent("Bojan","Tepic",23,"Ulica","245330913",821310);
		
		k1.setStanjeRacuna(5000);
		k2.setStanjeRacuna(15000);
		
		k1.stampajPodatke();
		k2.stampajPodatke();
		
		k1.transferStanja(k2, 7000);
		
		k1.stampajPodatke();
		k2.stampajPodatke();
		*/
		
		/*
		Osoba o1 = new Osoba("Milos","Tepic",26);
		Osoba o2 = new Osoba("Bojan","Tepic",23);
		
		Automobil a1 = new Automobil("Peugeot","206",2004,"NS-928391",o1,4);
		
		a1.stampajPodatke();
		
		a1.prenosVlasnistva(o2);
		
		a1.stampajPodatke();
		*/
		
		Kvadrat k1 = new Kvadrat("bela",4);
		
		k1.stampajPodatke();
		
		k1.racunajPovrsinu();
		
		k1.stampajPodatke();
		
		Krug k2 = new Krug("crvena",20);
		
		k2.stampajPodatke();
		
		k2.racunajPovrsinu();
		
		k2.stampajPodatke();
		
	}

}
