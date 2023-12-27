import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord();

        // Agregamos estudiantes al map
        studentRecord.addStudent("Juan", 85);
        studentRecord.addStudent("Maria", 90);
        studentRecord.addStudent("Pedro", 78);

        // Validamos si el estaudiante está en el map
        System.out.println("¿Está Juan en el registro de alumnos?: " + studentRecord.isStudentInRecord("Juan"));
        System.out.println("¿Está Ana en el registro de alumnos?: " + studentRecord.isStudentInRecord("Ana"));

        // Obtebemos una calificación con la clave, el nombre del estudiante
        System.out.println("Calificación de Pedro: " + studentRecord.getGrade("Pedro"));

        studentRecord.removeStudent("Maria");
        System.out.println("¿Está Maria en el registro de alumnos?: " + studentRecord.isStudentInRecord("Maria"));

        System.out.println("¿La calificación 85 está en el registro?: " + studentRecord.isGradeInRecord(85));

        // Obtenemos las claves del map para luego recorrer el map
        Set<String> studentNames = studentRecord.getStudentNames();
        System.out.println("Nombres de los alumnos en el registro:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}