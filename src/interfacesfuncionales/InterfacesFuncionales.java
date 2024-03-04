package interfacesfuncionales;

public class InterfacesFuncionales {
	
	
	public static int sumar(int[] array, Filtro filtro ){
		int total = 0;
		for(int recorrer : array) {
		if(filtro.comprobacion(recorrer)) {
			total += recorrer;
		}		
	}
	return total;	
}
	
	public static int sumarVariables(int[] array, FiltroVariable filtro ){
		int total = 0;
		for(int recorrer : array) {
		if(filtro.comprobacion(recorrer, 3)) {
			total += recorrer;
		}		
	}
	return total;	
}
	
	public static void main(String[] args) {
		int[] listaDeNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Operar cuadrado = s -> s * s;
		System.out.println(cuadrado.opera(4));
		Operar cubo = s -> s * s * s;
		System.out.println(cubo.opera(6));
		Operar doble = s -> s * 2;
		System.out.println(doble.opera(8));
		Operar triple = s -> s * 3;
		System.out.println(triple.opera(3));
		Operar polinomio = s -> 5 * s * s * s + 7 * s * s + 9;
		System.out.println(polinomio.opera(4));
		OperacionMultiplesValoresInt polinomioVariable = (s, n1, n2, n3) -> n1 * s * s * s + n2 * s * s + n3;
		System.out.println(polinomioVariable.operacionPolinomioVariable(4, 2, 6, 10));
		
		
		OperarDecimal mitad = s -> s / (double)2;
		System.out.println(mitad.division(2));
		OperarDecimal cuartaParte = s -> s / (double)4;
		System.out.println(cuartaParte.division(2));
		OperarDecimal decimaParte = s -> s / (double)10;
		System.out.println(decimaParte.division(5));
		OperacionDecimal2Parametros nSimaparte = (n1, n2) -> n1 / n2;
		System.out.println(nSimaparte.divisionMultiple(5, 10));
		
		Filtro suma = s -> true;
		System.out.println(sumar(listaDeNumeros, suma));
		Filtro sumaPares = s -> s % 2 == 0;
		System.out.println(sumar(listaDeNumeros, sumaPares));
		Filtro sumaImpares = s -> s % 2 != 0;
		System.out.println(sumar(listaDeNumeros, sumaImpares));
		Filtro sumaPositivo = s -> s > 0;
		System.out.println(sumar(listaDeNumeros, sumaPositivo));
		Filtro sumaNegativos = s -> s < 0;
		System.out.println(sumar(listaDeNumeros, sumaNegativos));
		Filtro sumaMayores100 = s -> s > 100;
		System.out.println(sumar(listaDeNumeros, sumaMayores100));
		FiltroVariable sumaMayoresVariable = (n1, n2) -> n1 > n2;
		System.out.println(sumarVariables(listaDeNumeros, sumaMayoresVariable));
	}
}
