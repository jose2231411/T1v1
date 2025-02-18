/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import data.Pokemon;

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

        arbol = new BinarySearchTree();
        Pokemon p = new Pokemon("juan", 11);
        Pokemon p1 = new Pokemon("andres", 22);
        Pokemon p2 = new Pokemon("david", 25);
        Pokemon p3 = new Pokemon("diego", 54);

        arbol.insert(p);
        arbol.insert(p1);
        arbol.insert(p2);
        arbol.insert(p3);
        
        arbol.search(p);

    }

}
