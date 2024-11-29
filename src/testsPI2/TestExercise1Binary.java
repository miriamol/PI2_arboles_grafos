package testsPI2;

import java.util.List;
import us.lsi.common.Files2;
import us.lsi.common.Preconditions;
import us.lsi.tiposrecursivos.BinaryTree;
import exercise1.Exercise1Binary;

public class TestExercise1Binary {

    public static void main(String[] args) {
        // Ruta al archivo de entrada
        String file = "resources/Exercise1Binary.txt";

        // Leer y procesar las líneas del archivo
        List<BinaryTree<Integer>> inputs =
            Files2.streamFromFile(file).map(linea -> {
                Preconditions.checkNotNull(linea, "La línea no puede ser nula");
                return BinaryTree.parse(linea, Integer::parseInt); // Parsear el árbol
            }).toList();

        System.out.println("\n.....................................................................................................");
        System.out.println("EJERCICIO 1: TEST DE MAYOR PALÍNDROMO");
        System.out.println(".....................................................................................................\n");

        // Probar cada entrada del archivo
        inputs.stream().forEach(tree -> {
            System.out.println("Árbol: " + tree + "\tMayor palíndromo: " + Exercise1Binary.mayorPalindromo(tree));
        });
    }
}
