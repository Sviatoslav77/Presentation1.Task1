package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int m, n, k, c;
                System.out.println("Сума грошей: ");
                m = s.nextInt();
                System.out.println("Процентна ставка (%):  ");
                n = s.nextInt();
                System.out.println("Кількість років:  ");
                k = s.nextInt();
                c = m + (m*n*k/100);
                System.out.println("Загальна сума виводу коштів: " + c);
            }
        }


