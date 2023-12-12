package exerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//declaraçao de variaveis
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		for(int i=0;i<5;i++) {
			System.out.println("Digite a "+(i+1)+"a de 5 cores:");
			cores.add(leia.nextLine());
		}
		
		//saida de dados / foreach
		System.out.println("\nListar todas as cores:");
		for(String n: cores) System.out.println(n);
		
		Collections.sort(cores);
		System.out.println("Ordenar as cores:");
		for(String n: cores) System.out.println(n);
		
	}

}
