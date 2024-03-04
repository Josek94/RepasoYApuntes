package interfacesfuncionales.String;

public class Ejemplo1 {
	public static void main(String[] args) {
		
		InterfaceStrings cadenasIguales = (s1, s2) -> s1.equals(s2);
		System.out.println(cadenasIguales.comprobacion("hola", "hola"));
		InterfaceStrings contieneParametro = (s1, s2) -> s1.contains(s2);
		System.out.println(contieneParametro.comprobacion("hola", "hola"));
		InterfaceStrings empiezaPorX = (s1, s2) -> s1.startsWith(s2);
		System.out.println(empiezaPorX.comprobacion("hola", "a"));
		InterfaceStrings terminaPorX = (s1, s2) -> s1.endsWith(s2);
		System.out.println(terminaPorX.comprobacion("hola.", "."));
		
		
	}
}
