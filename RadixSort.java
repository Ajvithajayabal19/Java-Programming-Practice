public class RadixSort{
    public static void main(String[] args){
        int arr[] = {21,13,42,35,12};
        sort(arr , 1);
        sort(arr , 10);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void sort(int arr[],int place){
        int[] result = new int[arr.length];
        int[] count = new int[10];
        for(int i=0; i < arr.length; i++){
            int digit = (arr[i] / place) % 10;
            count[digit]++;

    } 
    int index = 0;
    for(int i=0; i<10; i++){
        while(count[i] > 0){
           for(int j=0; j<arr.length; j++){
               int digit = (arr[j] / place) % 10;
               if(digit == i){
                   result[index] = arr[j];
                   index++;
                   count[i]--;
               }
           }
        }
    }
        for(int i=0; i<arr.length; i++){
            arr[i] = result[i];
        }
    }
}  