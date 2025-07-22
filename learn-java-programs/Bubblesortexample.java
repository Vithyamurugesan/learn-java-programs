public class Bubblesortexample {
    public static void main(String[] args){
        int []arr={6,5,2,8,9,4};
        int size=arr.length;
        int temp=0;

   

        for(int i=0;i<size;i++){
            for(int j=0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"");
        }
    }
}
