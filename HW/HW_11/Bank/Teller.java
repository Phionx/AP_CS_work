//Kathy Lau, Shantanu Jha, Kevin Hwang
//KaKeS
//APCS1 pd5
//HW11 -- Hey… I Got Your Money
//2015-10-4

public class Teller {

public static void main (String [] args) {
BankAccount foo = new BankAccount();
//Setting attributes of foo
foo.setFullName("Foo Boo");
foo.setAccPass("lolapassword");
foo.setAccPin(3600);
foo.setAccNumber(222222222);
foo.setAccBalance(1232.23);

System.out.println("Your Account Balance is currently" + foo.balance());

foo.authentication("lolapassword", 222222222);

//depositing and withrawing money

foo.deposit(1000000);
System.out.println("Your Account Balance is currently" + foo.balance());
foo.widthdrawl(2321323);
System.out.println("Your Account Balance is currently" + foo.balance());



System.out.println("\n\n\n" + foo);

}
}
