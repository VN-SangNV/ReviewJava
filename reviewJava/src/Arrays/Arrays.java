package Arrays;

import Methods.Methods;

public class Arrays {
    public static void main(String[] args) {
        int arrInt[] = {1, 2, 3 ,7 ,5 ,6};
        Methods.printArr(arrInt);

        int sum = 0;
        sum = Methods.sumArr(arrInt);
        System.out.println("Sum = " + sum);

        int max = 0;
        max = Methods.findMax(arrInt);
        System.out.println("Max = " + max);
    }
}
