package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        // Création de l'arbre binaire de recherche
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        // Test de la méthode find pour trouver la valeur 7
        Node foundNode = root.find(7);
        if (foundNode != null) {
            System.out.println("Valeur trouvée: " + foundNode.value);
        } else {
            System.out.println("Valeur non trouvée.");
        }

        // Démarrage de l'application Spring Boot
    }
}
