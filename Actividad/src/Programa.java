

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado a = new Cuadrado();
		Circulo b = new Circulo();
		
		//a.camabiaLado(8);
		System.out.println("El area del cuadrado es: " + a.area());
		System.out.println("El perimetro del cuadrado es: " + a.perimetro());
		System.out.println("La diagonal del cuadrado es: " + a.diagonal());
		
		//b.cambiaRadio(177808);
		System.out.println("La circunferencia del circulo es: " + b.circunferencia());
		System.out.println("El area del circulo es: " + b.area());
		
		System.out.println(a.lado);
		System.out.println(b.radio);

	}

}

