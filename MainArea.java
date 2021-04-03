
public class MainArea {

	public static void main(String[] args) {
		//Instanciamento
		Quadrado1 Quadrado1 = new Quadrado1();
		Quadrado2 Quadrado2 = new Quadrado2();
		
		//Quadrado 1
		Quadrado1.altura = 2;
		Quadrado1.base = 100;
		System.out.println("ÁREA QUADRADO 1");
		System.out.println(Quadrado1.calcularArea());
		
		//Quadrado 2
		Quadrado2.altura = 30;
		Quadrado2.base = 50;
		System.out.println("ÁREA QUADRADO 2");
		System.out.println(Quadrado2.calcularArea());

	}

}
