package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r, 𝛼;
        double pi,sliceArea;
        pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz :");
        r = input.nextInt();

        System.out.print("Açı giriniz :");
        𝛼 = input.nextInt();
        sliceArea = (pi * (r * r) * 𝛼) / 360;
        System.out.println("Dairenin dilim alanı :"+sliceArea);




    }
}
