package exercise4;

public record RelacionPrecedencia(Integer id) {

    private static int num = 0;

    public static RelacionPrecedencia ofFormat(String[] formato) {
        // No hay información específica en las aristas en este ejemplo
        Integer id = num++;
        return new RelacionPrecedencia(id);
    }

    @Override
    public String toString() {
        return "Relacion-" + this.id;
    }
}
