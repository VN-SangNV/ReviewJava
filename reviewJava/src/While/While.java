package While;

public class While {
    public static void main(String[] args) {
        int number = 0;
        while(number < 10){
            System.out.println(number);
            number++;
        }
        do{
            System.out.println(number);
            number++;
        }while (number < 10);
        number = 0;
        System.out.println("/////");

        int tongCacSoChiaHetCho3 = 0;
        while(number < 13){
            if(number % 3 == 0){
                tongCacSoChiaHetCho3 += number;
            }
            number++;
        }
        System.out.printf("Tổng các số chia hết cho 3 từ 0 đến %d là: %d", number, tongCacSoChiaHetCho3);
    }
}
