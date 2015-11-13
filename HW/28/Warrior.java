/*
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW28 -- Ye Olde Role Playing Game
2015-11-10
*/

public class Warrior{
final private String base_name;
final private int base_HP, base_strength, base_defense;
final private double base_attack;

private String name;
private int HP, strength, defense;
private double attack;

public Warrior (){
this("Bob");

}
public Warrior (String foo){
name = base_name = foo;
HP = base_HP = 100;
strength = base_strength = 1;
defense = base_defense = 1;
attack = base_attack = 1;
}

public boolean isAlive (){
return HP>0;
}

public int getDefense(){
return defense;
}

public String getName(){
return name;
}

public void lowerHP(int foo){
HP = HP -foo;
}
public int attack(Monster foo){
int damage = (int)(strength*attack - foo.getDefense());
return damage;
}

public void specialize(){
defense--;
attack++;
}

public void normalize(){
defense = base_defense;
attack = base_attack;
}
}
