package beecrowd;

import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c, media;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        media = ((a * 2) + (b * 3) + (c * 5))/ 10;
        System.out.printf("MEDIA = %.1f\n", + media);
    }



}
