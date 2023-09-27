package pemrogramandasar01;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        
        System.out.print("Masukan bilangan : ");
        bil = input.nextInt();
        
        String kondisi = bil % 2 == 0 ? "Genap" : "Ganjil";

        System.out.println(bil + " merupakan bilangan " + kondisi);

        
    }
}