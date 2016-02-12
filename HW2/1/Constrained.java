/*
Shantanu Jha
APCS1 pd5
HW1--I Am Still Searching
2016-02-12
*/

public class Constrained {
/*
    public static int[] matrix(int find, int [][] matrix){
        int row;
        boolean state = false;
        int size = matrix.length;
        for(int i = 0; i < size; i++){
            if(matrix[i][i] >= find){
                row = 2*i-1;
                break;
            }
            if(matrix[i+1][i] + matrix[i][i+1] >= 2*find){
                row = 2*i;
                break;
            }
        }
        
        if(row != row%(size){
            
        row = row%(size-1);
        
*/
    //matrix
    public static boolean matrix(int find, int i, int j, int [][] matrix){
        int temp = matrix[i][j];
        int size = matrix.length;
        if(find == temp) return true;
        if(find < temp) {
            if((i-1) >= 0 && (j-1) >= 0) return matrix(find, i-1, j, matrix) || matrix(find, i, j-1, matrix);
            if((j-1) >= 0) return matrix(find, i, j-1, matrix); 
            if((i-1) >= 0) return matrix(find, i-1, j, matrix); 
        }
        if(find > temp) {
            if((i+1) < length && (j+1) < length) return matrix(find, i+1, j, matrix) || matrix(find, i, j+1, matrix);
            if((j+1) < length) return matrix(find, i, j+1, matrix); 
            if((i+1) < length) return matrix(find, i+1, j, matrix); 
        }
    }


    public static void main(String [] args){
        
}   
}
