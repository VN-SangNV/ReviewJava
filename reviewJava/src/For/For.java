package For;

public class For {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++){
            System.out.println("Bảng cửu chương " + i);
            for(int j = 1; j < 11; j++){
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }
}
