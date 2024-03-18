// se colocan las librerias creadas 
import librerias.Suma;
import librerias.Tablas;
import librerias.Triangulo;
public class probando {
     
    public static void main(String [] args ){
    Suma a=new Suma();
    Tablas b=new Tablas();
    Triangulo c=new Triangulo();
    
    // colocamos la identidad del metodo para llamar 
        System.out.println("la suma de los numeros es: "+a.sum(1, 6));
        System.out.println(b.tabla_de_multiplicar(5));
        System.out.println("el areaa del triangulo es: ´"+c.area_del_triangulo(4, 6));
    
    }
}
