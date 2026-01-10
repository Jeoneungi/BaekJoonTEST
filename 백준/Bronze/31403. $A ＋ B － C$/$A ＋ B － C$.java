import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        int C = sc.nextInt();
        
        int NumA = Integer.parseInt(A);
        int NumB = Integer.parseInt(B);
        System.out.println(NumA + NumB - C);

        String addAB = A + B;
        int numAB = Integer.parseInt(addAB);
        System.out.println(numAB - C);
        
        sc. close();
    }
}