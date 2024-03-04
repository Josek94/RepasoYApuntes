package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class PruebasArraylist {
	public static void main(String[] args) {

		ArrayList<String> libros = new ArrayList<>();
		libros.add("Cien años de soledad");
		libros.add("1984");
		libros.add("El Alquimista");
		libros.add("El Principito");
		libros.add("El retrato de Dorian Grey");
		
		System.out.printf("%s%n"
				+ "%s%n"
				+ "%s%n"
				+ "%s%n"
				+ "%s%n",
				libros.get(0),libros.get(1),libros.get(2),libros.get(3),libros.get(4));
		
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		int suma= 0;
		int maximo = 0;
		int minimo = 100;
		for(int i = 0; i < 20; i++) {
			numeros.add(random.nextInt(100)+1);
		}
		
		for(int numero : numeros) {
			suma += numero;
			if(numero < minimo) minimo = numero;
			if(numero > maximo) maximo = numero;
			
		}
		
		System.out.println(numeros);
		System.out.printf("cantidad de numeros: %d%n"
				+ "Suma de los numeros: %d%n"
				+ "Numero maximo: %d%n"
				+ "Numero minimo: %d%n"
				+ "Media de los numeros: %.2f%n",numeros.size(),suma,maximo,minimo,((double)suma/numeros.size()));
		
		for(int i = numeros.size()-1; i >= 0;i--) {
			if(numeros.get(i) < 50)numeros.remove(i);
		}
			suma = 0;
			minimo = 100;
		for(int numero : numeros) {
			suma += numero;
			if(numero < minimo) minimo = numero;
			if(numero > maximo) maximo = numero;
			
		}
		
		System.out.println(numeros);
		
		System.out.printf("cantidad de numeros: %d%n"
				+ "Suma de los numeros: %d%n"
				+ "Numero maximo: %d%n"
				+ "Numero minimo: %d%n"
				+ "Media de los numeros: %.2f%n",numeros.size(),suma,maximo,minimo,((double)suma/numeros.size()));
	}

}
