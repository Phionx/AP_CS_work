/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW28 -- Ye Olde Role Playing Game
2015-11-10
*/

public class Warrior extends Character {
final private String base_name;
private String name;


public Warrior (){
this("Bob");

}
public Warrior (String foo){
super(100, 150, 20, 1);
name = base_name = foo;
}


public void specialize(){
super.defense--;
super.attack++;
}

public String getName(){
    return name;
}
public void normalize(){
super.defense = super.base_defense;
super.attack = super.base_attack;
}
}
