package exercise1;

import us.lsi.tiposrecursivos.Tree;

public class Exercise1Nary {

	public static Integer mayorPalindromo(Tree<Integer> tree) {
		return mayorPalindromo(tree, "");
	}

	private static Integer mayorPalindromo(Tree<Integer> tree, String construirPalindromo) {
		return switch (tree.type()) {
		case Empty -> -1;
		case Leaf -> {
			String nuevoCamino = construirPalindromo + tree.optionalLabel().orElse(0);
			Integer valor = Integer.valueOf(nuevoCamino);
			yield esPalindromo(nuevoCamino) ? valor : -1;
		}
		case Nary -> {
			String nuevoCamino = construirPalindromo + tree.optionalLabel().orElse(-1);
			Integer maxPalindromo = null;
			for (Tree<Integer> child : tree.children()) {
				Integer palindromoHijo = mayorPalindromo(child, nuevoCamino);
				maxPalindromo = maximoPalindromo(maxPalindromo, palindromoHijo);
			}
			yield maxPalindromo;
		}
		};
	}

	private static Boolean esPalindromo(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static Integer maximoPalindromo(Integer a, Integer b) {
		if (a == null && b == null)
			return -1;
		if (a == null)
			return b;
		if (b == null)
			return a;
		return Math.max(a, b);
	}
}
