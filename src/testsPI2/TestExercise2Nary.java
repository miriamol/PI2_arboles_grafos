package testsPI2;

import us.lsi.tiposrecursivos.Tree;
import us.lsi.common.Files2;

import java.util.List;

import exercise2.Exercise2Nary;

public class TestExercise2Nary {

	public static void main(String[] args) {
		System.out.println("=== Test Nary Trees ===");

		// Leer el archivo con los datos de prueba para árboles n-arios
		List<String> lines = Files2.streamFromFile("resources/Exercise2Nary.txt").toList();

		for (String line : lines) {
			String[] parts = line.split(";");
			Tree<String> tree = Tree.parse(parts[0], s -> s);
			int k = Integer.parseInt(parts[1]);

			// Llamar al método para procesar el árbol
			List<Integer> resultado = Exercise2Nary.cadenasPorNivel(tree, k);

			// Imprimir resultados
			System.out.println("Árbol: " + tree);
			System.out.println("k: " + k);
			System.out.println("Resultado: " + resultado);
			System.out.println("-----------------------------");
		}
	}
}