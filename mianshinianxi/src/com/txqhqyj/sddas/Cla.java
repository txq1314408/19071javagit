package com.txqhqyj.sddas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Cla {
	public static void main(String[] args) {
		User u1=new User("zhangsan", 30);
		User u2=new User("tang",25);
		User u3=new User("huang",35);
		User u4=new User("huang",40);
		User u5=new User("huang",20);
		User u6=new User("huang",18);
		
		HashMap<Integer, User> map1=new HashMap<Integer, User>();
		map1.put(1,u1);
		map1.put(2,u2);
		map1.put(3,u3);
		map1.put(4,u4);
		map1.put(5,u5);
		map1.put(6,u6);
		System.out.println(paiXun(map1));
		
        
	}
	public static HashMap<Integer, User> paiXun(HashMap<Integer, User> map1){
		Set<Map.Entry<Integer, User>> set1=map1.entrySet();
		
		List<Entry<Integer, User>> list=new ArrayList<Entry<Integer,User>>(set1);
		Collections.sort(list,new Comparator<Entry<Integer, User>>() {

			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
			   
				return o1.getValue().getAge()-o2.getValue().getAge();
			}
		});
		
		LinkedHashMap<Integer, User> map=new LinkedHashMap<Integer, User>();
		for(Entry<Integer, User> sdsd:list) {
			map.put(sdsd.getKey(),sdsd.getValue());
			
			
			
		}
		
		
	
		return map;
		
		
	}


}
