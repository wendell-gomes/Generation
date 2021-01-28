package Aula1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) 
	{
		try (Scanner ler = new Scanner (System.in)) {
			int anos,meses,dias,soma,total;
			
			System.out.println("Entre com o total de dias vividos:");
			total = ler.nextInt();
			
			anos = total/365; 
			System.out.println("Anos:"+anos);
			meses = (anos%365)/12;
			System.out.println("Meses:"+meses);
			dias = meses*30;
			System.out.println("Dias:"+dias);
		}

	}

}
