package deo1_osnove;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zaposleni z1 = new Zaposleni("Milos","Tepic",26,50);
		z1.stampajPlatu(22);
		
		
		
		/*
		Vozilo v1 = new Vozilo("Peugeot","206", 2004,"NS-123456",150,55);
		Vozilo v2 = new Vozilo("Peugeot","406", 2002,"NS-223456",190,75);
		
		v1.stampajPodatke();
		v2.stampajPodatke();
		
		v1.porediVozila(v2);
		*/
		/*
		Zaposleni z1 = new Zaposleni("Pera","Peric",5.2);
		Zaposleni z2 = new Zaposleni("Ana","Jovic",6.2);
		Zaposleni z3 = new Zaposleni("Jovan","Jovanovic",7.2);
		
		z1.stampajPlatu(22);
		z2.stampajPlatu(24);
		z3.stampajPlatu(19);
		*/
		
		/*
		Student prvi = new Student("Milos","Tepic",78,98);
		prvi.stampajUspeh();
		*/
		
		/*
		Valjak v = new Valjak(2.0f,200.0f);
		
		v.stampajPodatke();
		*/
		/*
		Racunar r1 = new Racunar();
		Racunar r2 = new Racunar();
		Racunar r3 = new Racunar();
		
		r1.postaviProcesor("i5-2540M");
		r1.postaviRadniTakt(2.6);
		r1.postaviMemoriju(6);
		
		r2.postaviProcesor("i5-3470");
		r2.postaviRadniTakt(3.2);
		r2.postaviMemoriju(8);
		
		r3.postaviProcesor("Exynos 7880");
		r3.postaviRadniTakt(1.87);
		r3.postaviMemoriju(3);
		
		Racunar[] niz = new Racunar[3];
		
		niz[0]=r1;
		niz[1]=r2;
		niz[2]=r3;
		
		for(int i=0;i<niz.length-1; i++) {
			for(int j=0; j<niz.length-i-1; j++) {
				if(niz[j].racunajPerformanse() < niz[j+1].racunajPerformanse()) {
					Racunar temp=niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;	
				}
			}
		}
		
		
		for(int i=0; i<niz.length; i++) {
			niz[i].stampajPerformanse();
		}
		*/
		
		/*
		Zaposleni z1 = new Zaposleni();
		Zaposleni z2 = new Zaposleni();
		Zaposleni z3 = new Zaposleni();
		
		z1.postaviIme("Pera");
		z1.postaviPrezime("Peric");
		z1.postaviKoeficijent(2.5);
		
		z2.postaviIme("Ana");
		z2.postaviPrezime("Jovic");
		z2.postaviKoeficijent(3.5);
		
		z3.postaviIme("Novak");
		z3.postaviPrezime("Novakovic");
		z3.postaviKoeficijent(4.5);
		
		z1.stampajPlatu();
		z2.stampajPlatu();
		z3.stampajPlatu();
		*/
		/*
		Student m = new Student();
		
		m.postaviIme("Milos");
		m.postaviPrezime("Tepic");
		m.unesiPoeneTest1(80);
		m.unesiPoeneTest2(100);
		m.prosekPoena();
		m.stampajUspeh();
		*/
	}

}