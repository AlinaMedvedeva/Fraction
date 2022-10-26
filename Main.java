package fr;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Fraction f1 = new Fraction();
        int n1 = in.nextInt(), d1 = in.nextInt(), n2 = in.nextInt(), d2 = in.nextInt();
        Fraction f2 = new Fraction(n1, d1);
        Fraction f3 = new Fraction(n2, d2);
        f1 = f2.slozh(f3);
        System.out.println(f1);
        f1 = f2.vyuch(f3);
        System.out.println(f1);
    }
}
