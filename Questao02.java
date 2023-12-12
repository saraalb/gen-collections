package exerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
	//declaraçao de variaveis
	 ArrayList<Integer> num	= new ArrayList<Integer>();
	 int numProcurado;
	 Scanner leia = new Scanner(System.in);
	
	 //iniciei a lista
	 for(int i=1; i<11;i++) {
		 num.add(i);
	 }
	 
	 //dados de entrada do usuario
	 System.out.println("Digite o número que deseja encontrar: ");
	 numProcurado = leia.nextInt();
	 
	 if (num.contains(numProcurado)) {
		 System.out.println("O número "+numProcurado+" está localizado na posição: "+num.indexOf(numProcurado));
	 } else {
		 System.out.println("O número "+numProcurado+" não foi encontrado!");
	 }
	 
	 
	 
	}

}
