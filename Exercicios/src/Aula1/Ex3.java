package Aula1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int tempo,segundo,minutos,horas;
		
		System.out.println("Entre com os segundos do evento:");
		segundo = ler.nextInt();

		horas = segundo/3600;
		System.out.println("Total de horas: "+horas);
		minutos = horas * 60; 
		System.out.println("Total de minutos: "+minutos);
		segundo = horas * 3600; 
		System.out.println("Total de segundos: "+segundo);
		
	}
}
