public class test1{
public static int foo(int n){
	int a = 0; int b = 1; int temp = 0;
	while (n > 0) {
	temp = a;
	a += b;
	b = temp;
	n -= 1;
	}
	return a;
}

public static void main(String [] args){
	System.out.println(foo(5));
}
}
