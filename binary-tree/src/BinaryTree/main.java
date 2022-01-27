/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author rivan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       tree BTree = new tree();
	BTree.insert(15);
	BTree.insert(10);
	BTree.insert(40);
	BTree.insert(35);
	BTree.insert(52);
        BTree.insert(29);
        BTree.insert(26);
        BTree.insert(72);
        BTree.insert(24);

        BTree.traverseinorder();

        System.out.println(BTree.get(24));
        System.out.println(BTree.get(52));
        System.out.println(BTree.get(40));
        System.out.println(BTree.max());
        System.out.println(BTree.min());
    }
    
}
