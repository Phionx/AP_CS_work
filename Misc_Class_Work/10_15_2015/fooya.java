public class fooya {
public boolean booya(int a) {
a = 4;
return true;
}

public int hooya() {
int a = 1; int b = 2; int c = 3;
if (a == 1 || booya(a)) {return c;}
else if (b == 1 || booya(a)) {return b;}

}

public static void fooya() {
int a = 42;
System.out.println(hooya() + this.c);
}

public static void main(String [] args){
fooya();
}
}
