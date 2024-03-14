package Practice;

import java.util.ArrayList;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Anagram {
	
	public static boolean isAnagram(String input1,String input2) {
		
		
		String input1ref= input1;
		String input2ref= input2;
		int count =0;
		for(int i=0;i<=input1ref.length()-1;i++) {
			
			//System.out.println(input1ref.charAt(i));
			
			char ref1=input1ref.charAt(i);
			
			System.out.println(ref1);
			
			ArrayList<String> list = new ArrayList<String>();
			
			
			
			
	
		
			
			
		
		 
		}
		
		
		
		System.out.println(input1ref.length());
		
		System.out.println("Occurance " + count);
		
		return false;
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Anagram angrm=new Anagram();
		
		
		angrm.isAnagram("Stop", "Post");
		
		
		
		
	}

}
