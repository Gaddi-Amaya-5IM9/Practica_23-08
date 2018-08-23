package Práctica;

/**
 *
 * @author Alumno
 */
public abstract class ComputadoraAbs {
    
    
    public void encender(boolean encendido){
        
        if(encendido == true){
            System.out.println("La computadora está encendida");
        }
        else
            if(encendido == false){
                System.out.println("La computadora está apagada");
            }
        
    }
    
    public void Escuchar_musica(String cancion){
        System.out.println("Está reproduciendo la cancion: " + cancion);
    }
    
    public void Ver_videos(String video){
        System.out.println("Está viendo el video: " + video);
    }
    
    public abstract void apagar();
    
    public abstract void Ejecutar_juegos();
    
    
    
}
