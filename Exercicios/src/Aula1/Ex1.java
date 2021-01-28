package Aula1;

import java.util.Scanner;

public class Ex1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int anos,meses,dias,soma;

		System.out.println("Entre com seus anos:");
		anos = ler.nextInt();
		System.out.println("Entre com os meses:");
		meses = ler.nextInt();
		System.out.println("Entre com os dias:");
		dias = ler.nextInt();
		
		anos = anos*365; 
		meses = meses*30; 
		soma = anos+meses+dias;
		
		System.out.println("A quantidade de dias vivivos é:"+soma);
	
	}
}
