/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Character{

final protected int base_HP, base_strength, base_defense, base_level;
final protected double base_attack;
final protected String base_type;
final protected String base_name;

protected int HP, strength, defense, level;
protected double attack;
protected String name, type;


protected Character(){
    this(100, 1, 1, 20, 1, "Warrior", "Default");
}

protected Character(String temp_type){
    this(100, 1, 1, 20, 1, temp_type, "Default");
}
protected Character(int temp_HP, int temp_strength, int temp_defense, double temp_attack, int temp_level, String temp_type, String foo){
    base_HP = temp_HP;
    base_strength = strength = temp_strength;
    base_defense = defense = temp_defense;
    base_attack = attack = temp_attack;
    base_name = name = foo;
    base_level = level = temp_level;
    base_type = type = temp_type;
}



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

public void specialize(){
defense--;
attack++;
}

public String getName(){
    return name;
}

public void normalize(){
defense = base_defense;
attack = base_attack;
}

protected int getHP(){
    return HP;
} 
protected int getStrength(){
    return strength;
} 
protected int getLevel(){
    return level;
} 
protected double getAttack(){
    return attack;
} 

protected String getType(){
    return type;
}

public static String about(){
    String aleks = "" ;
    aleks += "The classes availible to characters are as follows:\n";
    aleks += "\nWarrior:\n\tWarriors are swordwielders that travel by foot. They carry chainmail and a shield in addition to their sword. They are skilled at combatting other monsters and enemies, but not as skilled as the knight. Compared to the other classes, they happen to be the most well-rounded one. They have allegiance to only themselves as they travel the realms fighting monsters, other warriors, knights, and whoever stands in their path.";
    aleks += "\nKnight\n\tKnights are extremely skilled warriors hand picked by his majesty himself. While they have higher stats than a warrior and a horse to assist them in their travels, their main disadvantage is that they are bound to serve their majesty, and therefore have no free will whatsoever. They still get to, like, kill stuff though.";
    aleks += "\nSwagmaster\n\tA Swagmaster is someone who has so much swag that it is almost unbearable, they have the greatest amount of swagger possible to mankind, and it is very rare to see one. IF you do happen to come across a swagmaster, be respectful!! if you arent, him&his possy will overpower you with their swag. and you dont want that to happen. And also he has a swag variable that is always set to 100, except in the case that he gets out-swagged, in which case he ceases to exist. ";
    aleks += "\nCapitalist\n\tA Capitalist is the evilest class type in the game. Choose this only if you hate the Earth and wish to enforce every sort of oppression upon it. Or if you're greedy. Capitalists have the extra variables of monies and greed (which is set to 100). If you choose this class you will be constantly critisized and ridiculed for your evils by socialists around you.";
    aleks += "\nSocialist\n\tA Socialist is the good guy, representing the fight against the capitalists in theory and for realsies. Your job will be to critisize and ridicule capitalists. You will also have the option of physically assaulting capitalists, which will result in a sentence in prison of which the length will be determined by the amount of monies the capitalist has to pay lawyers with. In this case, the game will become more of a don't-die-in-prison type thing. The alternative, to peacefully engage capitalists will involve hurting their feelings and helping Bernie Sanders in his campaign.";
    aleks += "\nNinja\n\t A ninja is a sneaky sneak, who excels in everything he/she does, but mostly walking around quietly, doing bruce lee stuff, and being clever but secretive. A ninja has allegiance to no-one, much like the warrior. ";
    aleks += "\n The rest are boring and self explanatory. Have fun!";
    return aleks;
}

public static void main(String[] args){
    System.out.println(about());
    
}


}



