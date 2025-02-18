/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

public class BinarySearchTree<T extends Base> {

    Node<T> raiz;
    private Comparator<T> comparator;

    public BinarySearchTree() {
        this.raiz = null;
        this.comparator = comparator;
    }

  

    private class Node<T> {

        T data;
        public Node left;
        public Node right;

        Node(T data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public void insert(T data) {
        Node<T> n = new Node<T>(data);

        if (raiz == null) {
            raiz = n;
        } else {
            Node<T> aux = raiz;
            while (aux != null) {
                if (comparator.compare(data, raiz.data) < 0) {
                    aux = aux.left;
                } else if (comparator.compare(data, raiz.data) > 0) {
                    aux = aux.right;
                }
            }

        }
    }

    public void search(T data) {
        Node<T> aux = raiz;
        if (aux != null) {
            search((T) aux.left);
            System.out.println("data; " + aux.data);
            search((T) aux.right);
        }
    }
}
