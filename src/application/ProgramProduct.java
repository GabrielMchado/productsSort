package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//import entities.MyComparator;
import entities.Products;

public class ProgramProduct {

	public static void main(String[] args) {

		List<Products> list = new ArrayList<Products>();
		
		list.add(new Products("TV", 900.0));
		list.add(new Products("Notebook", 1200.0));
		list.add(new Products("Tablet", 450.0));

		Comparator<Products> comp = (o1, o2) -> {
			return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
		};
		
		list.sort(comp);
		
		for(Products p : list) {
			System.out.println(p);
		}
		
	}

}
