package Practice;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class test1 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		//char c=65;
		
		//System.out.println(c);
		
		//System.out.println(args[1]+args[2]+args[3]);
		
		/*
		 * String x="abc"; String y= "abc";
		 * 
		 * x.concat(y);
		 * 
		 * System.out.println(x.concat(y));
		 */
		
		int temp =0;
		for(int l=1;l<=10;l++) {
			
			temp=temp+l;
			
			temp+=l;
			System.out.println(temp);
			
			
			
		}

	}

}
