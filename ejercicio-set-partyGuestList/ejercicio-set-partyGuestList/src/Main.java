public class Main {
    public static void main(String[] args) {
        PartyGuestList partyGuestList = new PartyGuestList();

        // Agregamos invitados a la lista
        partyGuestList.addGuest("Juan");
        partyGuestList.addGuest("Maria");
        partyGuestList.addGuest("Pedro");

        // Utilizamos los métodos de la clase PartyGuestList para realizar las operaciones sobre el set
        System.out.println("¿Está Juan en la lista de invitados?: " + partyGuestList.isGuestInList("Juan"));
        System.out.println("¿Está Ana en la lista de invitados?: " + partyGuestList.isGuestInList("Ana"));

        partyGuestList.removeGuest("Maria");
        System.out.println("Número total de invitados: " + partyGuestList.getTotalGuests());
        System.out.println("¿La lista de invitados está vacía?: " + partyGuestList.isGuestListEmpty());
    }
}