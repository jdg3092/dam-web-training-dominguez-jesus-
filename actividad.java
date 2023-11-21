public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		int n1, n2, n3, n4;
		int mayor1;
		int mayor2;
		int menor1;
		int menor2;

		System.out.print("Introduce el primer numero: ");
		n1 = lectura.nextInt();
		System.out.print("Introduce el segundo numero: ");
		n2 = lectura.nextInt();
		System.out.print("Introduce el tercer numero: ");
		n3 = lectura.nextInt();
		System.out.print("Introduce el cuarto numero: ");
		n4 = lectura.nextInt();

		mayor1 = Math.max(n1, n2);
		mayor2 = Math.max(n3, n4);

		menor1 = Math.min(n1, n2);
		menor2 = Math.min(n3, n4);

		if (mayor1 <= mayor2 || mayor1 >= mayor2 || menor1 <= menor2 || menor1 >= menor2) {
			System.out.print(
					"Menor es: " + Math.min(menor1, menor2) + " y " + "Mayor es: " + Math.max(mayor1, mayor2));
		}

	}

}
