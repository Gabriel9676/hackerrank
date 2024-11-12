package beecrowd;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nFuncionario, nHoras;
        double vHoras;

        nFuncionario = sc.nextInt();
        nHoras = sc.nextInt();
        vHoras = sc.nextDouble();


        System.out.println("NUMBER = " + nFuncionario);
        System.out.printf("SALARY =" + " U$ %.2f\n", (nHoras * vHoras));



    }
}
