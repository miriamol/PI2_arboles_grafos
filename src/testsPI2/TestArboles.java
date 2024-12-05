package testsPI2;

import java.util.List;
import java.util.function.Consumer;

import exercise1.Exercise1Binary;
import exercise1.Exercise1Nary;
import exercise2.Exercise2Binary;
import exercise2.Exercise2Nary;
import us.lsi.common.Files2;
import us.lsi.tiposrecursivos.BinaryTree;
import us.lsi.tiposrecursivos.Tree;

public class TestArboles {


	public static final String C = "-";
	public static final int N = 60;

	private static void separador(String caracter, Integer n) {
		System.out.println(caracter.repeat(n));
	}

	private static <E> void test(String s, Consumer<E> cons, List<E> inputs) {
		System.out.println(s);
		inputs.forEach(cons);
		separador(C, N);
	}

	private static void header(String s) {
		System.out.println("\n" + C.repeat(N));
		System.out.println(s);
		separador(C, N);
	}

	private static void testExercise1() {
		String file1Binary = "resources/Exercise1Binary.txt";
		String file1Tree = "resources/Exercise1Nary.txt";
		List<BinaryTree<Integer>> inputsBinary = Files2.streamFromFile(file1Binary)
				.map(linea -> BinaryTree.parse(linea, s -> Integer.valueOf(s))).toList();
		List<Tree<Integer>> inputsTree = Files2.streamFromFile(file1Tree)
				.map(linea -> Tree.parse(linea, s -> Integer.valueOf(s))).toList();
		header("EJERCICIO 1");
		test("Prueba de mayor palíndromo para un Árbol Binario",
				e -> System.out.println(e + " -> " + Exercise1Binary.mayorPalindromo(e)), inputsBinary);
		test("Prueba de mayor palíndromo para un Árbol N-ario",
				e -> System.out.println(e + " -> " + Exercise1Nary.mayorPalindromo(e)), inputsTree);
	}

	private static void testExercise2() {
		String file2Binary = "resources/Exercise2Binary.txt";
		String file2Tree = "resources/Exercise2Nary.txt";
		int k = 0;
		List<BinaryTree<String>> inputsBinary = Files2.streamFromFile(file2Binary)
				.map(linea -> BinaryTree.parse(linea, s -> s)).toList();
		List<Tree<String>> inputsTree = Files2.streamFromFile(file2Tree).map(linea -> Tree.parse(linea, s -> s))
				.toList();
		header("EJERCICIO 2");
		test("Lista para árbol Binario: i-ésimo valor = cadenas nivel i > k=" + k,
				e -> System.out
						.println(e + " (size = " + e.height() + ")" + " -> " + Exercise2Binary.cadenasPorNivel(e, k)),
				inputsBinary);
		test("Lista para árbol N-ario: i-ésimo valor = cadenas nivel i > k=" + k,
				e -> System.out
						.println(e + " (size = " + e.height() + ")" + " -> " + Exercise2Nary.cadenasPorNivel(e, k)),
				inputsTree);
	}

	public static void main(String[] args) {
		testExercise1();
		testExercise2();
	}
}
