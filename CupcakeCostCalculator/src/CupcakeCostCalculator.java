import java.util.Scanner;
public class CupcakeCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();
        int D = sc.nextInt();
        int total;
        if(t>k) {
            total = t * D;
        }else{
            total = t * d;
        }
        System.out.println(total);
    }
}
