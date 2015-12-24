/*	Class Notes
*/

public class Notes {
	public static void main (String [] args){
		int [] test = {7,1,5,12,3};
		print(test);
		test = bubble(test);
		print(test);
	}
	
	public static void print(int [] n){
		String s = "[";
		for(int i: n){
			s += i + ",";
		}
		s = s.substring(0, s.length()-1);
		s += "]";
		System.out.println(s);
	}
	public static int[] bubble(int[] stuff){
		int n = stuff.length;
                int temp = 0;
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                        	if(stuff[j-1] > stuff[j]){
                                        temp = stuff[j-1];
                                        stuff[j-1] = stuff[j];
                                        stuff[j] = temp;
                                }
                               
                        }
                }
		return stuff;
        }

}
