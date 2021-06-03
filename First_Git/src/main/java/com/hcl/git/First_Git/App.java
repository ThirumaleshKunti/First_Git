package com.hcl.git.First_Git;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int calculateQuantity(int UCP, int quantity){
      return UCP * quantity;   
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World! with first eclipse git project..." );
        System.out.println( "Welcome to first git project with eclipse IDE" );
        
        int qty = calculateQuantity(10,30);
        System.out.println("Calculated Quantity : "+qty);
    }
}
