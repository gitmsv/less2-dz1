/*
*This class displays the largest of the four numbers
*The numbers are set by the user
 */
package ua.jvjab.smlnk;

import java.util.Scanner;

/**
 * @author Sergey Melnyk
 * @date 09.01.2018
 * @version 1.0.0
 */
public class Runer {

    /**
     * @param args the command line arguments: a,b,c,d - numbers are set by the
     * user max1 - the largest of the four numbers
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        int c;
        int d;

        Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            a = sc.nextInt();
            System.out.println("Введите второе число: ");
            b = sc.nextInt();
            System.out.println("Введите третье число: ");
            c = sc.nextInt();
            System.out.println("Введите четвертое число: ");
            d = sc.nextInt();
            sc.close();
            System.out.println("Наибольшее число = " + max1(a, b, c, d));
    }

    public static int max1(int a, int b, int c, int d) {

        if (a > b & a > c & a > d) {
            return a;
        } else {
            if (b > a & b > c & b > d) {
                return b;
            } else {
                if (c > a & c > b & c > d) {
                    return c;
                } else {
                    return d;
                }

            }

        }

    }
}
