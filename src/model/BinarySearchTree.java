/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

public class BinarySearchTree<T extends Base> {

    Node<T> raiz;
    private Comparator<T> comparator;

    public BinarySearchTree(Comparator<T> comparator) {
        this.raiz = null;
        this.comparator = comparator;
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
            if (comparator.compare(data, aux.data) < 0) {//compara el elemento con la raiz si es menor
                //almacena en la izquierda
                aux = aux.left;
            } else {
                //sino a la derecha
                aux = aux.right;
            }
        }
        //mismo proceso con el siguiente elemento en el arbol
        if (comparator.compare(data, padre.data) < 0) {
            padre.left = n;
        } else {
            padre.right = n;
        }
    }

    public void search(T data) { //Busca un elemento dado y lo imprime en la consola
        Node<T> current = raiz;
        while (current != null) {
            int cmp = comparator.compare(data, current.data);
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
        inOrder(raiz);
    }

    public void inOrder(Node<T> n) {
        if (n != null) {
            inOrder(n.left);
            System.out.println("Data: " + n.data);
            inOrder(n.right);
        }
    }

    public void preOrderTraversal() {//Raíz - Izquierda - Derecha
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        preOrder(raiz);
    }

    private void preOrder(Node<T> n) {
        if (n != null) {
            System.out.println("Data: " + n.data);
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void postOrderTraversal() {//Izquierda - Derecha - Raíz
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        postOrder(raiz);
    }

    private void postOrder(Node<T> n) {
        if (n != null) {
            postOrder(n.left);
            postOrder(n.right);
            System.out.println("Data: " + n.data);
        }
    }
}
