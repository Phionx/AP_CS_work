//face off

public class Face2 {

public static void main (String [] args){
String a, b;
a = "\n\n\n\n\n\n\t\t\t=_=";
b = "\n\n\n\n\n\n\t\t\t-_-";

clear();

for(int i=1; i <= 50; i++){
System.out.println(a);
delay();
clear();
System.out.println(b);
delay();
clear();
}
}

private static void clear(){
final String clear = "\u001b[2J";
final String home = "\u001b[H";
System.out.print(clear + home);
System.out.flush();
}

private static void delay(){
try {
    Thread.sleep(200);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
}


}
