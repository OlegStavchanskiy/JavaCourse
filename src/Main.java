import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Currensy usd;
        usd = (x, y) -> y/x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество рублей");
        double z = sc.nextDouble();
        double value = usd.usd(94.10,z);
        String result = String.format("%.2f",value);
        System.out.print(result+"$");
    }
}