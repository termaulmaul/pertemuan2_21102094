package com.maulana_rafi.pbo.pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Looping... (" + i + ")");
        }
        System.out.println("Looping for selesai :)");
        int j = 1;
        while (j <= 100) {
            System.out.println("Looping... (" + j + ")");
            j+=10;
        }
        System.out.println("Looping while selesai :)");
        int k = 10;
        do {
            System.out.println("Looping... (" + k + ")");
            k-=2;
        }
        while (k >= 0);
        System.out.println("Looping do while selesai :)");
    }
}
