//face off

public class Face {

public static void main (String [] args){
String hair, eyes, facebar, mouth1, chin, mouth2, mouth3, mouth4; //face features
String a, b, c, d, e; //different faces


eyes = "|\t\t-\t\t-\t\t|\n";
facebar = "|\t\t\t\t\t\t|\n";
mouth1 = "|\t\t-----------------\t\t|\n";
mouth2 = "|\t\t------------\t\t|\n";
mouth3 = "|\t\t-\t\t-\t\t|\n";
hair = "/|||||||||||||||||||||||||||||||||||||||||||||||\\ \n";
chin = "|_______________________________________________|\n";


a = hair + facebar + facebar + eyes + facebar + facebar + facebar + mouth1 + facebar + facebar + chin;
b = hair + facebar + facebar + eyes + facebar + facebar + mouth1 + mouth3 + mouth1 + facebar + chin;

clear();

for(int i=1; i <= 20; i++){
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
