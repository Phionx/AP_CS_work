/*
ID: shanjha2
LANG: JAVA
TASK: dan
*/
import java.io.*;
import java.util.*;

/*
Shantanu Jha
2015-12-14
*/

public class dan{
	public static void main (String [] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("dan.in"));

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dan.out")));
		String line = f.readLine();
		String token;

		while(line!=null){
			/*StringTokenizer is faster way to split up lines*/
			StringTokenizer st = new StringTokenizer(line);

			while(st.hasMoreTokens()){
				token = st.nextToken();
				System.out.println(token);
				out.println(token);
			}
			line = f.readLine();
		}
		out.close();
		/* Use st.nextToken()  to read the next line
		 Use out.println("blah") to print to dan.out
		 Remember to out.close()*/
	}
}