package TA09_05;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Materia m1 = new Materia();
		
		Estudiante arrEstudiante[] = new Estudiante[15];
		arrEstudiante[0] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[1] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[2] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[3] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[4] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[5] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[6] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[7] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[8] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[9] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[10] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[11] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[12] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[13] = new Estudiante("Clara", 23, 'F');
		arrEstudiante[14] = new Estudiante("Clara", 23, 'F');
		
		Profesor p1 = new Profesor("Paco", 54, 'M', m1);
		
		Aula A108 = new Aula(false, m1, p1, arrEstudiante);
		
		if(A108.comprobarClase()) {
			JOptionPane.showMessageDialog(null, "Se puede dar Clase");
		} else {
			JOptionPane.showMessageDialog(null, "No se puede dar Clase");
			System.exit(0);
		}
		
		Boolean[] materias = {true, false, true};
		for (int i = 0; i < arrEstudiante.length; i++) {
			
			 if( JOptionPane.showConfirmDialog(null, "El estudiante: "+arrEstudiante[i].getNombre()+" cursa: matematicas") == 0 ) {
				 materias[0] = true;
			 } else {
				 materias[0] = false;
			 }
			
			 if( JOptionPane.showConfirmDialog(null, "El estudiante: "+arrEstudiante[i].getNombre()+" cursa: filosofia") == 0 ) {
				 materias[1] = true;
			 } else {
				 materias[1] = false;
			 }
			
			 if( JOptionPane.showConfirmDialog(null, "El estudiante: "+arrEstudiante[i].getNombre()+" cursa: fisica") == 0 ) {
				 materias[2] = true;
			 } else {
				 materias[2] = false;
			 }
			 arrEstudiante[i].setNotas(materias);
		}
	}

}
