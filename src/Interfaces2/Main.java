package Interfaces2;

public class Main {
    
	public static void main(String[] args) {
        RangoPares rango = new RangoPares(10, 30);

        System.out.println("Números pares entre 10 y 30:");
        for (int num : rango) {
            System.out.print(num + " ");
        }
    }
}
