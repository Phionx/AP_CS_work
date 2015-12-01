//Shantanu Jha
//2015-11-30
//CS Dojo Scanners

import cs1.Keyboard;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.text.*;
import java.io.File;

public class Scanner
{
private static String NowDate;
   
public static void main(String [] args)
   {
	//Check if file exists for that day -- if it doesn't then create it 
	Date Now = new Date( );
      	SimpleDateFormat ft = new SimpleDateFormat ("yyyy_MM_dd");
	NowDate = ft.format(Now);
	
	
	File foo = new File(NowDate + ".csv");

	//init FileWriter
	try{ 
		FileWriter writer = new FileWriter(NowDate + ".csv");
		System.out.println("succ");
	
	//generate file header if the file didn't exist before
	if(!foo.exists()){
	generateCsvFile(writer);	
	}


	long osis = -1;
	while(osis != 0){
	osis = ask();
	writer.append("" + osis + "\n");
	}
	writer.flush();
        writer.close();
	System.out.println("Thank you for using CS Dojo Scanners!");
        }
	catch(IOException e)
        {
             e.printStackTrace();
        }

   
}


//Append to CSV file
private static long ask(){
long temp;
while(osis<0 || osis>=1000000000){
System.out.println("=============================================================================================================");
System.out.print("Please enter your OSIS: ");
temp = Keyboard.readLong();
}
return temp;
}
   

//Generates CSV file
   private static void generateCsvFile(FileWriter s)
   {
	try
	{
	    s.append("STUDENT OSIS");
	    s.append(',');
	    s.append("DATE: " + NowDate);
	    s.append('\n');
	}
	catch(IOException e)
	{
	     e.printStackTrace();
	} 
    }
}
