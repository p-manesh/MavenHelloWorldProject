package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		Student s = new Student();
		s.setName("Danielle");
		String name = s.getName();
		System.out.println(name);
		
    }
	
   	
}


