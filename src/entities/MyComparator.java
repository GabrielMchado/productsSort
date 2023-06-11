package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Products>{

	@Override
	public int compare(Products o1, Products o2) {
		return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
	}

}
