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
	boolean existance = true; //does the file exist already

	//Check if file exists for that day -- if it doesn't then create it 
	Date Now = new Date( );
      	SimpleDateFormat ft = new SimpleDateFormat ("yyyy_MM_dd");
	NowDate = ft.format(Now);
	
	
	File foo = new File(NowDate + ".csv");
	existance = foo.exists();

	//init FileWriter
	try{ 
		FileWriter writer = new FileWriter(NowDate + ".csv", existance);
	
	//generate file header if the file didn't exist before
	if(!existance){
	 	writer.append("STUDENT OSIS");
            	writer.append(',');
            	writer.append("DATE: " + NowDate);
            	writer.append('\n');
	}


	long osis = -1;
	while(osis != 0){
	osis = ask();
	writer.append("" + osis + "\n");
	writer.close();
	writer = new FileWriter(NowDate + ".csv", true);
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
long temp = -1;
while(temp<0 || temp>=1000000000){
System.out.println("=============================================================================================================");
System.out.print("Please enter your OSIS: ");
temp = Keyboard.readLong();
}
return temp;
}
} 
