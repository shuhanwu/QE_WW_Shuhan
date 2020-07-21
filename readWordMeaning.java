
import java.io.*; 
import java.util.*;




public class readWordMeaning{ 

    public static void doesFileExist(String path)  
    {
         // Get the file from user input with directory
        String dir = System.getProperty("user.dir");
        String fileName = dir + "\\" + path;

        System.out.println("You entered FileName " + fileName);

        File f = new File(fileName); 
  
        // Check if the specified file exists or not 
        try
        {
            if (f.exists() && !f.isDirectory()) 
                System.out.println("Exists"); 
            else
                System.out.println("Does not Exists");
        }
        catch (Exception e) 
        {
            System.out.printf("Caught Exception for reading file: %s%n", e.getMessage());
            e.printStackTrace();
        } 
    
    }

    public static void printFile(String path) 
    {        
        String[] str, strM;

        // Get the file from user input with directory
        String dir = System.getProperty("user.dir");
        String fileName = dir + "\\" + path;

        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName)); 

            String st; 
            while ((st = br.readLine()) != null) 
            {
                
                str =  st.split("-");

                strM = str[1].split(",");
                
                System.out.println(str[0].trim());

                if (strM.length < 1)                    
                    System.out.println(str[1].trim());
                else
                {    
                    for (String a : strM)    
                    { 
                        System.out.println(a.trim());
                        //words.put(str[0], a);
                    }
                }            
            }

        } catch (Exception e) {
            System.out.printf("Caught Exception for reading file: %s%n", e.getMessage());
            e.printStackTrace();
        }
        
    }


    public static void main(String args[]) 
    { 
  
	    String inputFile;

	    Scanner scFile = new Scanner(System.in);
	    System.out.println("Enter a filename:");
        inputFile = scFile.nextLine();
    
        try {
            doesFileExist(inputFile);

            printFile(inputFile);

        } catch (Exception e) {
            System.out.printf("Caught Exception: %s%n", e.getMessage());
            e.printStackTrace();        
        }
        
       

        scFile.close();
    }
   
} 