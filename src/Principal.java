import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Esta es la clase principal de mi proyecto de informática
		//para la asignatura de ticII
		//Aqui se incluye el funcionamiento
		
	
		//tiene que poner el presupeusto que dispone el usario
		Scanner n1 = new Scanner(System.in);
	    System.out.println("Ingrese el presupuesto que dispone en euros para recomendar el juego: ");
	    int presupuesto = n1.nextInt();
	     //mediante entrada datos creo nuevo bojeto de la clase entradadatos y le digo que seleccione la categoria que quiera el juego
	    EntradaDatos ed = new EntradaDatos();
	    String categoria = ed.categorias();
		System.out.println(categoria);
       //los mismo hago para las recomendaciones del juego y mediante esa categoria que ha elegido con el presupuesto le recomiendo el juego
		JuegosPrecios jp = new JuegosPrecios();
		String juegoRecomendado = jp.recomendarJuego(categoria, presupuesto);
		//Imprimo el juego recomendado
		System.out.println(juegoRecomendado);
		
	
		
		
		
		
		
	}

}
