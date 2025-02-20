/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;



public class Pokemon implements Comparable<Pokemon>{

    private String name;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Pokemon() {

    }

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }


    @Override
    public String toString() {
        return name + "," + level;
    }

    @Override
    public int compareTo(Pokemon other) {
        return Integer.compare(this.level, other.level);
    }

}
