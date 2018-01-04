/*
*This class displays the largest of the four numbers
*The numbers are set by the user
 */
package ua.jvjab.smlnk;

import java.util.Scanner;

/**
 * @author Sergey Melnyk
 * @date 02.01.2018
 * @version 1.0.0
 */
public class Runer {

    /**
     * @param args the command line arguments: a,b,c,d - numbers are set by the
     * user max - the largest of the four numbers
     */
    int a;
    int b;
    int c;
    int d;
    int max;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println("Введите третье число: ");
        int c = sc.nextInt();
        System.out.println("Введите четвертое число: ");
        int d = sc.nextInt();

        int max = a;
        if (max > b & max > c & max > d) {
            System.out.println("Найбольшее число: " + max);
        } else {
            if ((b > a & b > c & b > d)) {
                System.out.println("Найбольшее число: " + b);
            } else {
                if ((d > a & d > b & d > c)) {
                    System.out.println("Найбольшее число: " + d);
                } else {
                    if ((c > a & c > b & c > d)) {
                         System.out.println("Найбольшее число: " + c);
                    } else {
                        System.out.println("Найбольшее число не определено!");
                    }
                    
                }
            }
        }
        sc.close();
    }

}
