package clase2;

class Main {
    public static void main(String[] args) {

        Directivo directivo = new Directivo("Juan Pablo", "Tyrlik","IT");
        System.out.println(directivo.obtenerInformacion());
        Tecnico tecnico = new Tecnico("Juan Pablo", "Tyrlik", "IT");
        System.out.println(tecnico.obtenerInformacion());
        Profesional profesional = new Profesional("Juan Pablo", "Tyrlik", "IT");
        System.out.println(profesional.obtenerInformacion());
            
        }
    }

