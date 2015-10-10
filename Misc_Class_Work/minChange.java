public class minChange {

public static void main (String [] args){


Integer n, pen, nick, dim, quart;
n = Integer.parseInt(args[0]);
quart = n/25;
n = n%25;
dim = n/10;
n = n%10;
nick  = n/5;
n = n%5;
pen = n;

System.out.println("# Quarters :" + quart);
System.out.println("# Dimes :" + dim);
System.out.println("# nickels:" + nick);
System.out.println("# pennies :" + pen);

}
}
