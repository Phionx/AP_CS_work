/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Monster extends Character { 

public Monster (){
this(20,65, "Bob");
}

public Monster (String temp_name){
    this(20, 65, temp_name);
}

public Monster (int low, int high, String temp_name){
super((int)((high - low)*Math.random() + low), 150, 20, 1, 1, "Monster", temp_name);
}


}
