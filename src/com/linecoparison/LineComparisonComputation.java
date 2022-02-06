  package com.linecoparison;
  
    import java.util.Scanner;
    
    
      public class LineComparisonComputation {
 
	      public static void main(String[] args) {
		     
	    	  Scanner sc = new Scanner(System.in);
                
	    	        System.out.println("Enter the Co-ordinates of x1 , x2 and y1, y2 : ");
	    	  
	                      int x1 = sc.nextInt();
	                      int y1 = sc.nextInt();
	                      int x2 = sc.nextInt();
	                      int y2 = sc.nextInt();
	        
	        double len= Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
	                 System.out.println("Length of the given Line is : " + len + "units" );
	 }

 }
