package org.example.palindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PalindromeApplication {

    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        String s1= "hallo";
        String s2= "radar";
        System.out.println(" pour s1 :" +p.isPalindrome(s1) );
        System.out.println(" pour s2 :" +p.isPalindrome(s2) );
        SpringApplication.run(PalindromeApplication.class, args);
    }

}
