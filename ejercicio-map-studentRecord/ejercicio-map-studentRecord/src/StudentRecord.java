import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentRecord {

    // El map es definido con una key String (nombre) y un value Integer (nota)
    private Map<String, Integer> studentMap;

    // Inicializamos un HashMap
    public StudentRecord() {
        studentMap = new HashMap<>();
    }

    // Agregamos un estudiante con nombre y nota al map por medio del método put()
    public void addStudent(String name, int grade) {
        studentMap.put(name, grade);
    }

    // Eliminamos un estusiante a través de la clave
    public void removeStudent(String name) {
        studentMap.remove(name);
    }

    // Obtenemos un estudiante por la clave
    public Integer getGrade(String name) {
        return studentMap.get(name);
    }

    // Validamos a través de la clave si el estudiante está en el map
    public boolean isStudentInRecord(String name) {
        return studentMap.containsKey(name);
    }

    // Podemos verificar si una nota está en el map
    public boolean isGradeInRecord(int grade) {
        return studentMap.containsValue(grade);
    }

    // Con el método keySet() obtenemos todas las claves del map y luego en el main, haremos un recorrido para mostrar por consola
    public Set<String> getStudentNames() {
        return studentMap.keySet();
    }}
