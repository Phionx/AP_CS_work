//Shantanu Jha
//Period 5
//APCS 
//9-29-2015
private String first_name;
private String last_name;
private String password;
private int PIN;
private int account_number;
private double balance;

public BankAccount () {
first_name = "First Name ";
last_name = "Last Name" ;
}

public BankAccount (String a, String b) {
first_name = a;
last_name = b;
}

public void setName (String a, String b){
first_name = a;
last_name = b;
}

public void setPassword (String a) {
password = a;
}

public void setPIN (Integer a) {
PIN = a;
}

public void setAccount_number (Integer a) {
account_number = a;
}

public void setBalance (double a) {
balance = a;
}

public String toString() {
String a;
a = "Name: " + first_name + " " + last_name + "\nPassword: " + password + "\nPIN: " + PIN + "\nAccount Number: " + account_number + "\nBalance: " + balance;
return a;
}

public void Deposit (Integer a){
balance += a;
System.out.println("Your balance is now" + balance);
}


public void Withdraw (Integer a){
balance -= a;
System.out.println("Your balance is now" + balance);
}


}
