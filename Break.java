package com.maulana_rafi.pbo.pertemuan2;

public class Break {
    public static void main(String[] args) {
        int p = 0;
        while (p <= 100) {
            System.out.println("Looping... (" + p + ")");
            p+=10;

            if (p == 50) {
                System.out.println("Looping dihentikan");
                break;
            }
        }
    }
}
