package ba.unsa.etf.rpr.predavanje02;

import java.util.Scanner;

public class Main {
    private static int SumaCifara(int n){
        int suma = 0;
        while(n>0){
            suma = suma + n % 10;
            n = n / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
	System.out.println("Unesite neki broj: ");
	Scanner ulaz = new Scanner(System.in);
	int n = ulaz.nextInt();
	System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara su: ");
	for(int i = 1; i<=n; i++){
        if(i % SumaCifara(i) == 0) System.out.println(i);
    }
    }
}
