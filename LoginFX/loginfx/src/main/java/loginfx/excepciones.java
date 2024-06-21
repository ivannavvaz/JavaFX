package loginfx;

public class excepciones {
    
    public static class numeroIncorrecto extends Exception {

        public numeroIncorrecto(String mensaje) {
    
            super(mensaje);
    
        }
    
    }
    
    public static class espacioEnBlanco extends Exception {
    
        public espacioEnBlanco(String mensaje) {
    
            super(mensaje);
    
        }
    
    }
    
    public static class caracterReservado extends Exception {
    
        public caracterReservado(String mensaje) {
    
            super(mensaje);
    
        }
    
    }

}
