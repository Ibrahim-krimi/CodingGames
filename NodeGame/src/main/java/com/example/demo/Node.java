package com.example.demo;

public class Node {
    Node left,right;
    int value;

    public Node(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
    public Node find(int v) {
        Node node = this;  // Commencez avec le nœud actuel (la racine du sous-arbre)

        while (node != null) {
            if (node.value == v) {
                return node;  // La valeur est trouvée, retournez le nœud
            } else {
                node = (v < node.value) ? node.left : node.right;  // Mettez à jour le nœud en fonction de sa valeur
            }
        }

        return null;  // Si le nœud est null, cela signifie que la valeur n'a pas été trouvée
    }

}
