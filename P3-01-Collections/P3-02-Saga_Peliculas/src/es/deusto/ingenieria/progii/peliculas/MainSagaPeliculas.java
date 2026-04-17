package es.deusto.ingenieria.progii.peliculas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class MainSagaPeliculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SagaPeliculas sagaPeliculas = new SagaPeliculas();
		sagaPeliculas.setNombreSaga("Marvel");
		sagaPeliculas.getListaPelis().add(new Pelicula("Iron Man", LocalDate.of(2008, 5, 2), "1"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Iron Man 2", LocalDate.of(2010, 5, 7), "1"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Iron Man 3", LocalDate.of(2013, 5, 3), "2"));
		sagaPeliculas.getListaPelis().add(new Pelicula("The Incredible Hulk", LocalDate.of(2008, 6, 13), "1"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Thor", LocalDate.of(2011, 5, 6), "1"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Thor: The Dark World", LocalDate.of(2013, 11, 8), "2"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Thor: Ragnarok", LocalDate.of(2017, 11, 3), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Captain America: The First Avenger", LocalDate.of(2011, 7, 22), "1"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Captain America: The Winter Soldier", LocalDate.of(2014, 4, 4), "2"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Capitán América: Civil War", LocalDate.of(2016, 5, 6), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Spider-Man: Homecoming", LocalDate.of(2017, 7, 7), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Spider-Man: Lejos de casa", LocalDate.of(2019, 7, 4), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Guardianes de la Galaxia", LocalDate.of(2014, 8, 1), "2"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Guardianes de la Galaxia vol. 2", LocalDate.of(2017, 5, 5), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Ant-Man", LocalDate.of(2015, 7, 17), "2"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Ant-Man and the Wasp", LocalDate.of(2018, 7, 6), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Doctor Strange", LocalDate.of(2016, 11, 4), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Black Panther", LocalDate.of(2018, 2, 16), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Capitana Marvel", LocalDate.of(2019, 3, 8), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("The Avengers", LocalDate.of(2012, 5, 4), "1"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Avengers: Age of Ultron", LocalDate.of(2015, 5, 1), "2"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Avengers: Endgame", LocalDate.of(2019, 4, 26), "3"));
		sagaPeliculas.getListaPelis().add(new Pelicula("Avengers: Infinity War", LocalDate.of(2018, 4, 27), "3"));
		
		System.out.println(sagaPeliculas);
		// Salida esperada: SagaPeliculas [nombreSaga=null, listaPelis=[Pelicula [nombre=Iron Man, fecha=2008-05-02, categoria=1], Pelicula [nombre=Iron Man 2, fecha=2010-05-07, categoria=1], Pelicula [nombre=Iron Man 3, fecha=2013-05-03, categoria=2], Pelicula [nombre=The Incredible Hulk, fecha=2008-06-13, categoria=1], Pelicula [nombre=Thor, fecha=2011-05-06, categoria=1], Pelicula [nombre=Thor: The Dark World, fecha=2013-11-08, categoria=2], Pelicula [nombre=Thor: Ragnarok, fecha=2017-11-03, categoria=3], Pelicula [nombre=Captain America: The First Avenger, fecha=2011-07-22, categoria=1], Pelicula [nombre=Captain America: The Winter Soldier, fecha=2014-04-04, categoria=2], Pelicula [nombre=Capitán América: Civil War, fecha=2016-05-06, categoria=3], Pelicula [nombre=Spider-Man: Homecoming, fecha=2017-07-07, categoria=3], Pelicula [nombre=Spider-Man: Lejos de casa, fecha=2019-07-04, categoria=3], Pelicula [nombre=Guardianes de la Galaxia, fecha=2014-08-01, categoria=2], Pelicula [nombre=Guardianes de la Galaxia vol. 2, fecha=2017-05-05, categoria=3], Pelicula [nombre=Ant-Man, fecha=2015-07-17, categoria=2], Pelicula [nombre=Ant-Man and the Wasp, fecha=2018-07-06, categoria=3], Pelicula [nombre=Doctor Strange, fecha=2016-11-04, categoria=3], Pelicula [nombre=Black Panther, fecha=2018-02-16, categoria=3], Pelicula [nombre=Capitana Marvel, fecha=2019-03-08, categoria=3], Pelicula [nombre=The Avengers, fecha=2012-05-04, categoria=1], Pelicula [nombre=Avengers: Age of Ultron, fecha=2015-05-01, categoria=2], Pelicula [nombre=Avengers: Endgame, fecha=2019-04-26, categoria=3], Pelicula [nombre=Avengers: Infinity War, fecha=2018-04-27, categoria=3]]]
		
		/**TODO: ordenar por nombres de las peliculas**/
		Collections.sort(sagaPeliculas.getListaPelis());
		System.out.println( "Orden por Nombres:" );
		for(Pelicula pelicula : sagaPeliculas.getListaPelis()) {
			System.out.println(pelicula);
		}
		
		/**TODO: ordenar por fechas las peliculas**/
		Collections.sort(sagaPeliculas.getListaPelis(), new ComparadorPorFecha());
		System.out.println( "\nOrden por Fechas:" );
		for(Pelicula pelicula : sagaPeliculas.getListaPelis()) {
			System.out.println(pelicula);
		}
		
		/**Recorrer peliculas con Iterador**/
		System.out.println( "\nRecorrido con iterator:" );
		IteradorPeliculas iterador = new IteradorPeliculas(sagaPeliculas.getListaPelis());
		while (iterador.hasNext()) {
		    Pelicula p = iterador.next();
		    System.out.println(p);
		}
		
		/**Mapa con la clasificacion de las peliculas por categoria**/
		Map<String, ArrayList<String>> mapaCategorias = sagaPeliculas.mapaPeliculasCategoria ();
		System.out.println( "\nMapa de clasificacion por categorias:" + mapaCategorias);
	}

}
