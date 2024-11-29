package exercise1;

import us.lsi.tiposrecursivos.BEmpty;
import us.lsi.tiposrecursivos.BLeaf;
import us.lsi.tiposrecursivos.BTree;
import us.lsi.tiposrecursivos.BinaryTree;

public class Exercise1Binary {
	/*
	 * 1. Dado un árbol binario de enteros positivos de un solo dígito, diseñe un
	 * algoritmo que devuelva el número palíndromo de mayor longitud que se forme
	 * desde el nodo raíz a una de las hojas del árbol. En caso de que existan
	 * varios números palíndromos de longitud máxima, devuelva cualquiera de ellos.
	 * En caso de que no exista ningún número palíndromo, devuelva -1. Proporcione
	 * una solución también para árboles n-arios.
	 */

	// Método principal que llama a la versión recursiva
	public static Integer mayorPalindromo(BinaryTree<Integer> tree) {
		return mayorPalindromo(tree, 0);
	}

	// Método recursivo para explorar el árbol
	public static Integer mayorPalindromo(BinaryTree<Integer> tree, int construirPalindromo) {
		return switch (tree) {
		case BEmpty() -> -1; // Árbol vacío, no hay palíndromos
		case BLeaf(var lb) -> {
			int nuevoCamino = construirPalindromo * 10 + lb; // Construir el número
			yield esPalindromo(nuevoCamino) ? nuevoCamino : -1; // Verificar si es palíndromo
		}
		case BTree(var lb, var lt, var rt) -> { // lb represneta el valor del nodo actual en el árbol
			int pIzq = mayorPalindromo(lt, construirPalindromo * 10 + lb); // Explorar izquierda
			int pDer = mayorPalindromo(rt, construirPalindromo * 10 + lb); // Explorar derecha
			yield maximoPalindromo(pIzq, pDer); // Tomar el máximo
		}
		};
	}

	// Función para verificar si un número es palíndromo
	private static boolean esPalindromo(int num) {
		int original = num;
		int invertido = 0;
		while (num > 0) {
			invertido = invertido * 10 + num % 10;
			num /= 10;
		}
		return original == invertido; // Compara el número original con su versión invertida
	}

	//  En caso de que existan varios números palíndromos 
	// de longitud máxima, devuelva cualquiera de ellos.
	private static int maximoPalindromo(int a, int b) {
		if (a == -1 && b == -1)
			return -1; // Si ambos son -1, no hay palíndromos
		if (a == -1)
			return b; // Si 'a' es -1, devolver 'b'
		if (b == -1)
			return a; // Si 'b' es -1, devolver 'a'
		return Math.max(a, b); // Si ambos son válidos, devolver el mayor
	}
}
