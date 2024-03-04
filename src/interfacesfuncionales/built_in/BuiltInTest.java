package interfacesfuncionales.built_in;

import java.util.Random;

public class BuiltInTest {
	public static void main(String[] args) {
		Random random = new Random();
		MySupplier<Integer> dameNumeroAleatorio = () -> random.nextInt(10)+1;
		System.out.println(dameNumeroAleatorio.get());
		
		MyConsumer<String> devuelvePalabra = s -> System.out.println(s);
		devuelvePalabra.accept("hola");
		
		MyBiConsumer<String, Integer> devuelveNumeroLetras = (s1, i2) -> System.out.printf("La palabra %s con valor %d %s%n",s1,s1.length(),i2 == s1.length()? "es igual en longitud que en valor" : "no es igual en longitud y valor");
		devuelveNumeroLetras.accept("hola", 5);
		
		MyPredicate<String> longitudEsMayorACinco = s -> s.length() > 5;
		System.out.println(longitudEsMayorACinco.test("hola"));
		
		MyBiPredicate<String, Integer> devuelveSiLongitudIgualNumero = (s1, i2) -> s1.length() == i2;
		System.out.println(devuelveSiLongitudIgualNumero.test("Hola", 4));
		
		MyFunction<String, Integer> devuelveLongitudString = s -> s.length();
		System.out.println(devuelveLongitudString.apply("hola"));
		
		MyBiFunction<String, String, Integer> tamanoSumaAmbos = (String s1, String s2) -> s1.length()+s2.length();
		System.out.println(tamanoSumaAmbos.apply("hola", "hola"));
	}
}
