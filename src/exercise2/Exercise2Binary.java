package exercise2;

import java.util.ArrayList;
import java.util.List;

import us.lsi.tiposrecursivos.BEmpty;
import us.lsi.tiposrecursivos.BLeaf;
import us.lsi.tiposrecursivos.BTree;
import us.lsi.tiposrecursivos.BinaryTree;

public class Exercise2Binary {

    /* 2. Dado un árbol binario de cadena de caracteres y un entero k, diseñe un algoritmo que 
     * devuelva una lista de enteros de forma que el elemento i-ésimo de la lista sea el número 
     * de cadenas del nivel i con longitud mayor que k.
     */

    // Método principal
    public static List<Integer> cadenasPorNivel(BinaryTree<String> tree, int k) {
        List<Integer> res = new ArrayList<>();
        recursivo(tree, k, 0, res);
        return res;
    }

    // Método recursivo
    private static void recursivo(BinaryTree<String> tree, int k, int nivel, List<Integer> res) {
        // Asegúrate de que la lista tenga un espacio para el nivel actual
        if (res.size() <= nivel) {
            res.add(0);
        }

        switch (tree) {
            case BEmpty<String> t -> {;}
                // Árbol vacío, no hacemos nada
            case BLeaf<String> t -> {
                // Verificar longitud de la etiqueta en hojas
                if (t.label().length() > k) {
                    res.set(nivel, res.get(nivel) + 1);
                }
            }
            case BTree<String> t -> {
                // Verificar longitud de la etiqueta en nodos internos
                if (t.label().length() > k) {
                    res.set(nivel, res.get(nivel) + 1);
                }
                // Procesar subárboles izquierdo y derecho
                recursivo(t.left(), k, nivel + 1, res);
                recursivo(t.right(), k, nivel + 1, res);
            }
        }
    }
}
