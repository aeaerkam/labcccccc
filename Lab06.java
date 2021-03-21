public class Lab06 
{
    public static void main(String[] args) 
    {
    	//Test PART(a):
    	System.out.println("(A)Power function: using the number 5 ");
    	System.out.println("5^3 = " + power(5, 3));
    	System.out.println("5^5 = " + power(5, 5));
    	System.out.println("5^(-1) = " + power(5, -1));
    	System.out.println("5^(-2) = " + power( 5, -2));
    	
    	//Test PART(b):
    	System.out.println("\n(B)Print Binary repr. of 5: ");
    	printBinary (5);
    	
    	//Test PART(c):
    	System.out.println("\n\n(C)toBinaryString (binary String representation of 5): ");
    	System.out.println (toBinaryString (5));
    	
    	//Test PART(d):
    	System.out.println("\n\n(D) toDecimalInteger: (binary to decimal conversion) ");
		System.out.println(toDecimalInt("101"));
		
    	
    	//Test PART(e):
    	System.out.println("\n\n(E) isInAscendingOrder: ");    	
    	int[] x = {0, 3, 4, 5, 6, 7,9, 10, 9, 6};
    	System.out.println (isInAscendingOrder (x, 0, 4 ));
    	
    }
    
   // PART(a): a recursive method that computes x to the power y for all (positive and negative) values of integer y.
    public static double power(double x, int y)
    {
    	if(y == 0)
    		return 1;
    	
    	else if(y < 0)	
    		return  1 / x * power(x, y + 1);
    		
    	return x * power(x, y - 1);			
    }
    
    // PART(b):  a recursive method that takes a decimal value as an int parameter and prints 
    // out the binary equivalent of it on the console. For example, if your method is passed the integer value 5 (decimal) it should print 101.
    public static void printBinary(int x)
    {
    	if(x <= 1)
    	{
    		System.out.print(x);
    	}
    	
    	else
    	{
    		printBinary (x / 2); 
    		System.out.print (x % 2);
    	}		
    }
    
    // PART(c):
    public static String toBinaryString(int x)
    {
    	if(x <= 1)
    	{
    		return "" + x;
    	}
    	
    	return toBinaryString (x / 2) + "" + x % 2;	
    	
    }
    
   // PART(d): a recursive method to do the inverse of (c), that is, given a binary number (as a String), 
   // return the corresponding decimal int value.
   public static int toDecimalInt(String s)
   {	   
   	   
   	   if(s.length () == 1)
   	       return s.charAt (0) - '0';
   	   
   	   else
   	   	   return  (s.charAt (s.length () - 1) - '0') + 2 * toDecimalInt(s.substring(0, s.length() - 1)); 	
   	   	   	       
   }
   
   //PART(e):  a recursive method that takes an int array (x), and start and end indices (s & e), 
   // and returns true iff the values between s and e (inclusive) are all arranged in strictly ascending order.
   public static boolean isInAscendingOrder(int [] x, int s, int e )
   {    
   		if(s == e)
   		{
   			return true;
   		}	                     
   		
   		if( s < e && x[s] < x[s + 1])
   		{
   			return isInAscendingOrder( x, s+1, e);
   		}		
   		
   		else
   			return false;     
   	  
   }
