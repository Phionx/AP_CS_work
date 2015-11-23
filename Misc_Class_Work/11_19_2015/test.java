public class test{
public static void main (String [] args){
int[][]a2 = new int[2][3];
fill(a2);
for(int [] i: a2){
for(int j : i){
System.out.println(j);
}
}
}

public static  void fill(int[][]a2){
for(int i =0; i < a2.length; i++){
for(int j = 0; j <a2[i].length; j++){
a2[i][j] = j + i*a2[i].length;
}
}
}
}


