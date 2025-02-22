import java.util.ArrayList;

public class Guarderia {

    private String nombre;
    private String nit;
    private ArrayList<Estudiante> listEstudiantes;

    public Guarderia(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante newEstudiante) {
        listEstudiantes.add(newEstudiante);
    }

    public void eliminarEstudiante(Estudiante eliminarEstudiante) {
        listEstudiantes.remove(eliminarEstudiante);
    }

    public void actualizarEstudiante(Estudiante estudianteActualizar) {
        for (Estudiante indexEstudiante : listEstudiantes) {
            if (indexEstudiante.getDocumento().equals(estudianteActualizar.getDocumento())) {
                indexEstudiante.setNombre(estudianteActualizar.getNombre());
                indexEstudiante.setEdad(estudianteActualizar.getEdad());
                indexEstudiante.setGenero(estudianteActualizar.getGenero());
                indexEstudiante.setNombreAcudiente(estudianteActualizar.getNombreAcudiente());
                indexEstudiante.setContactoAcudiente(estudianteActualizar.getContactoAcudiente());
                indexEstudiante.setAlergias(estudianteActualizar.getAlergias());
                break;
            }
        }
    }

    public String listarEstudiantes() {
        if (listEstudiantes.isEmpty()) {
            return "No hay estudiantes registrados.";
        }

        StringBuilder lista = new StringBuilder("Lista de Estudiantes:\n");
        for (Estudiante estudiante : listEstudiantes) {
            lista.append(estudiante).append("\n");
        }
        return lista.toString();
    }

    public String listarMayoresDe5() {
        ArrayList<Estudiante> mayores = new ArrayList<>();

        for (Estudiante estudiante : listEstudiantes) {
            if (estudiante.getEdad() > 5) {
                mayores.add(estudiante);
            }
        }

        if (mayores.isEmpty()) {
            return "No hay estudiantes mayores de 5 años.";
        }

        StringBuilder lista = new StringBuilder("Estudiantes mayores de 5 años:\n");
        for (Estudiante estudiante : mayores) {
            lista.append(estudiante).append("\n");
        }
        return lista.toString();
    }

    public Estudiante buscarEstudiantePorDocumento(String documento) {
        for (Estudiante estudiante : listEstudiantes) {
            if (estudiante.getDocumento().equals(documento)) {
                return estudiante;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }
}
