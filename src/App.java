import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner (System.in);
        int n;

        System.out.print("Basamak Sayısı giriniz : ");
        n = inp.nextInt();

        for(int i=1; i <= n; i++){
            for(int j=1; j <= i ; j++){
                System.out.print(" ");
            }
            for(int k=1; k < 2*(n-i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}