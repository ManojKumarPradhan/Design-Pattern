package com.bigob.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());
			if(iterator.next().equals(3)){
				iterator.remove();
			}
		}
		System.out.println(list);
		//Sometime it the operation is not supported it will throw UnSupportedException
		System.out.println("Iterator has 3 methods"
				+ "\n 1. hasNext() it will return a boolean value "
				+ "\n 2. next() it will return the type of generics"
				+ "\n 3. remove() it will remove the current element"
				+ "\n\n It is improvised version of Enumeration");
	}
}
