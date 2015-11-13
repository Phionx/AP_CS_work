/*
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW28 -- Ye Olde Role Playing Game
2015-11-10
*/

public class Monster {
final private int base_HP, base_strength, base_defense;
final private double base_attack;

private int HP, strength, defense;
private double attack;

public Monster (){
this(20,65);
}

public Monster (int low, int high){
HP = base_HP = (int)((high - low)*Math.random() + low);
strength = base_strength = 150;
defense = base_defense = 20;
attack = base_attack = 1;
}

public boolean isAlive (){
return HP>0;
}

public int getDefense(){
return defense;
}


public void lowerHP(int foo){
HP = HP -foo;
}

public int attack(Warrior foo){
int damage = (int)(strength*attack - foo.getDefense());
return damage;
}


}
