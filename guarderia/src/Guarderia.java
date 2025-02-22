import java.util.ArrayList;

public class Guarderia {

    private String nombre;
    private String nit;
    private ArrayList<Estudiante> listEstudiantes;

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

    public void listarEstudiantes() {

        for (Estudiante estudiante : listEstudiantes) {
            System.out.println("Estudiante " + listEstudiantes.indexOf(estudiante) + " " + estudiante);
        }
    }
    public Guarderia(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listEstudiantes = new ArrayList<>();
    }

    public String getnombre () {
        return nombre;
    }
    public void setnombre (String nombre){
        this.nombre = nombre;
    }

    public String getnit () {
        return nit;
    }

    public void setnit (String nit){
        this.nit = nit;
    }
    public ArrayList<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }
    public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

}