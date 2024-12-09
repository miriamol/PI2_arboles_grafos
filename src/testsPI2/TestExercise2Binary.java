package testsPI2;

import us.lsi.tiposrecursivos.BinaryTree;
import us.lsi.common.Files2;

import java.util.List;

import exercise2.Exercise2Binary;

public class TestExercise2Binary {

	public static void main(String[] args) {
		System.out.println("=== Test Binary Trees ===");

		// Leer el archivo con los datos de prueba para árboles binarios
		List<String> lines = Files2.streamFromFile("resources/Exercise2Binary.txt").toList();

		for (String line : lines) {
			String[] parts = line.split(";");
			BinaryTree<String> tree = BinaryTree.parse(parts[0], s -> s);
			int k = Integer.parseInt(parts[1]);

			// Llamar al método para procesar el árbol
			List<Integer> resultado = Exercise2Binary.cadenasPorNivel(tree, k);

			// Imprimir resultados
			System.out.println("Árbol: " + tree);
			System.out.println("k: " + k);
			System.out.println("Resultado: " + resultado);
			System.out.println("-----------------------------");
		}
	}
}