/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        }

        /**
         * aqui imprime las acciones de cada animal ingresado para ver el
         * funcionamiento de cada metodo implementado tambien de los metodos
         * abstractos
         */
        System.out.println("-------------------------------------------------");
        Cobra cobr1 = new Cobra();
        System.out.println("\t\nCobra");
        cobr1.setNombre("Cobra");
        cob1.comer();
        cob1.reproducirse();
        cob1.hambre();
        System.out.println("-------------------------------------------------");

        System.out.println("-------------------------------------------------");
        TiranosaurioRex tiran1 = new TiranosaurioRex();
        System.out.println("\t\nTiranosaurioRex");
        tiran1.setNombre("Tiranosaurio Rex");
        tirano1.comer();
        tirano1.reproducirse();
        tirano1.hambre();
        System.out.println("-------------------------------------------------");

        System.out.println("-------------------------------------------------");
        Megalodon mega1 = new Megalodon();
        System.out.println("\t\nMegalodon");
        mega1.setNombre("Megalodon");
        meg1.comer();
        meg1.reproducirse();
        meg1.sangreFria();
        System.out.println("-------------------------------------------------");

        System.out.println("-------------------------------------------------");
        PezPiedra pezp1 = new PezPiedra();
        System.out.println("\t\nPezPiedra");
        pezp1.setNombre("Pez Piedra");
        pez1.comer();
        pez1.reproducirse();
        pez1.sangreFria();
        System.out.println("-------------------------------------------------");

    }
}
