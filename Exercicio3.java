import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		int i;
		final int TAM =10;
		int a [];
		int b[];
		
		a = new int [10];
		b = new int [10];
		

				for (i=0; i<10; i++){
					System.out.println("digite os valores");
					a[i] = ler.nextInt();
				    b[i] = a[i];
	}
				System.out.print("ao contrario: ");
				for (i=9; i>=0; i--){
					System.out.println(+b[i]);
					
				}
 
        
        ler.close();

	}

}
