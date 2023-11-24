package nti.dev.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {

//o 3° nummero é a soma dos 2 últimos começando de 0
		
        int a = 1, b = 0, aux;
        
        System.out.print(b);
        
        for(int i = 0; i < 14; i++){
            System.out.print(", "+a);
            aux = a;
            a = aux + b;
            b = aux; //resultado anterior
        }
	}
}
