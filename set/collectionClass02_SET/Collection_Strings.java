package collectionClass02_SET;

import java.util.*;
import collectionClass02_SET.*;

public class Collection_Strings {

	public static void main(String[] args) {
		
/*		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("The_Mandalorian", "ficção", "40"));
			add(new Serie("Brooklin_99", "comedia", "30"));
			add(new Serie("Suits", "drama", "40"));
			
		}};
		System.out.println(minhasSeries);
		
		// Imprime em ordem aleatória:
		
		for(Serie serie: minhasSeries) {
			System.out.println(serie.getNome() + " - "+ serie.getGenero()+ " - "+serie.getTempoEpisodio());
		}
*/
		Set<Serie> minhasSeries = new LinkedHashSet<>() {{
			
			add(new Serie("The_Mandalorian", "ficção", 40));
			add(new Serie("Brooklin_99", "comedia", 30));
			add(new Serie("Suits", "drama", 40));
			
		}};
		System.out.println(minhasSeries);
		
		// Imprime em ordem conforme ordem de inserção na lista:
/*		
		for(Serie serie: minhasSeries) {
			System.out.println(serie.getNome() + " - "+ serie.getGenero()+ " - "+serie.getTempoEpisodio());
		}
		
*/		
		// Imprime em ordem natural de duração:
		
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
		System.out.println(minhasSeries2);
	}

}
