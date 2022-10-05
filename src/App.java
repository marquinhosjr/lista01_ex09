import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double fahrenheit;
        double celsius;

        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextDouble();
        sc.close();

        celsius = 5 * ((fahrenheit - 32) / 9 );

        System.out.print("A é temperatura em graus celsius é: " +celsius);
    }
}
