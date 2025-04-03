public class hi {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,67,7};
        System.out.println(MAX_NUM(arr));
        reverse(arr);
    }
    public static int MAX_NUM(int arr[]){
        int maxNUM=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxNUM){
                maxNUM=arr[i];
               
            }
            
            
        }
        return maxNUM;

    }
    


    public static void reverse(int [] arr){
      int start=0;
      int end=arr.length-1;
      while(start<end)  {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
      }
      System.out.println(arr);
    }
    
    
    
    
}
