/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Knight extends Character {
private int [] weapons;

public Knight (){
this("Bob");
}
public Knight (String foo){
super(100, 150, 20, 1, 1, "Knight", foo);
}


}