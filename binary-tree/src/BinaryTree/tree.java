/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author rivan
 */
public class tree {
    private node root;
    
    public void insert(int nilai){
        if(root == null){
            root = new node(nilai);
        }
        else {
            root.insert(nilai);
        }
    }
    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }
    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }
    public node get(int nilai){
        if(root != null){
            return root.get(nilai);
        }
        else {
            return null;
        }
    }
    public void traverseinorder(){
        if(root != null){
            root.traverseinorder();
        }
    }
    
}
