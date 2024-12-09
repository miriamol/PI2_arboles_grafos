package exercise2;

import java.util.ArrayList;
import java.util.List;

import us.lsi.tiposrecursivos.TEmpty;
import us.lsi.tiposrecursivos.TLeaf;
import us.lsi.tiposrecursivos.TNary;
import us.lsi.tiposrecursivos.Tree;

public class Exercise2Nary {

	public static List<Integer> cadenasPorNivel(Tree<String> tree, int k) {
		return procesar(tree, k, 0, new ArrayList<>());
	}

	private static List<Integer> procesar(Tree<String> tree, int k, int nivel, List<Integer> resultado) {
		if (resultado.size() <= nivel) {
			resultado.add(0);
		}

		if (tree instanceof TEmpty) {
			// Árbol vacío: no hacer nada
		} else if (tree instanceof TLeaf<String> leaf) {
			if (leaf.label().length() > k) {
				resultado.set(nivel, resultado.get(nivel) + 1);
			}
		} else if (tree instanceof TNary<String> nary) {
			if (nary.label().length() > k) {
				resultado.set(nivel, resultado.get(nivel) + 1);
			}
			for (Tree<String> child : nary.children()) {
				procesar(child, k, nivel + 1, resultado);
			}
		}

		return resultado;
	}
}