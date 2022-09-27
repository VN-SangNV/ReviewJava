package Methods;

public class Methods {
    public static void main(String[] args) {

    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int sumArr(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int findMax(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
