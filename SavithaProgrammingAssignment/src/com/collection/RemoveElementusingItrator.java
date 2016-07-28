package com.collection;

import java.util.ArrayList;
import java.util.Vector;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class RemoveElementusingItrator {
	
	public void removeformItrator()
	{
		ArrayList ls =  new ArrayList();
			ls.add("savitha");
			ls.add("sushmitha");
			ls.add("latha");
			ls.add("ranjitha");
			
			Vector ls1 =  new Vector`1	2Q();
					ls1.add("savi");
					ls1.add("ravi");
					ls1.add("kavi");
					ls1.add("lavi");
					ls1.add("pavi");
					ls.addAll(ls1);
					System.out.println(ls);
					
					
	}
	
	public static void main(String[] args) {

		RemoveElementusingItrator rm= new RemoveElementusingItrator();
		rm.removeformItrator();
		//System.out.println();
		
		
		

	}

}
