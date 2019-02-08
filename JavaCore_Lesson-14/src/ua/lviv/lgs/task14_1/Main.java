package ua.lviv.lgs.task14_1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<ArbitrarilyClass> ac = new HashSet<ArbitrarilyClass>();
		ac.add(new ArbitrarilyClass("String1", 25));
		ac.add(new ArbitrarilyClass("String4", 44));
		ac.add(new ArbitrarilyClass("String3", 12));
		ac.add(new ArbitrarilyClass("String2", 57));
		ac.add(new ArbitrarilyClass("String5", 94));

		System.out.println("HashSet выводит элементы в случайном порядке");
		for (ArbitrarilyClass arbitrarilyClassItem : ac) {
			System.out.println(arbitrarilyClassItem);
		}

		Set<ArbitrarilyClass> ac1 = new LinkedHashSet<ArbitrarilyClass>();
		ac1.add(new ArbitrarilyClass("String1", 25));
		ac1.add(new ArbitrarilyClass("String4", 44));
		ac1.add(new ArbitrarilyClass("String3", 12));
		ac1.add(new ArbitrarilyClass("String2", 57));
		ac1.add(new ArbitrarilyClass("String5", 94));

		System.out.println();
		System.out.println("LinkedHashSet выводит элементы в порядке их добавления");
		for (ArbitrarilyClass arbitrarilyClassItem : ac1) {
			System.out.println(arbitrarilyClassItem);
		}

		Set<ArbitrarilyClass> ac2 = new TreeSet<ArbitrarilyClass>();
		ac2.add(new ArbitrarilyClass("String1", 25));
		ac2.add(new ArbitrarilyClass("String4", 44));
		ac2.add(new ArbitrarilyClass("String3", 12));
		ac2.add(new ArbitrarilyClass("String2", 57));
		ac2.add(new ArbitrarilyClass("String5", 94));

		System.out.println();
		System.out.println("TreeSet выводит элементы в порядке, переопределенном в Comparable (по умолчанию)");
		for (ArbitrarilyClass arbitrarilyClassItem : ac2) {
			System.out.println(arbitrarilyClassItem);
		}

		Set<ArbitrarilyClass> ac3 = new TreeSet<ArbitrarilyClass>(new ArbitrarilyClassIntegerComparator());
		ac3.add(new ArbitrarilyClass("String1", 25));
		ac3.add(new ArbitrarilyClass("String4", 44));
		ac3.add(new ArbitrarilyClass("String3", 12));
		ac3.add(new ArbitrarilyClass("String2", 57));
		ac3.add(new ArbitrarilyClass("String5", 94));

		System.out.println();
		System.out.println("TreeSet выводит элементы в порядке, переопределенном в Comparator");
		for (ArbitrarilyClass arbitrarilyClassItem : ac3) {
			System.out.println(arbitrarilyClassItem);
		}
	}

}