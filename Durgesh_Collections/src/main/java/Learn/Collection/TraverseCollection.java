package Learn.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TraverseCollection {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Surya");
		al.add("Nihal");
		al.add("Kausain");
		al.add("Akib");
		System.out.println("Array List = " + al);
		System.out.println();
		// using for each loop
		System.out.println("-------------------For-Each Iteration---------------------");
		for (String name : al) {
			System.out.println(name + "\t" + name.length()); }

			System.out.println("------------------------Iterator------------------");

			Iterator<String> itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next() );
			}
			
			System.out.println("------------List Iterator-------------------");
			//backward iteration
			//we passed al.size to make cursor forward to move it backward
			ListIterator<String> listItr = al.listIterator(al.size());
			while(listItr.hasPrevious()) {
				System.out.println(listItr.previous());
			}
			
			System.out.println("------------------Enumeration--------------------");
			Vector<String> v=new Vector<>();
			v.addAll(al);
			System.out.println(v);
			Enumeration<String> vi = v.elements();
			while(vi.hasMoreElements()) {
				System.out.println(vi.nextElement());
			}
			
			System.out.println("-----------------ForEach(Java8)------------------");
			al.forEach(e->{
				System.out.println(e);
			});
		}
	}

