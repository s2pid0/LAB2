package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void fib(int lng) {

        ArrayList fibnum = new ArrayList();
        for (int i = 0; i <= lng; i++) {
            if (i == 0) {
                fibnum.add(0);
            } else if (i == 1 | i == 2) {
                fibnum.add(1);
            } else {
                int f1 = (int) fibnum.get(i - 1);
                int f2 = (int) fibnum.get(i - 2);
                int next = f1 + f2;
                fibnum.add(next);
            }
        }

        for (int i = 0; i < fibnum.size(); i++) {
            int value = (int) fibnum.get(i);
            System.out.print(value + " ");
        }
    }


    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("Секция 1");
                    break;
                case 2:
                    System.out.println("Секция 2");
                    break;
                case 3:
                    System.out.println("Секция 3");
                    break;
                case 4:
                    System.out.println("Секция 4");
                    break;
                case 5:
                    System.out.println("Секция 5");
                    break;
            }
        }

        System.out.print("Введите число элементов: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Последовательность Фиббоначи: ");
        fib(n);

        System.out.println();
        System.out.println("Числа - вампиры: ");

        int a[] = new int[5];
        int chis[] = new int[11];
        int number;

        for (int x = 1000; x < 10000; x++) {

            number = x;
            for (int i = 1; i < 5; i++) {
                a[i] = number % 10;
                number /= 10;
            }
            number = x;

            chis[0] = (a[1] * 10 + a[2]) * (a[3] * 10 + a[4]);
            chis[1] = (a[2] * 10 + a[1]) * (a[3] * 10 + a[4]);
            chis[2] = (a[1] * 10 + a[2]) * (a[4] * 10 + a[3]);
            chis[3] = (a[2] * 10 + a[1]) * (a[4] * 10 + a[3]);
            chis[4] = (a[1] * 10 + a[3]) * (a[2] * 10 + a[4]);
            chis[5] = (a[3] * 10 + a[1]) * (a[2] * 10 + a[4]);
            chis[6] = (a[1] * 10 + a[3]) * (a[4] * 10 + a[2]);
            chis[7] = (a[3] * 10 + a[1]) * (a[4] * 10 + a[2]);
            chis[7] = (a[1] * 10 + a[4]) * (a[2] * 10 + a[3]);
            chis[8] = (a[4] * 10 + a[1]) * (a[2] * 10 + a[3]);
            chis[9] = (a[1] * 10 + a[4]) * (a[3] * 10 + a[2]);
            chis[10] = (a[4] * 10 + a[1]) * (a[3] * 10 + a[2]);

            if (chis[0] == number | chis[1] == number | chis[2] == number | chis[3] == number | chis[4] == number | chis[5] == number | chis[6] == number | chis[7] == number | chis[8] == number | chis[9] == number | chis[10] == number) //сравнение полученных произведений с изначальным 4х значным числом
            {
                System.out.print(number + " ");
            }


        }
    }
}