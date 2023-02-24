package tarea.pkg2;


public class Tarea2 {

    
    public static void main(String[] args) {
        
        // 2 OBJETOS DE CADA UNA

        automovil auto1 = new automovil("terrestre", "verde", 4 , 5);
        automovil auto2 = new automovil("terrestre", "plateado", 4, 2);

        Barco barco1 = new Barco("acuático", "rojo", 0,45);
        Barco barco2 = new Barco("acuático", "rosado", 0, 12);

        Avion avion1 = new Avion("aéreo", "anaranjado", 4, 208);
        Avion avion2 = new Avion("aéreo", "azul", 4, 98);
        
        
        System.out.println("Automovil1: Tipo: " + auto1.getTipo() + ", Color: " + auto1.getColor() + ", Número de ruedas: " + auto1.getNumeroDeRuedas() + ", Número de asientos: " + auto1.getNumeroDeAsientos());
        System.out.println("Automovil2: Tipo: " + auto2.getTipo() + ", Color: " + auto2.getColor() + ", Número de ruedas: " + auto2.getNumeroDeRuedas() + ", Número de asientos: " + auto2.getNumeroDeAsientos());
        
        System.out.println("Barco1: Tipo: " + barco1.getTipo() + ", Color: " + barco1.getColor() + ", Número de ruedas: " + barco1.getNumeroDeRuedas() + ", Número de asientos: " + barco1.getNumeroDeAsientos());
        System.out.println("Barco2: Tipo: " + barco2.getTipo() + ", Color: " + barco2.getColor() + ", Número de ruedas: " + barco2.getNumeroDeRuedas() + ", Número de asientos: " + barco2.getNumeroDeAsientos());
    
        System.out.println("Avion1: Tipo: " + avion1.getTipo() + ", Color: " + avion1.getColor() + ", Número de ruedas: " + avion1.getNumeroDeRuedas() + ", Número de asientos: " + avion1.getNumeroDeAsientos());
        System.out.println("Avion2: Tipo: " + avion2.getTipo() + ", Color: " + avion2.getColor() + ", Número de ruedas: " + avion2.getNumeroDeRuedas() + ", Número de asientos: " + avion2.getNumeroDeAsientos());
    }
    
}
