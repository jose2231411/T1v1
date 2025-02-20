/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> raiz;

    public BinarySearchTree() {
        this.raiz = null;
    }

    public class Node<T> {

        T data;
        public Node left;
        public Node right;

        Node(T data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public void insert(T data) { //inserta elementos al arbol
        Node<T> n = new Node<>(data);

        if (raiz == null) {//si el arbol esta vacio convierte el elemento en la raiz
            raiz = n;
            return;
        }

        Node<T> aux = raiz;
        Node<T> padre = null;
        while (aux != null) {
            padre = aux;
            if (data.compareTo(aux.data) < 0) {//compara el elemento con la raiz si es menor
                //almacena en la izquierda
                aux = aux.left;
            } else {
                //sino a la derecha
                aux = aux.right;
            }
        }
        //mismo proceso con el siguiente elemento en el arbol
        if (data.compareTo(padre.data) < 0) {
            padre.left = n;
        } else {
            padre.right = n;
        }
    }

    public void search(T data) { //Busca un elemento dado y lo imprime en la consola
        Node<T> current = raiz;
        while (current != null) {
            int cmp = data.compareTo(current.data);
            if (cmp == 0) {
                System.out.println("Data: " + current.data);
                break;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

    }

    
    public void inOrderTraversal() {//Izquierda - Raíz - Derecha
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        Stack<Node> s = new Stack<Node>();
        Node curr = raiz;

        // traverse the tree
        while (curr != null || !s.isEmpty()) {

            // Reach the left most
            // Node of the current Node
            while (curr != null) {
                // place pointer to a tree node on
                // the stack before traversing
                // the node's left subtree
                s.push(curr);
                curr = curr.left;
            }

            // Current must be NULL at this point
            curr = s.pop();

            System.out.print("Data: " + curr.data + "; ");

            // we have visited the node and its
            // left subtree. Now, it's right
            // subtree's turn
            curr = curr.right;
        }
    }

    public void preOrderTraversal() {//Raíz - Izquierda - Derecha
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        Stack<Node> s = new Stack<Node>();
        Node curr = raiz;
        System.out.print("Data: " + curr.data + "; ");

        // traverse the tree
        while (curr != null || !s.isEmpty()) {

            // Reach the left most
            // Node of the current Node
            while (curr != null) {
                // place pointer to a tree node on
                // the stack before traversing
                // the node's left subtree
                s.push(curr);
                curr = curr.left;
            }

            // Current must be NULL at this point
            curr = s.pop();
            if (curr != raiz) {
                System.out.print("Data: " + curr.data + "; ");
            }

            // we have visited the node and its
            // left subtree. Now, it's right
            // subtree's turn
            curr = curr.right;

        }
    }

    public void postOrderTraversal() {//Izquierda - Derecha - Raíz
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        Stack<Node> s = new Stack<Node>();
        Node curr = raiz;
        // traverse the tree
        while (curr != null || !s.isEmpty()) {

            // Reach the left most
            // Node of the current Node
            while (curr != null) {
                // place pointer to a tree node on
                // the stack before traversing
                // the node's left subtree
                s.push(curr);
                curr = curr.left;
            }

            // Current must be NULL at this point
            curr = s.pop();
            if (curr != raiz) {
                System.out.print("Data: " + curr.data + "; ");
            }

            // we have visited the node and its
            // left subtree. Now, it's right
            // subtree's turn
            curr = curr.right;
        }
        System.out.print("Data: " + raiz.data + "; ");
    }
}
