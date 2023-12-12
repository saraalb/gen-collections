package exerciciosArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Questao03 {

	public static void main(String[] args) {
		//declaraçao de variaveis
		Set<Integer> setNum = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		//dados de entrada
		for(int i=0;i<10;i++) {
			System.out.println("Digite valor único:");
			setNum.add(leia.nextInt());
		}
		
		//saída de dados /classe iterator
		Iterator<Integer> iNum = setNum.iterator();
		System.out.println("Listar dados do set:");
		while(iNum.hasNext()) {
			System.out.println(iNum.next());
		}

	}

}
