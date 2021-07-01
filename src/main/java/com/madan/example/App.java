package com.madan.example;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void addData(String data) {
		if (data.equals(Constants.DATA_TYPE)) {
			System.out.println("Welcome " + data);
		}
	}
	
	public void addMethod() {
		System.out.println("Welcome ");
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
