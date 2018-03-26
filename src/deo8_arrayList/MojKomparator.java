package deo8_arrayList;

import java.util.Comparator;

public class MojKomparator implements Comparator<Osoba> {

	@Override
	public int compare(Osoba o1, Osoba o2) {
		//int i = o1.getJmbg().compareTo(o2.getJmbg());
		int i = o1.getPrezime().compareTo(o2.getPrezime());
		if (i > 0) {
			return -1;
		} else if (i < 0) {
			return 1;
		}
		return 0;
	}

}
