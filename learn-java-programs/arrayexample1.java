import java.util.Scanner;
public class arrayexample1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int[] num=new int[5];
        int sum=0;
        for(int i=0;i<num.length;i++){
             num[i]=input.nextInt();
             sum+=num[i];
             System.out.println(sum);
        }    
    } 
}
