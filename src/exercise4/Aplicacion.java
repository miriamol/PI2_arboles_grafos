package exercise4;

import java.util.Objects;

public record Aplicacion(String id) {

    public static Aplicacion ofFormat(String[] formato) {
        String id = formato[0].trim();
        return new Aplicacion(id);
    }

    @Override
    public String toString() {
        return this.id;
    }

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aplicacion other = (Aplicacion) obj;
		return Objects.equals(id, other.id);
	}
}
