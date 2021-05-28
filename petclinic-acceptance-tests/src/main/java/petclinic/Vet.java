package petclinic;

import java.util.List;

public class Vet {
    public String getName() {
        return name;
    }

    public List<String> getSpecialities() {
        return specialities;
    }

    private final String name;

    @Override
    public String toString() {
        return "Vet{" +
                "name='" + name + '\'' +
                ", specialities=" + specialities +
                '}';
    }

    private final List<String> specialities;

    public Vet(String name, List<String> specialities) {
        this.name = name;
        this.specialities = specialities;
    }
}
