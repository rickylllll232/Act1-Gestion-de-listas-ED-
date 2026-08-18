package gestordelistas;

public class DataTypeExamples {

    // Tipo de dato abstracto y complejo
    public static class Contact {
        private String name;
        private String address;
        private String phone;

        public Contact(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        public String getName() { return name; }

        @Override
        public String toString() {
            return "Contacto [Nombre: " + name + ", Dirección: " + address + ", Teléfono: " + phone + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Contact contact = (Contact) obj;
            return name.equalsIgnoreCase(contact.name);
        }
    }

    public static Integer createPrimitiveExample(int value) {
        return value; // Autoboxing de primitivo a objeto Complejo Integer
    }
    
    public static Contact createComplexExample(String n, String a, String p) {
        return new Contact(n, a, p);
    }
}
