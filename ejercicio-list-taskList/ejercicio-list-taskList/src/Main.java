public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Agregamos tareas a la lista
        taskManager.addTask("Completar lección 7");
        taskManager.addTask("Hacer las compras");
        taskManager.addTask("Revisar el canal de slack");
        taskManager.addTask("Prepararme para el code review!");

        // Marcamos una tarea como completada
        taskManager.markTaskAsCompleted(0);

        // Eliminamos una tarea
        taskManager.removeTask(2);

        // Imprimimos la lista de tareas
        taskManager.printTaskList();

        // Validamos si una tarea está dentro de la lista
        System.out.println("¿Contiene 'Hacer la compra'?: " + taskManager.containsTask("Hacer las compras"));

        // Validamos si la lista está vacía
        System.out.println("¿La lista de tareas está vacía?: " + taskManager.isTaskListEmpty());

        // Ordenamos la lista, luego la transformamos en un array y recorremos el array
        taskManager.sortTasksAlphabetically();
        String[] taskArray = taskManager.getTaskArray();
        System.out.println("Tareas ordenadas alfabéticamente:");
        for (String task : taskArray) {
            System.out.println(task);
        }
    }
}