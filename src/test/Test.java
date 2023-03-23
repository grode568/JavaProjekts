package test;

import java.util.Scanner;

public class Test {

	private static final int NEPARSNIEDZAMAIS_SKAITLIS = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ievadiet skaitli, kuru gribat kāpināt kvadrātā : ");
        int x = sc.nextInt();
        
        if(x < NEPARSNIEDZAMAIS_SKAITLIS)
        {
        	int kapinajumaRezultats = x * x;
        
        	System.out.println("Skaitlis " + x + " kvadrātā ir: " + kapinajumaRezultats);
        }else 
        {
        	System.out.println("Lūdzu ievadiet mazāku skaitli par" + NEPARSNIEDZAMAIS_SKAITLIS);
        }


	}

}
