# -Practica-02-POO-con-Java
programacion orientada a objetos

Nombre:
Bryam Quezada 

Titulo Practica
Enlaces de clases   

Carrera:
Componutacion  

## OBJETIVO ALCANZADO:
El objetivo que alcance fue el obtener un mayor conocimiento y fortalecimiento de ideas acerca de como manejar objetos en java, e implementar conocimientos acerca de la herencia de la clase abuelo a las padres y de las padres a las hijas.

Aparte se fortalecio el conocimiento sobre el dowcasting y el instanceof .

## ACTIVIDADES DESARROLLADAS:

#*1.Crear un repositorio en GitHub con el nombre “Práctica 02 – POO con Java” *

Se creo el repositorio con los requerimientos dados en el informe.

2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).

En mi proyecto en total fueron 8 comist uno dado por cada paso que pide la gia del proyecto hasta el final

3. Crear un paquete para las clases, otro para las interfaces, otro para las pruebas.

cree 3 packages 

ec.edu.est.Clases

ec.edu.est.Interfaz

ec.edu.est.Prueba

4. Crear una jerarquía de clases de tres niveles, es decir, una clase “abuelo”, dos clases “padres” y cuatro clases “hijas” (dos de cada padre).

* en mi proyecto la clase abuelo es Carnivoro

* las clases padre son Acuatico y Terrestre

* las clases hijas son Megalodon, Pez Piedra, Cobra y TiranosaurioRex

5. Todas las clases deben tener por lo menos cuatros atributos (aparte de los de herencia), tres métodos (aparte de los getters y setters) y método toString().

Adjunto evidencia del diagrama creado en lucidchart y también muestro los cuatro atributos fuera de los de la herencia, los métodos aparte de los gettes y setters y los métodos tuString.

    @Override
    public String toString() {
        return super.toString() + "\n\tAcuatico" + "\n\tnumeroAletas=" + numeroAletas + ", \n\taguaSalada=" + aguaSalada + ", \n\tnumeroEspinas=" + numeroEspinas + ", \n\tvenenoso=" + venenoso;
    }
    
       @Override
    public String toString() {
        return super.toString() + "\n\tCobra" + "\n\tinvertebrado=" + invertebrado + ", \n\tvenenoso=" + venenoso + ", \n\tmudarPiel=" + mudarPiel + ", \n\tsensorInfrarrojo=" + sensorInfrarrojo;
    }
    
        @Override
    public String toString() {
        return super.toString() + "\n\tMegalodon" + "\n\tdepredadorSolitario=" + depredadorSolitario + ", \n\tnumeroIlerasDientes=" + numeroIlerasDientes + ", \n\tcanibal=" + canibal + ", \n\textinto=" + extinto;
    }
    
        @Override
    public String toString() {
        return super.toString() + "\n\tPezPiedra" + "\n\tcamuflaje=" + camuflaje + ", \n\tneurotoxina=" + neurotoxina + ", \n\tresisteFueraAgua=" + resisteFueraAgua + ", \n\texotico=" + exotico;
    }
    
        @Override
    public String toString() {
        return super.toString() + "\n\tTerrestre" + "\n\tnumeroGarras=" + numeroGarras + ", \n\tnumeroPatas=" + numeroPatas + ", \n\tnumeroDientesCaninos=" + numeroDientesCaninos + ", \n\tdepredadorSolitario=" + depredadorSolitario;
    }
    
        @Override
    public String toString() {
        return super.toString() + "\n\tTiranosaurioRex" + "\n\textinto=" + extinto + ", \n\talimentoCarro\u00f1o=" + alimentoCarroño + ", \n\tcapacidadSensorial=" + capacidadSensorial + ", \n\tcanibal=" + canibal;
    }
    

6. Cada clase padre debe tener por lo menos un método abstracto cada una. 

    public abstract void sangreFria();
    
        public abstract void hambre();
        

7. Los métodos abstractos deben ser sobre-escritos (implementados) en cada clase hija.

Métodos implementados en la clase hija Cobra

    @Override
    public void hambre() {
        System.out.println("La Cobra " + this.getNombre() + "\tNaja Naja" + "\tTiene hambre");
    }

    /**
     * metodo de la clase interfaz que indica comer
     */
    @Override
    public void comer() {
        System.out.println("La Cobra " + this.getNombre() + "\tNaja Naja" + " \tVa a comer");
    }

    /**
     * metodo de la clase interfaz que indica reproducirse
     */
    @Override
    public void reproducirse() {
        System.out.println("La Cobra " + this.getNombre() + "\tNaja Naja" + " \tSe va a reproducir");
    }

Métodos implementados en la clase hija Megalodon

    @Override
    public void sangreFria() {
        System.out.println("El Megalodon " + this.getNombre() + "\tGlut" + " \tEs de sangre fria");
    }

    /**
     * metodo de la clase interfaz que indica comer
     */
    @Override
    public void comer() {
        System.out.println("El Megalodon " + this.getNombre() + "\tGlut" + " \tVa a comer");
    }

    /**
     * metodo de la clase interfaz que indica reproducirse
     */
    @Override
    public void reproducirse() {
        System.out.println("El Megalodon " + this.getNombre() + "\tGlut" + " \tVa a reproducirse");
    }

Métodos implementados en la clase hija Tiranosaurio Rex

    @Override
    public void hambre() {
        System.out.println("El Tiranosaurio Rex " + this.getNombre() + "\tSpyke" + " \tTiene hambre");
    }

    /**
     * metodo de la clase interfax que indica comer
     */
    @Override
    public void comer() {
        System.out.println("El Tiranosaurio Rex " + this.getNombre() + "\tSpyke" + " \tVa a comer");
    }

    /**
     * metodo de la clase interfax que indica reproducirse
     */
    @Override
    public void reproducirse() {
        System.out.println("El Tiranosaurio Rex " + this.getNombre() + "\tSpyke" + " \tVa a reproducirse");
    }

Métodos implementados en la clase hija Pez Piedra

    @Override
    public void sangreFria() {
        System.out.println("El Pez Piedra " + this.getNombre() + "\tMemo" + " \tEs de sangre fria");
    }

    /**
     * metodo de la clase interfaz que indica comer
     */
    @Override
    public void comer() {
        System.out.println("El Pez Piedra " + this.getNombre() + "\tMemo" + " \tVa a comer");
    }

    /**
     * metodo de la clase interfax que indica reproducirse
     */
    @Override
    public void reproducirse() {
        System.out.println("La Pez Piedra " + this.getNombre() + "\tMemo" + " \tVa a reproducirse");
    }

8. Todas las clases hijas deben ser clases finales.

Evidencia de las clases hijas (Megalodon y Pez Piedra)2 por cada padre Acuatico y (TiranosaurioRex y Cobra)2 por cada clase padre Terrestre

9. Crear una interface, con al menos dos métodos abstractos. Estos métodos deben ser implementados en cada clase hija.

package ec.edu.est.Interfaz;

/**
 * En esta clase genera metodos abstractos para implementar en las clases hijas
 *
 * @author Bryam Quezada
 */
public interface Acciones {

    /**
     * declarar metodos abstractos
     */
    public abstract void comer();

    public abstract void reproducirse();

}

10. Crear una clase “Prueba”, en donde se demostrará el funcionamiento del proyecto. Además, se pide demostrar el uso de downcasting con el operador instanceof. También, se pide demostrar el uso de clases anónimas.

package ec.edu.est.Prueba;

import ec.edu.est.Clases.Carnivoro;
import ec.edu.est.Clases.Cobra;
import ec.edu.est.Clases.Megalodon;
import ec.edu.est.Clases.PezPiedra;
import ec.edu.est.Clases.TiranosaurioRex;
import java.util.ArrayList;
import java.util.List;

/**
 * en esta clase main aqui se imprime los datos de todas las clase hijas
 *
 * @author Quezada Bryam
 */
public class Main {

    public static void main(String args[]) {

        /**
         * se crea una lista Carnivoro para guardar los animales
         */
        List<Carnivoro> lista = new ArrayList<>();

        /**
         * se ingresa los datos de cada clase hija en esta caso 2 por cada clase
         */
        Megalodon meg1 = new Megalodon("Acuatico", "Huevo", "Macho", "Zoofago", 6, true, 0, true, true, 4, true, true);
        Cobra cob1 = new Cobra("Terrestre", "Huevo", "Macho", "Zoofago", 0, 0, 0, true, true, true, true, true);
        PezPiedra pez1 = new PezPiedra("Acuatico", "Huevo", "Macho", "Zoofago", 8, true, 6, true, true, true, true, true);
        TiranosaurioRex tirano1 = new TiranosaurioRex("Terrestre", "Huevo", "Macho", "Zoofago", 12, 2, 54, true, true, true, true, true);

        /**
         * se los guarda en una lista
         */
        lista.add(pez1);
        lista.add(meg1);
        lista.add(cob1);
        lista.add(tirano1);

        /**
         * se recorre la lista tambien se hace el casting y el instanceof para
         * saber a que clase hija pertenece y se imprime
         */
        for (Carnivoro carnivoro : lista) {
            if (carnivoro instanceof PezPiedra) {
                PezPiedra temp = (PezPiedra) carnivoro;
                System.out.println("Pez Piedra: " + temp);
                System.out.println("-----------------------------------------");
            } else if (carnivoro instanceof Megalodon) {
                Megalodon temp = (Megalodon) carnivoro;
                System.out.println("Megalodon: " + temp);
                System.out.println("-----------------------------------------");
            } else if (carnivoro instanceof Cobra) {
                Cobra temp = (Cobra) carnivoro;
                System.out.println("Cobra: " + temp);
                System.out.println("-----------------------------------------");
            } else if (carnivoro instanceof TiranosaurioRex) {
                TiranosaurioRex temp = (TiranosaurioRex) carnivoro;
                System.out.println("Tiranosaurio Rex: " + temp);
                System.out.println("-----------------------------------------");
            }
        /**
         * creacion de la clase anonimo 
         */
        
        Carnivoro anonimo = new Carnivoro("Cocodrilo", "Huevo", "Macho", "Zoofago");
        System.out.println(anonimo);
        }



        /**
         * aqui imprime las acciones de cada animal ingresado para ver el
         * funcionamiento de cada metodo implementado tambien de los metodos
         * abstractos
         */
        System.out.println("-------------------------------------------------");
        Cobra cobr1 = new Cobra();
        System.out.println("\t\tCobra");
        cobr1.setNombre("Cobra");
        cob1.comer();
        cob1.reproducirse();
        cob1.hambre();
        System.out.println("-------------------------------------------------");

        System.out.println("-------------------------------------------------");
        TiranosaurioRex tiran1 = new TiranosaurioRex();
        System.out.println("\t\tTiranosaurioRex");
        tiran1.setNombre("Tiranosaurio Rex");
        tirano1.comer();
        tirano1.reproducirse();
        tirano1.hambre();
        System.out.println("-------------------------------------------------");

        System.out.println("-------------------------------------------------");
        Megalodon mega1 = new Megalodon();
        System.out.println("\t\tMegalodon");
        mega1.setNombre("Megalodon");
        meg1.comer();
        meg1.reproducirse();
        meg1.sangreFria();
        System.out.println("-------------------------------------------------");

        System.out.println("-------------------------------------------------");
        PezPiedra pezp1 = new PezPiedra();
        System.out.println("\t\tPezPiedra");
        pezp1.setNombre("Pez Piedra");
        pez1.comer();
        pez1.reproducirse();
        pez1.sangreFria();
        System.out.println("-------------------------------------------------");

    }
}

*GitHub*

*Perfil*
bryamquez

URL del perfil: https://github.com/bryamquezadasagbaicela

URL del proyecto: https://github.com/bryamquezadasagbaicela/-Practica-02-POO-con-Java 	

# CONCLUSIONES:

Como conclusión final me atrevo a decir que la herramienta de herencia es muy útil ya que asi nos ahorramos tiempo al tener que repetir muchos atributos al igual que los métodos abstractos ya que al declararlos en la clase padre los podemos utilizar en las clases hijas.

El downcasting y el instanceof también me parecen muy útiles para poder guardar todos los objetos en una lista de la clase padre y con el instanceof me sirvió para poder guardar todos los objetos de una lista de la clase padre.

Para terminar mi conclusión puedo decir que realizar proyectos de esta manera es más efectiva y más fácil de comprensión.

# RECOMENDACIONES:

Es mucho más factible la implementación por herencia para realizar proyectos al igual que los métodos abstractos ya que de esta manera nos ahorramos el tiempo de repetir muchos atributos y al realizar por herencia incluso el código se reduce y no sale muy extenso.
