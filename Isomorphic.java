package guvi;

import java.util.HashMap;

public class Isomorphic {
	
	public static boolean isIsomorphic(String string1,String string2){
		HashMap<Character, Character> map = new HashMap<>();
		if(string1.length()!=string2.length()){
           return false;
		}else{
			map.put(string1.charAt(0), string2.charAt(0));
			
			for(int i=1;i<string1.length();i++){
				if(!map.containsKey(string1.charAt(i))){
                   map.putIfAbsent(string1.charAt(i), string2.charAt(i));                  
				}else{
					if(map.get(string1.charAt(i))!=string2.charAt(i)){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception{
		java.io.BufferedReader read = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println(Isomorphic.isIsomorphic(read.readLine().toString().trim(), read.readLine().toString().trim())); 
	}
}
