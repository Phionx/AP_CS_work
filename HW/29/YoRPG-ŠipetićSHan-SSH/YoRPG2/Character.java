/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW28 -- Ye Olde Role Playing Game
2015-11-10
*/

public class Character{

final protected int base_HP, base_strength, base_defense;
final protected double base_attack;

protected Character(){
    this(100, 1, 1, 20);
}

protected Character(int temp_HP, int temp_strength, int temp_defense, double temp_attack){
    base_HP = temp_HP;
    base_strength = temp_strength;
    base_defense = temp_defense;
    base_attack = temp_attack;
}

protected int HP, strength, defense;
protected double attack;

protected boolean isAlive(){
    return HP>0;
}
protected int getDefense(){
    return defense;
} 

protected void lowerHP(int foo){
    HP = HP - foo;
}

protected int attack(Character foo){
int damage = (int)(strength*attack - foo.getDefense());
return damage;
}
}



