

public class Cuadrado {

	
	public int lado = 177808 ;
	public double longitud;

	public int area () {
		return lado * lado;
	}
	public int perimetro () {
		return lado*4;
	}
	public double diagonal () { 
		return longitud = Math.sqrt(Math.pow(lado, 2)+ Math.pow(lado, 2));
	}
	public int camabiaLado (int lado) {
		return this.lado = lado;
	}

}
