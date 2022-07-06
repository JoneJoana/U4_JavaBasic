
public class U4_EJ5 {
	
	public static void main(String[] args) {
		
		//inicializacion de variables
		int A = 2;
		int B = 3;
		int C = 4;
		int D = 5;
		
		B = C; //B vale ahora 4;
		C = A; //C vale ahora 2;
		A = D; //A vale ahora 5;
		D = B; //D vale ahora 4;
		
		//añadimos System.out.. para verificar resultados
		System.out.println(B);
		System.out.println(C);
		System.out.println(A);
		System.out.println(D);

	}
}
