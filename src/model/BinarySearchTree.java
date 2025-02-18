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


    public void insert(T data) {
        Node<T> n = new Node<>(data);

        if (raiz == null) {
            raiz = n;
            return;
        }

        Node<T> aux = raiz;
        Node<T> padre = null;
        while (aux != null) {
            padre = aux;
            if (comparator.compare(data, aux.data) < 0) {
                aux = aux.left;
            } else {
                aux = aux.right;
            }
        }
        
        if (comparator.compare(data, padre.data) < 0) {
            padre.left = n;
        } else {
            padre.right = n;
        }
    }

    public void search(T data) {
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

    public void recorrer(Node n) {
        if (n != null) {
            recorrer(n.left);
            System.out.println("Data: " + n.data);
            recorrer(n.right);
        }
    }
}
