/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW28 -- Ye Olde Role Playing Game
2015-11-10
*/

public class Monster extends Character { 

public Monster (){
this(20,65);
}

public Monster (int low, int high){
super((int)((high - low)*Math.random() + low), 150, 20, 1);
}


}
