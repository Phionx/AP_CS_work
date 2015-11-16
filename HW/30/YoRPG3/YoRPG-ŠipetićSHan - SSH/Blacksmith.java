/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Blacksmith extends Character {
private int [] tools;

public Blacksmith (){
this("Bob");
}
public Blacksmith (String foo){
super(100, 150, 20, 1, 1, "Blacksmith", foo);
}


}