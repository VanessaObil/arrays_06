package unico;

public class Ej_06 {
	final static int TOTAL_ALUM = 5;
	final static int TOTAL_TRIM = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Double [] [] notas = new Double [TOTAL_ALUM][TOTAL_TRIM];
		introducirNotas(notas);
		for (int trimestre= 0; trimestre< TOTAL_TRIM; trimestre++) {
			System.out.print("" + mediaTrimestre(notas, trimestre));
		}
	}
	private static void introducirNotas(Double[][] notas) {
		// TODO Auto-generated method stub
		for (int trimestre = 0; trimestre< TOTAL_TRIM; trimestre++) {
			System.out.print("Notas trimestre" + (trimestre +1 ));
			for(int alumno = 0; alumno< TOTAL_ALUM; alumno++) {
				notas[alumno][trimestre] =Util.leerDouble("alumno" + (alumno+1) + ":");
			}
		}
	}
	private static double mediaTrimestre(Double[][] notas,int trimestre) {
		
		return trimestre;
		
	}

}
