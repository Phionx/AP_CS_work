//Shantanu Jha - Period 5
//9/25/2015
//AP CS
public class BigSib {
public String helloMsg;

public BigSib(){
	helloMsg = "Hi kid";
}
public BigSib(String s){
	helloMsg = s;
}
public String greet(String s){
return helloMsg + ", " + s;
}

public void  setHelloMsg(String s) {
helloMsg = s;
}
}

