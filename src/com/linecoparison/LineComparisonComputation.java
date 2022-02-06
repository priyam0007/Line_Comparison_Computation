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
	                      
	        double len1= Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
	                     System.out.println("Length of the given Line is : " + len1 + "units" );
	        
	                System.out.println("Enter the Co-ordinates of p1 , p2 and q1, q2 : ");
	        	    	  
	                      int p1 = sc.nextInt();
	                      int q1 = sc.nextInt();
	                      int p2 = sc.nextInt();
	                      int q2 = sc.nextInt();  
	                      
	        double len2= Math.sqrt((p2 - p1) * (p2 - p1)  +  (q2 - q1) * (q2 - q1));
	                      System.out.println("Length of the given Line is : " + len2 + "units" );
	                 
	                 if (len1 == len2) 
	             	{
	             		System.out.println("Both lines are equale");
	             	}
	             	else
	             	{
	             		System.out.println("Both lines are not equale");	
	             	}
	             		
	 }

 }
