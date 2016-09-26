package net.ukr.geka3;

import java.util.Comparator;

public class LetterComparator implements Comparator<MyChar>{

	@Override
	public int compare(MyChar o1, MyChar o2) {
		if(o1.getCount() < o2.getCount()){
			return 1;
		}
		if(o1.getCount() > o2.getCount()){
			return -1;
		}
		// TODO Auto-generated method stub
		return 0;
	}

	
}
