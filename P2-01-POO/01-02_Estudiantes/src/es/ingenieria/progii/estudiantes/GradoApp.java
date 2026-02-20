package es.ingenieria.progii.estudiantes;

public class GradoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grado g1 = new Grado();
		Grado g2 = new Grado();
		
		Estudiante e1 = new Estudiante("Bruce Wayne", "123456", 1);
		Estudiante e2 = new Estudiante("Bruce Banner", "123457", 1);
		Estudiante e3 = new Estudiante("Peter Parker", "123458", 1);
		Estudiante e4 = new Estudiante("Alvaro Ochoa", "123459", 1);
		
		Asignatura a1 = new Asignatura();
		
		e1.añadirAsignatura(a1);
		
		g1.añadirEstudiante(e1);
		g1.añadirEstudiante(e2);
		g2.añadirEstudiante(e3);
		g2.añadirEstudiante(e4);

	}

}
