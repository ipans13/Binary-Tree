/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author rivan
 */
public class node {

    private int data;
    private node bagiankiri;
    private node bagiankanan;

    public node(int data) {
        this.data = data;
    }

    public void insert(int nilai) {
        if (nilai == data) {
            return;
        }
        if (nilai < data) {
            if (bagiankiri == null) {
                bagiankiri = new node(nilai);
            } else {
                bagiankiri.insert(nilai);
            }
        } else {
            if (bagiankanan == null) {
                bagiankanan = new node(nilai);
            } else {
                bagiankanan.insert(nilai);
            }
        }
    }

    public node get(int nilai) {
        if (nilai == data) {
            return this;
        }
        if (nilai < data) {
            if (bagiankiri != null) {
                return bagiankiri.get(nilai);
            }

        } else {
            if (bagiankanan != null) {
                return bagiankanan.get(nilai);
            }
        }
        return null;
    }

    public int min() {
        if (bagiankiri == null) {
            return data;
        } else {
            return bagiankiri.min();
        }
    }

    public int max() {
        if (bagiankanan == null) {
            return data;
        } else {
            return bagiankanan.max();
        }
    }

    public void traverseinorder() {
        if (bagiankiri != null) {
            bagiankiri.traverseinorder();
        }
        System.out.print(data + ", ");
        if (bagiankanan != null) {
            bagiankanan.traverseinorder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public node getBagiankiri() {
        return bagiankiri;
    }

    public void setBagiankiri(node bagiankiri) {
        this.bagiankiri = bagiankiri;
    }

    public node getBagiankanan() {
        return bagiankanan;
    }

    public void setBagiankanan(node bagiankanan) {
        this.bagiankanan = bagiankanan;
    }

    @Override
    public String toString() {
        return "data=" + data;
    }

}
