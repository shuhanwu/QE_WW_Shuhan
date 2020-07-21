import java.util.*; 
  
public class generateRandomFindSmallest 
{ 
    /** Method to Generate random number*/
    public static void random(int[] arraylist)
    {
        for(int i=0; i < arraylist.length; i++)
        {
            arraylist[i] = (int) (Math.random() * 1000);  
        }
    } 

     /** Method to sort the array by ascending order*/
     public static void arraySort(int [] arraylist)
     {
            int temp;   
            for (int i=1; i<arraylist.length; i++){
                for(int j=0; j < arraylist.length-i; j++){
                    if (arraylist[j] > arraylist [j+1]){
                        temp = arraylist [j];
                        arraylist [j] = arraylist [j+1];
                        arraylist [j+1] = temp;
                    }
                }
            }
        } // End of arraySort method.
     

      /** find nth smallest method. */
      public static int findNthSmallestNumber(int n, int[] numbers)
      {
            return numbers[n-1];
      } // End of findNthSmallesNumber method.

      public static void main(String args[]) 
      { 
        int[] arraylist = new int[500];

	//List<int> arraylist = new ArrayList();

        random(arraylist); // Create random numbers.
        arraySort(arraylist); // Sort random numbers.
	
        // Generating 500 random doubles 
        for(int k = 0;  k<arraylist.length; k++) 
        {
       		System.out.println("Random Number" + (k+1) + ": " + arraylist[k]); 
       	}

	try
	{
		//ask for user input for finding Nth Smallest Number

		Scanner scN = new Scanner(System.in);
		System.out.println("\n\nEnter a number between 1 to 500 :");
        	String strN = scN.nextLine();
		//Integer n;

 		try 
		{ 
        		Integer n = Integer.parseInt(strN); 
        		System.out.println("The " + strN + "st  smallest number is " + findNthSmallestNumber(n,arraylist) + ".");
    		} 
		catch(NumberFormatException e) 
		{ 
        		System.out.printf("Incorrect Number format Caught Exception: %s%n", e.getMessage());
            		e.printStackTrace();   
    		} 
		catch(NullPointerException e) 
		{
        		System.out.printf("Null value Caught Exception: %s%n", e.getMessage());
            		e.printStackTrace(); 
    		}
		




		scN.close();
	}
	catch (Exception e) 
	{
            System.out.printf("Caught Exception: %s%n", e.getMessage());
            e.printStackTrace();        
        }
       } 
} 