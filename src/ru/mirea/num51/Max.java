package ru.mirea.num51;

import java.lang.*;
import java.util.Scanner;

public class Max {

    public static int recus()
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        {
            if (n == 0) {
                return 0;
            } else {
                return Math.max(n, recus());
            }

        }
    }
    public static void main(String[] args)
    {
        System.out.println(recus());
    }
}
