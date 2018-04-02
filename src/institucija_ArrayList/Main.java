package institucija_ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Ucionica u1 = new Ucionica(107,1,15,15,true);
		
		Racunar racTip1 = new Racunar("i7-7700k",16,1000);
		
		u1.postaviRacunar(racTip1);
		u1.r[0].stampajPodatke();
		*/
		
		Institucija i1 = new Institucija("FTN","Ulica br 1",65445,"Nauka",3, 2);
		
		i1.postaviUcionicu(101, 1, 15, 15, true);
		i1.postaviUcionicu(102, 1, 10, 10, false);
		i1.postaviUcionicu(103, 1, 15, 0, true);
		
		Racunar rTip1 = new Racunar("i7-8700k",16,1000);
		Racunar rTip2 = new Racunar("i5-6500",8,500);
		
		i1.getU(0).postaviRacunar(rTip1);
		i1.getU(1).postaviRacunar(rTip2);
		
		
		i1.postaviZaposlenog("Pera", "Peric", 30, "Asistent", 500);
		i1.postaviZaposlenog("Ana", "Ivanovic", 28, "Profesor", 600);
		
		
		i1.stampajUcionice();
		i1.stampajZaposlene();
		i1.getU(0).stampajRacunare();
		i1.getU(1).stampajRacunare();
	}

}
