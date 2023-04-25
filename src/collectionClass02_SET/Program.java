package collectionClass02_SET;

import java.util.Arrays;
import java.util.*;

public class Program {

	public static void main(String[] args) {
	
	/*	Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 4.2));
		System.out.println(notas);
		System.out.println("___________________________");
		* note que o método SET armazenou os elementos de forma aleatória,
		 * e também verificamos que não foram adicionados elementos duplicados, somente um registro é armazenado na lista;
		 
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println("___________________________");
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		System.out.println("___________________________");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		System.out.println("A soma das notas é : "+ soma);
		System.out.println("___________________________");
		
		System.out.printf("A médiadas notas é: %.2f%n " , (soma / notas.size()));
		System.out.println("___________________________");
		
		// remova a menor nota:
		
		notas.remove(0d);
		System.out.println(notas);
		System.out.println("___________________________");
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println("___________________________");
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		System.out.println("___________________________");
		
		// Remova as notas maiores que 7:
		
		Iterator<Double> it = notas.iterator();
		while(it.hasNext()) {
			double proximo = it.next();
			if(proximo > 7.0) {
				it.remove();
			}
		}
*/
		// Adicione uma série de notas em uma lista e exiba na ordem em que forma adicionadas 
	
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		
		System.out.println(notas2);
		
		// Crie uma lista e organize em ordem crescente
		
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
	}

}
