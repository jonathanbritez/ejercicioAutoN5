/*
 * Crear la clase Auto con los atributos marca, modelo y kilometraje,
 * elegir el tipo de dato adecuado para ellos. 
 * Además se debe crear el método estadoAuto() que depende el kilometraje muestre un mensaje:

0 km Esta nuevo
<10000km Poco usado
<100000km Usado
>100000km Bastante usado

Crear un objeto de esta clase y comprobar el funcionamiento
 */
package programacion.ejercicioauto;


public class estadoAuto {
    
    private String Marca;
    private Integer Modelo;
    private Integer Kilometraje;
    
    
     public estadoAuto(String marca,Integer modelo,Integer kilometraje){
    
        this.Marca = marca;
        this.Modelo = modelo;
        this.Kilometraje = kilometraje;
    
    }
    
    public void velocidad(){
        if(Kilometraje == 0){
        
            System.out.println("Esta Nuevo");
        
        }else if(Kilometraje < 10000){
        
            System.out.println("Poco usado");
        
        }else if(Kilometraje < 100000){
        
            System.out.println("Usado");
        
    
        }else if(Kilometraje > 10000){
        
            System.out.println("Bastante usado");
        
        }
    }
}
