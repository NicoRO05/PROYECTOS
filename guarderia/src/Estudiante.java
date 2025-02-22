public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String documento;
    private String alergias;
    private String nombreAcudiente;
    private String contactoAcudiente;

    public Estudiante(String nombre, int edad, String genero, String documento, String alergias, String nombreAcudiente, String contactoAcudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.contactoAcudiente = contactoAcudiente;

    }

    @Override
    public String toString() {
        return "Estudiante: " +
                "Nombre: '" + nombre + '\'' +
                ", Edad: '" + edad + '\'' +
                ", Genero: '" + genero + '\'' +
                ", Documento: '" + documento + '\'' +
                ", Alergias: '" + alergias + '\'' +
                ", Nombre del Acudiente: '" + nombreAcudiente + '\'' +
                ", Contacto del Acudiente: '" + contactoAcudiente + '\n';
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    public String getNombreAcudiente() {
        return nombreAcudiente;
    }
    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }
    public String getContactoAcudiente() {
        return contactoAcudiente;
    }
    public void setContactoAcudiente(String contactoAcudiente) {
        this.contactoAcudiente = contactoAcudiente;
    }
}
