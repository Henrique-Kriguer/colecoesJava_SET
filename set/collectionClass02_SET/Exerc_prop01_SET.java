package collectionClass02_SET;

import java.util.*;
public class Exerc_prop01_SET {

	public static void main(String[] args) {
		// cores :violeta, anil, azul, verde, amarelo, laranja e vermelho
		
		Set<String> cor = new HashSet<>();
		cor.add("violeta");
		cor.add("anil");
		cor.add("azul");
		cor.add("verde");
		cor.add("amarelo");
		cor.add("laranja");
		cor.add("vermelho");
		
		
		// A - Imprimindo todas as cores uma abaixo da outra 
		
		Iterator<String> it = cor.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// B - Informando a quantidade da lista: 
		
		System.out.println("O arco-iris possui " + cor.size() + " cores.");
		
		
		// D - Imprimindo em ordem conforme cada cor foi adicionada:
		
		Set<String> cor2 = new LinkedHashSet<>(cor);
		System.out.println("Imprimindo em ordem conforme cada cor foi adicionada: ");
		Iterator<String> it2 = cor2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		
	}

}
