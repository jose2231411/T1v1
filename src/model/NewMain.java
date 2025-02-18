/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import data.Pokemon;
import java.util.Comparator;

/**
 *
 * @author Windows 10
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearchTree<Pokemon> arbol;
        arbol = new BinarySearchTree<Pokemon>(Comparator.comparingInt(Pokemon::getLevel));
        //Compara en base al nivel, es necesario dar un comparador
        Pokemon p = new Pokemon("juan", 11);
        Pokemon p1 = new Pokemon("andres", 22);
        Pokemon p2 = new Pokemon("david", 25);
        Pokemon p3 = new Pokemon("diego", 54);
        Pokemon p4 = new Pokemon("juanada", 1);
        
        arbol.insert(p);
        arbol.insert(p1);
        arbol.insert(p2);
        arbol.insert(p3);
        arbol.insert(p4);
        
        System.out.println("InOrder" + "\n");
        arbol.inOrderTraversal();
        System.out.println("\n"+ "preOrder" + "\n");
        arbol.preOrderTraversal();
        System.out.println("\n"+ "postOrder" + "\n");
        arbol.postOrderTraversal();
    }
    
}
