import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {
    private Set<String> guestList;

    // Inicializamos la lista con un HashSet para aprovechar las ventajas de la interfaz Set
    // (evitar duplicados, principalmente)
    public PartyGuestList() {
        guestList = new HashSet<>();
    }

    // Agregamos un invitado al set
    public void addGuest(String guest) {
        guestList.add(guest);
    }

    // Eliminamos un invitado del set
    public void removeGuest(String guest) {
        guestList.remove(guest);
    }

    // Con contains() validamos si el invitado pasado como argumento está en el set
    public boolean isGuestInList(String guest) {
        return guestList.contains(guest);
    }

    // Podemos verificar el tamaño del set
    public int getTotalGuests() {
        return guestList.size();
    }

    // Validamos si el set está vacío
    public boolean isGuestListEmpty() {
        return guestList.isEmpty();
    }
}
