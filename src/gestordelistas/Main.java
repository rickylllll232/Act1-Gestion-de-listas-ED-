import java.util.Scanner; // Importación específica y permitida, sin asterisco (*)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables para manejar las listas según la elección
        LinkedList<DataTypeExamples.Contact> normalList = null;
        DoublyLinkedList<DataTypeExamples.Contact> doubleList = null;
        boolean isDouble = false;
        
        boolean exit = false;

        System.out.println("Bienvenido al Gestor de Listas Enlazadas");
        System.out.println("Seleccione el tipo de lista a crear para el Gestor de Contactos:");
        System.out.println("1. Simplemente Enlazada\n2. Doblemente Enlazada\n3. Circular");
        
        int listChoice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        String listType = "SIMPLE";
        if (listChoice == 2) {
            listType = "DOBLE";
            isDouble = true;
            doubleList = new DoublyLinkedList<>();
        } else if (listChoice == 3) {
            listType = "CIRCULAR";
            normalList = new LinkedList<>(listType);
        } else {
            normalList = new LinkedList<>(listType);
        }

        while (!exit) {
            System.out.println("\n--- MENÚ PRINCIPAL (" + listType + ") ---");
            System.out.println("1. Insertar Contacto");
            System.out.println("2. Eliminar Contacto");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Mostrar todos los Contactos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("Ingrese Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese Dirección: ");
                    String address = scanner.nextLine();
                    System.out.print("Ingrese Teléfono: ");
                    String phone = scanner.nextLine();
                    
                    DataTypeExamples.Contact newContact = DataTypeExamples.createComplexExample(name, address, phone);
                    
                    if (isDouble) doubleList.insert(newContact);
                    else normalList.insert(newContact);
                    break;
                    
                case 2:
                    System.out.print("Ingrese el Nombre del contacto a eliminar: ");
                    String delName = scanner.nextLine();
                    DataTypeExamples.Contact delContact = new DataTypeExamples.Contact(delName, "", "");
                    
                    if (isDouble) doubleList.delete(delContact);
                    else normalList.delete(delContact);
                    break;
                    
                case 3:
                    System.out.print("Ingrese el Nombre del contacto a buscar: ");
                    String searchName = scanner.nextLine();
                    DataTypeExamples.Contact searchContact = new DataTypeExamples.Contact(searchName, "", "");
                    
                    boolean found = isDouble ? doubleList.search(searchContact) : normalList.search(searchContact);
                    
                    if (found) System.out.println("El contacto SÍ existe en la lista.");
                    else System.out.println("El contacto NO existe en la lista.");
                    break;
                    
                case 4:
                    if (isDouble) doubleList.display();
                    else normalList.display();
                    break;
                    
                case 5:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}