package Learn.Collection;
import java.util.*;
public class ListCollection {
public static void main(String[] args) {
	System.out.println("HEllo World");
	//Order Preserved and duplicates allowed
	ArrayList<String> al=new ArrayList<>();
	al.add("Kausain");
	al.add("Suraj");
	al.add("Nihal");
	al.add("Asad");
	al.add("Asad");
	al.remove(4);
	al.set(3, "T2");
	//al.clear();
	System.out.println("Array List = "+al);
	System.out.println(al.size());
	System.out.println(al.get(2));
	System.out.println(al.contains("Kausain"));
	
	LinkedList<String> ll=new LinkedList<>();
	ll.add("Kausain");
	ll.add("Suraj");
	ll.add("Nihal");
	ll.add("Asad");
	ll.add("Asad");
	ll.remove("Asad");
	System.out.println("Linked List = "+ll);
	System.out.println(al.size());
	System.out.println(al.contains("Kausain"));
	System.out.println(ll.get(2));
	
	Vector<String> v=new Vector<>();
	v.addAll(al);
	System.out.println("Vector = "+v);
}
}
