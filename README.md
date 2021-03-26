# ejercicio_2


public class Auto {
    
    public static void main(String arg[]){
    
        String marca = "fiat";
        Integer modelo = 2010;
        Integer kilomentraje = 10000;
    
        estadoAuto Funcion = new estadoAuto(marca,modelo,kilomentraje);
        Funcion.velocidad();
    }
    
}



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
