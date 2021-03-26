
package programacion.ejercicioauto;
/**
 * Crear la clase Auto con los atributos marca, modelo y kilometraje,
 * elegir el tipo de dato adecuado para ellos. 
 * Además se debe crear el método estadoAuto() que depende el kilometraje muestre un mensaje:

0 km Esta nuevo
<10000km Poco usado
<100000km Usado
>100000km Bastante usado

Crear un objeto de esta clase y comprobar el funcionamiento
*/
//creo la clase auto
public class Auto {
    
    public static void main(String arg[]){
    
        String marca = "fiat";
        Integer modelo = 2010;
        Integer kilomentraje = 10000;
    
        estadoAuto Funcion = new estadoAuto(marca,modelo,kilomentraje);
        Funcion.velocidad();
    }
    
}
