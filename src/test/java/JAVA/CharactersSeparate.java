package JAVA;

import java.util.HashMap;

public class CharactersSeparate {
	public static void main(String[] args) {
		
		String str="cccc0ddEEECCABA";

		char [] strArr= str.toCharArray();

		HashMap<Character, Integer> map=new HashMap<>();

		for(int i=0; i<strArr.length; i++)

		{

		if(map.get(strArr[i])==null)
		{
			
		map.put(strArr[i], 1);

	}
		else

	{	
		System.out.println("Hi2");
		int count=map.get(strArr[i]);

		map.put(strArr[1], ++count);
		}
		

	}
		System.out.println(map);

}
}
