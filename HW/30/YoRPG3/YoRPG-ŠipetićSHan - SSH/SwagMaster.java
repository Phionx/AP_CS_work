/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class SwagMaster extends Character {
private int swag;


public SwagMaster (){
this("Bob");
swag = 0;
}
public SwagMaster (String foo){
super(100, 150, 20, 1, 1, "Swagmaster",  foo);
}


}