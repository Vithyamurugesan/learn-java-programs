
public class arrayexample2 {
    public static void main(String[] args){
        int[][] matrix=new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
      

        matrix[1][0]=5;
        matrix[1][1]=6; 
        matrix[1][2]=7;
       

        matrix[2][0]=9;
        matrix[2][1]=10; 
        matrix[2][2]=11;
      
    
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matrix[i][j]);
            }
        }
       
    }
}
