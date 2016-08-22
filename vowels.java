package d;

import java.util.Scanner;

public class vowels {
	
	
	public static void main(String args[])
	
	{
		char c;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the character");
		
		 c=s.next().charAt(0);
		
		
		
		if(c =='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			
			
		{
			System.out.println( "This is a vowel");
			
		}
		
		else
			
		{
			
			System.out.println( "This is a consonants");
			
			
			
		}
		
		
	}

}
