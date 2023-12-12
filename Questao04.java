package exerciciosArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Questao04 {

	public static void main(String[] args) {
		Set<Integer> setNum = new HashSet<Integer>();
		int numProcurado;
		Scanner leia = new Scanner(System.in);
		
		//iniciando a lista
		for(int i=20;i<30;i++) {
			setNum.add(i);
		}
		
		System.out.println("Digite o número que deseja encontrar:");
		numProcurado = leia.nextInt();
		
		if(setNum.contains(numProcurado)) System.out.println("O número "+numProcurado+" foi encontrado!");
		else System.out.println("O número "+numProcurado+" não foi encontrado!");
	}
}
