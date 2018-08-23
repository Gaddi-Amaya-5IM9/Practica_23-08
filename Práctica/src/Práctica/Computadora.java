package Práctica;
/**
 *
 * @author Alumno
 */
public class Computadora {
    
    private String Marca;
    private String Modelo;
    private String Procesador;
    private int Rom;
    private int Ram;
    
    public Computadora(String Marca){
        this.Marca = Marca;
        this.Modelo ="Default";
        this.Procesador = "Default";
        this.Ram = 4;
        this.Rom = 500;
    }
    
    public Computadora(String Marca, String Modelo){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Procesador = "Default";
        this.Ram = 4;
        this.Rom = 500;
    }
    
    public Computadora(String Marca, String Modelo, String Procesador){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Procesador = Procesador;
        this.Ram = 4;
        this.Rom = 500;
    }
    
    public Computadora(String Marca, String Modelo, String Procesador, int Ram){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Procesador = Procesador;
        this.Ram = Ram;
        this.Rom = 500;
    }
    
    public Computadora(String Marca, String Modelo, String Procesador, int Rom, int Ram){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Procesador = Procesador;
        this.Ram = Ram;
        this.Rom = Rom;
    }
    
    public void Imprimir(){
        System.out.println("Marca: "+Marca);
        System.out.println("Modelo: " +Modelo);
        System.out.println("Procesador: " + Procesador);
        System.out.println("Ram: "+ Ram + "GB");
        System.out.println("Disco Duro: " + Rom + "GB");
    }
    
    
}