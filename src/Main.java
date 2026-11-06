import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите h и w: ");
        int h = input.nextInt();
        int w = input.nextInt();
        writer(h, w);
    }


    public static void writer(int h, int w) {
        for (int i = 1; i <= h; i++) {
            boolean isSymbolA = true;
            int n=0;
            for (int j = 1; j <= w; j++) {
                System.out.print(isSymbolA ? "a" : "b");
                n++;
                if (n==h-i+1){
                    isSymbolA = !isSymbolA;
                    n=0;
                }
            }
            System.out.print("\n");
        }
    }
}