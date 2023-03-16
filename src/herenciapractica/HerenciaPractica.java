/*
EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un 
saludo “Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y 
sobreescriban el método hacerRuido() con el ruido que corresponda a cada uno. 
Luego, en el main vamos a crear un ArrayList de animales y los siguientes 
animales:
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la 
lista llamando al método hacerRuido() de cada ítem.
 */
package herenciapractica;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author leonardodanielalvez@gmail.com
 */
public class HerenciaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    ArrayList<Animal> Animales = new ArrayList();
    Animal a = new Animal();
    Perro b = new Perro();
    Gato c = new Gato();
    
    Animales.add(a);
    Animales.add(b);
    Animales.add(c);
    
        for (Animal Animale : Animales) {
            Animale.hacerRuido();
        }
    }
}
