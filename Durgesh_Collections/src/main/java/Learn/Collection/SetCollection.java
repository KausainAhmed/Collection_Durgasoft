package Learn.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {
public static void main(String[] args) {
	//uses collection methods 
	//no duplicacy and no Insertion Order
	HashSet<Double> hs=new HashSet<>();
	//automatic autoBoxing and unBoxing
	hs.add(2.3);
	hs.add(3.56);
	hs.add(new Double(1.56)); 
	hs.add(12.22);
	System.out.println("HashSet=  "+hs);
	
	TreeSet<Double> ts=new TreeSet<>();
	ts.addAll(hs);
	System.out.println("TreeSet=  "+ts);
}
}
