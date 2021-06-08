package javaeight;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Soting {

	public static void main(String[] args) {
		
		  ArrayList<Customer> al=new ArrayList<>();
		  al.add(new Customer(1, "ASDF"));
		  al.add(new Customer(3, "XYS")); 
		  al.add(new Customer(2, "BSsDF"));
		  al.add(new  Customer(6, "CDSA"));
		  ArrayList<Customer> al2=(ArrayList<Customer>)
		  al.stream(). sorted(Comparator.comparing(Customer::getName).reversed())
		  .collect(Collectors.toList()); System.out.println(al2);
		 
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101, "ASDF");
		map.put(104, "SDF");
		map.put(109, "XHD");
		Map<Object, Object> maps=map.entrySet().stream().filter(e->e.getKey().intValue()>104)
				.collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
		System.out.println(maps);
		

		 //System.out.println(s)
	}

}
