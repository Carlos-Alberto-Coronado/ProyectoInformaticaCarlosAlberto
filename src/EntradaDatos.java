import java.util.Scanner;

public class EntradaDatos {

	//Introducir las variables dependiendo de que categoria quiera el usuario
	
	
        String categorias() 
        {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introduzca la categoria deseada:");
		System.out.println("Terror");
		System.out.println("Aventura");
		System.out.println("Diversión");
		String categoria;
		int selector;
		selector = n1.nextInt();
		//En caso de seleccionar del 1-4 tiene que decir la categoria seleccionada
		switch(selector) 
		{
		
		case 0: categoria = "No se puede recomendar ninguna categoría";
				return categoria;
		case 1: categoria = "Terror";
				return categoria;
		case 2: categoria ="Aventura";
				return categoria;	
		case 3:	categoria = "Diversión";
				return categoria;

		default:return categoria = "no tenemos esta categoria implementada";
				
		
		}
		
	}
	

		

		
		
		

}
	
	
	
	
	
	

