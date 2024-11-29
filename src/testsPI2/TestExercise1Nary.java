package testsPI2;

import java.util.List;

import us.lsi.tiposrecursivos.Tree;


import exercise1.Exercise1Nary;
import us.lsi.common.Files2;
import us.lsi.common.Preconditions;

public class TestExercise1Nary {
	
	public static void main(String[] args) {
		// Ruta al archivo de entrada
		String file = "resources/Exercise1Nary.txt";

		// Leer y procesar las líneas del archivo
		List<Tree<Integer>> inputs = Files2.streamFromFile(file).map(linea -> {
			Preconditions.checkNotNull(linea, "La línea no puede ser nula");
			return Tree.parse(linea, Integer::parseInt); // Parsear el árbol
		}).toList();

		System.out.println(
				"\n.....................................................................................................");
		System.out.println("EJERCICIO 1: TEST DE MAYOR PALÍNDROMO NARY");
		System.out.println(
				".....................................................................................................\n");

		// Probar cada entrada del archivo
		inputs.stream().forEach(tree -> {
			System.out.println("Árbol: " + tree + "\tMayor palíndromo: " + Exercise1Nary.mayorPalindromo(tree));
		});
	}
}
