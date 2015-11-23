//Shantanu Jha
//APCS1 pd5
//HW12 -- stAtistically sPeaking
//2015-10-5
public static class Stats {
//static public method that takes two int values and returns int mean
public static int mean(int a, int b){
return (a + b) / 2;
}

//static public method that takes two double values and returns a double mean
public static double mean(double a, double b){
return (a+b)/2;
}

//static public method that takes two int values and returns the max int value
public static int max(int a, int b){
if (a >= b) {
return a;
}
return b;
}

//static public method that takes two double values and returns the max double value
public static double max(double a, double b){
if (a >= b) {
return a;
}
return b;
}

//static public method that takes two int values and returns the int geometric mean
public static int geoMean(int a, int b){
return (int) Math.sqrt(a*b);
}

//static public method that takes two doulbe values and returns the double geometric mean
public static double geoMean(double a, double b){
return Math.sqrt(a*b); 
}
public static void main(String [] args) {
System.out.println(Stats.geoMean(2,8));
}
}
