

public class JuegosPrecios {

		String recomendarJuego(String categoria, int presupuesto)
		{
        String juegoRecomendado;

        // Determinar el juego según la categoría y el presupuesto utilizando if-else
        if (categoria.equalsIgnoreCase("Terror"))
        {
        	//Limito el presupeusto entre 10 y 20, recomiendo un juego
            if (presupuesto >= 10 && presupuesto <= 20)
            {
                juegoRecomendado = "Le recomendamos Phasmophobia, un juego divertido y cooperativo para encontrar fantasmas en una casa o similar, como Ghost Watchers.";
            } else if (presupuesto > 20 && presupuesto <= 30) 
            	//lo mismo pero entre 20 y 30 euros
            {
                juegoRecomendado = "Le recomendamos Outlast, un juego de terror psicológico que te mantendrá al filo del miedo.";
            } else
            {
                juegoRecomendado = "Por el momento no tenemos juegos que recomendar con ese presupuesto.";
            }
        	} 
        	else if (categoria.equalsIgnoreCase("Aventura"))
        	{
            if (presupuesto >= 30 && presupuesto <= 50) 
            {
                juegoRecomendado = "Le recomendamos Mario and Rabbids, un juego divertido basado en el personaje Mario + Rabbids Kingdom Battle";
            }
            else if (presupuesto > 50 && presupuesto <= 80) 
            {
                juegoRecomendado = "Le recomendamos The Legend of Zelda: Breath of the Wild, un juego de aventuras épico en un mundo abierto.";
            } else 
            {
                juegoRecomendado = "Por el momento no tenemos juegos que recomendar con ese presupuesto.";
            }
        	}
        	else if (categoria.equalsIgnoreCase("Diversión"))
        	{
        	if (presupuesto >= 0 && presupuesto <= 10) 
            {
                juegoRecomendado = "Le recomendamos Fall Guys, un juego de diversión y risas para jugar con tus amigos.";
            }
            else if (presupuesto > 10 && presupuesto <= 30) 
            {
                juegoRecomendado = "Le recomendamos Left 4 Dead 2, un grupo de 4 integrantes luchando por sobrevivir en un apocalipsis zombie.";
            }
            else 
            {
                juegoRecomendado = "Por el momento no tenemos juegos que recomendar con ese presupuesto.";
            }
        	}
        	else 
        	{
        		juegoRecomendado = "No se puede recomendar juegos.";
        	}
        //devuelvo segun lo que ha seleccionado el usuario la respuesta adecuada

        return juegoRecomendado;
    }
	
}

	
			

		
			
		        
		
		
		
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

