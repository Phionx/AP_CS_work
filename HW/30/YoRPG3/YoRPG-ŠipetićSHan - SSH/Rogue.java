/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Rogue extends Character {
private int [] weapons;

public Rogue (){
this("Bob");
}
public Rogue (String foo){
super(100, 150, 20, 1, 1, "Rogue", foo);
}


}