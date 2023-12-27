import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
    private List<String> taskList;

    // Inicializamos una lista de tareas vacía usando el constructor
    public TaskManager() {
        taskList = new ArrayList<>();
    }

    // Agregamos una tarea a la lista
    public void addTask(String task) {
        taskList.add(task);
    }

    // Usando el índice, marcamos una tarea como completada
    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < taskList.size()) {
            // Marcamos la tarea como completada agregando "[COMPLETED]" al inicio
            // Con el método get() recuperamos la tarea especificada por índice
            String completedTask = "[COMPLETED] " + taskList.get(index);
            // Con el método set reemplazamos el elemento en el índice especificado
            taskList.set(index, completedTask);
        } else {
            System.out.println("Índice inválido. La tarea no fue marcada como completada.");
        }
    }

    // Eliminamos una tarea en base al índice especificado, usando el método remove()
    public void removeTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
        } else {
            System.out.println("Índice inválido. La tarea no fue eliminada.");
        }
    }

    // Mostramos la lista de tareas recorriendo con un for
    public void printTaskList() {
        System.out.println("Lista de tareas:");
        int taskNumber = 1;
        for (String task : taskList) {
            System.out.println(taskNumber + ". " + task);
            taskNumber++;
        }
    }

    // Podemos definir otra serie de métodos para hacer validaciones y ordenamientos de nuestra lista

    // Validamos si la tarea se encuentra en la lista
    public boolean containsTask(String task) {
        return taskList.contains(task);
    }

    // Validamos si la lista está vacía
    public boolean isTaskListEmpty() {
        return taskList.isEmpty();
    }

    // Ordenamos la lista alfabéticamente
    public void sortTasksAlphabetically() {
        Collections.sort(taskList);
    }

    // Transformamos la lista en un array
    public String[] getTaskArray() {
        return taskList.toArray(new String[0]);
    }
}
