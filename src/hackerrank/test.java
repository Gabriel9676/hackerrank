package hackerrank;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a, b, media;

        a = scan.nextDouble();
        b = scan.nextDouble();

        media = (a * 3.5) + (b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", + media);

    }
}
