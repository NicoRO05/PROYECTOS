import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Pequeños Gigantes", "123456789");
        agregarEstudiantesBase(guarderia);

        String opcion = JOptionPane.showInputDialog("""
                Menú de la Guardería:
                1. Agregar estudiante
                2. Listar todos los estudiantes
                3. Listar estudiantes mayores de 5 años
                4. Actualizar estudiante
                5. Eliminar estudiante
                Elige una opción:""");

        switch (opcion) {
            case "1" -> agregarEstudiante(guarderia);
            case "2" -> listarEstudiantes(guarderia);
            case "3" -> listarMayoresDe5(guarderia);
            case "4" -> actualizarEstudiante(guarderia);
            case "5" -> eliminarEstudiante(guarderia);
            default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
        mostrarEstudiantesFinal(guarderia);
    }

    public static void agregarEstudiante(Guarderia guarderia) {
        String documento;
        do {
            documento = JOptionPane.showInputDialog("Ingrese el documento de identidad:");
            if (guarderia.buscarEstudiantePorDocumento(documento) != null) {
                JOptionPane.showMessageDialog(null, "Error: El documento ya está registrado. Ingrese otro.");
            }
        } while (guarderia.buscarEstudiantePorDocumento(documento) != null);

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
        String genero = JOptionPane.showInputDialog("Ingrese el género:");
        String alergias = JOptionPane.showInputDialog("Ingrese las alergias:");
        String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente:");
        String contactoAcudiente = JOptionPane.showInputDialog("Ingrese el contacto del acudiente:");

        Estudiante newEstudiante = new Estudiante(nombre, edad, genero, documento, alergias, nombreAcudiente, contactoAcudiente);
        guarderia.agregarEstudiante(newEstudiante);
        JOptionPane.showMessageDialog(null, "Estudiante agregado exitosamente con Documento: " + documento);
    }

    public static void listarEstudiantes(Guarderia guarderia) {
        JOptionPane.showMessageDialog(null, guarderia.listarEstudiantes());
    }

    public static void listarMayoresDe5(Guarderia guarderia) {
        JOptionPane.showMessageDialog(null, guarderia.listarMayoresDe5());
    }

    public static void actualizarEstudiante(Guarderia guarderia) {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del estudiante a actualizar:");
        Estudiante estudianteEncontrado = guarderia.buscarEstudiantePorDocumento(documento);

        if (estudianteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
            return;
        }

        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:", estudianteEncontrado.getNombre());
        int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog("Nueva edad:", estudianteEncontrado.getEdad()));
        String nuevoGenero = JOptionPane.showInputDialog("Nuevo género:", estudianteEncontrado.getGenero());
        String nuevasAlergias = JOptionPane.showInputDialog("Nuevas alergias:", estudianteEncontrado.getAlergias());
        String nuevoAcudiente = JOptionPane.showInputDialog("Nuevo nombre del acudiente:", estudianteEncontrado.getNombreAcudiente());
        String nuevoContacto = JOptionPane.showInputDialog("Nuevo contacto del acudiente:", estudianteEncontrado.getContactoAcudiente());

        estudianteEncontrado.setNombre(nuevoNombre);
        estudianteEncontrado.setEdad(nuevaEdad);
        estudianteEncontrado.setGenero(nuevoGenero);
        estudianteEncontrado.setAlergias(nuevasAlergias);
        estudianteEncontrado.setNombreAcudiente(nuevoAcudiente);
        estudianteEncontrado.setContactoAcudiente(nuevoContacto);

        JOptionPane.showMessageDialog(null, "Estudiante actualizado correctamente.");
    }

    public static void eliminarEstudiante(Guarderia guarderia) {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del estudiante a eliminar:");
        Estudiante estudianteEliminar = guarderia.buscarEstudiantePorDocumento(documento);

        if (estudianteEliminar != null) {
            guarderia.eliminarEstudiante(estudianteEliminar);
            JOptionPane.showMessageDialog(null, "Estudiante eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }

    public static void agregarEstudiantesBase(Guarderia guarderia) {
        guarderia.agregarEstudiante(new Estudiante("Nicolas", 19, "Masculino", "1091202801", "Ninguna", "Maria", "3218905052"));
        guarderia.agregarEstudiante(new Estudiante("Santiago", 24, "Masculino", "1091202802", "Polvo", "Carlos", "3219805053"));
        guarderia.agregarEstudiante(new Estudiante("Julian", 4, "Masculino", "1091202803", "Gatos", "Mary", "3218905054"));
        guarderia.agregarEstudiante(new Estudiante("Sofía", 3, "Femenino", "1091202804", "Maní", "Javier", "3194567890"));
        guarderia.agregarEstudiante(new Estudiante("Carlos", 15, "Masculino", "1091202806", "Ninguna", "Walter", "3007891234"));
    }

    public static void mostrarEstudiantesFinal(Guarderia guarderia) {
        JOptionPane.showMessageDialog(null, guarderia.listarEstudiantes());
    }
}



