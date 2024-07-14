package org.example.palindrome;

public class Palindrome {

    public Boolean isPalindrome(String str){

        char[] characters = str.toCharArray();

        for (int i = 0 ;i<str.length()/2;i++ ){
            if (characters[i] != characters[str.length()-i-1]){
                return false;
            }
        }
        return true;
    }
}
